package com.lo17.syntaxer;

public class Arbre {
    Arbre fils = null;
    Arbre frere = null;
    String categorie;
    String mot;

    Arbre(String categorie, String mot) {
        this.categorie = categorie ;
        this.mot = mot ;
    }

    Arbre(String categorie) {
        this.categorie = categorie ;
        this.mot = "" ;
    }

    void ajouteFils(Arbre a) {
        if (fils == null)
            fils = a;
        else
            fils.ajouteFrere(a);
    }

    private void ajouteFrere(Arbre a) {
        Arbre tmp = frere ;
        if (frere == null)
            frere = a;
        else {
            while (tmp.frere != null)
                tmp = tmp.frere ;
            tmp.frere = a;
        }
    }

    public String toString() {
        String result = "";

        if (fils == null) {
            result += categorie + " " + mot + " ";
        } else {
            result += fils.toString();
        }

        if (frere != null) {
            result += frere.toString();
        }

        return result;
    }
}
