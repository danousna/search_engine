package com.lo17.syntaxer;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.*;

public class SyntaxParser {
    private String dateCompParser(String comp, Arbre param) throws Exception {
        String[] date = new String[3];
        Arbre _param = param;

        if (_param.categorie.equals("date=")) {
            // Enlever le premier et dernier char car il y a un " ' ".
            String _value = _param.mot.substring(1, _param.mot.length() - 1);
            date = _value.split("\\/");
        } else {
            // Si la date est déjà séparée, on parcourt juste les freres (jour=, mois=, annee=).
            do {
                if (_param.categorie.equals("jour=")) {
                    date[0] = _param.mot;
                } else if (_param.categorie.equals("mois=")) {
                    date[1] = _param.mot;
                } else if (_param.categorie.equals("annee=")) {
                    date[2] = _param.mot;
                }

                _param = _param.frere;
            } while (_param != null);
        }

        // on a forcément l'info de l'année selon notre grammaire.
        String result = String.format("((annee%s'%s')", comp, date[2]);
        if (date[1] != null) {
            result += String.format(" or (annee='%s' and mois%s'%s')", date[2], comp, date[1]);
        }
        if (date[0] != null) {
            result += String.format(" or (annee='%s' and mois='%s' and jour%s'%s')", date[2], date[1], comp, date[0]);
        }

        result += ")";

        return result;
    }

    private String postProcessing(SQLParser parser) throws Exception {
        String selects = "";
        String tables = " from ";
        String params = "";
        Map<Arbre, String> paramMotMap = new LinkedHashMap<>();

        Arbre tree = parser.requete().arbre.fils;

        while (tree != null) {
            if (tree.categorie.equals("select")) {
                Arbre fils = tree.fils;
                do {
                    selects += fils.mot;
                    fils = fils.frere;
                } while (fils != null);
            }
            else if (tree.categorie.equals("params")) {
                Arbre fils = tree.fils;
                String firstTableName = "";
                String compName = null;

                do {
                    if (fils.categorie.equals("param")) {
                        Arbre param = fils.fils;
                        String currentTableName = "";

                        do {
                            if (param.categorie.equals("table")) {
                                currentTableName = param.mot;

                                if (firstTableName == "") {
                                    firstTableName = param.mot;
                                    tables += param.mot;

                                    // We know that almost all tables have these three columns (TODO: handle those that don't)
                                    // so the table that is referenced for these "confusing" columns is the first one.
                                    selects = selects.replace("numero", param.mot + ".numero");
                                    selects = selects.replace("rubrique", param.mot + ".rubrique");
                                    selects = selects.replace("fichier", param.mot + ".fichier");
                                } else {
                                    tables += String.format(
                                            " inner join %s on (%s.fichier = %s.fichier)",
                                            param.mot,
                                            firstTableName,
                                            param.mot
                                    );
                                }
                            } else if (param.categorie.equals("conj")) {
                                params += " " + param.mot + " ";
                            } else if (param.categorie.equals("comp")) {
                                // On stocke le comparateur pour ensuite le traiter au prochain fils de catégorie var_date.
                                compName = param.mot;
                            } else if (param.categorie.equals("var_date")) {
                                Arbre paramDate = param.fils;

                                if (compName != null) {
                                    // Parsing special de la date.
                                    params += dateCompParser(compName, paramDate);
                                    compName = null;
                                } else {
                                    // Si la date est en format complet, il faut la parser.
                                    if (paramDate.categorie.equals("date=")) {
                                        String[] components = paramDate.mot.split("\\/");
                                        params += "jour=" + components[0] + "' and mois='" + components[1] + "' and annee='" + components[2];
                                    } else {
                                        // Si la date est déjà séparée, on parcourt juste les freres (jour=, mois=, annee=).
                                        do {
                                            params += paramDate.categorie + paramDate.mot;
                                            paramDate = paramDate.frere;

                                            // Si c'est le dernier fils, on ajoute pas de "and".
                                            if (paramDate != null) {
                                                params += " and ";
                                            }
                                        } while (paramDate != null);
                                    }
                                }
                            }
                            else if (param.categorie.equals("mot=")) {
                                String joinType = "";
                                if (param.frere != null && param.frere.categorie.equals("conj")) {
                                    if (param.frere.fils.mot.equals("and")) {
                                        joinType = " intersect ";
                                    }
                                    if (param.frere.fils.mot.equals("or")) {
                                        joinType = " union ";
                                    }
                                }
                                Arbre changedParam = new Arbre(joinType, param.mot);
                                paramMotMap.put(changedParam, currentTableName);
                            }
                            else {
                                params += currentTableName + "." + param.categorie + param.mot;
                            }

                            param = param.frere;
                        } while (param != null);
                    } else if (fils.categorie.equals("conj")) {
                        params += " " + fils.fils.mot + " ";
                    }

                    fils = fils.frere;
                } while (fils != null);
            }

            tree = tree.frere;
        }

        selects = "select " + selects;

        if (!params.equals("") || paramMotMap.size() > 0) {
            params = " where " + params;
        }

        String query = selects + tables + params;

        // Intersect word processing.
        if (paramMotMap.size() > 0) {
            StringBuilder finalQuery = new StringBuilder();
            for (Map.Entry<Arbre, String> entry : paramMotMap.entrySet()) {
                finalQuery
                        .append(query)
                        .append(entry.getValue())
                        .append(".mot=")
                        .append(entry.getKey().mot)
                        .append(entry.getKey().categorie);
            }
            return finalQuery.toString() + ";";
        }

        return query + ";";
    }

    public String process(String request) throws Exception {
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(request));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);

        return postProcessing(parser);
    }
}
