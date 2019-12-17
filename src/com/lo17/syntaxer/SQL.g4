grammar SQL;

requete returns [Arbre arbre = new Arbre("requete")] :
    var_select=select { $arbre.ajouteFils($var_select.arbre); }
    var_params=params { $arbre.ajouteFils($var_params.arbre); }
    POINT?
;

select returns [Arbre arbre = new Arbre("select")] :
	(
		SELECT
		(
			SELECT_FICHIER { $arbre.ajouteFils(new Arbre("", "fichier")); }
			|
			SELECT_NUMERO { $arbre.ajouteFils(new Arbre("", "numero")); }
			|
			DATE { $arbre.ajouteFils(new Arbre("", "date")); }
			|
			RUBRIQUE { $arbre.ajouteFils(new Arbre("", "rubrique")); }
		)
		(
			CONJ_AND
			(
				SELECT_FICHIER { $arbre.ajouteFils(new Arbre("", ", fichier")); }
				|
				SELECT_NUMERO { $arbre.ajouteFils(new Arbre("", ", numero")); }
				|
				DATE { $arbre.ajouteFils(new Arbre("", ", date")); }
				|
				RUBRIQUE { $arbre.ajouteFils(new Arbre("", "rubrique")); }
			)
		)*
	)
	|
	SELECT_SHORT_DATE { $arbre.ajouteFils(new Arbre("", "date")); }
	|
	(
		COUNT
		(
			SELECT_FICHIER { $arbre.ajouteFils(new Arbre("", "count(fichier)")); }
			|
			SELECT_NUMERO { $arbre.ajouteFils(new Arbre("", "count(numero)")); }
			|
			RUBRIQUE { $arbre.ajouteFils(new Arbre("", "count(rubrique)")); }
		)
	)
;

params returns [Arbre arbre = new Arbre("params")] :
    par1=param {
        $arbre.ajouteFils($par1.arbre);
    }
    (
        (
            conj1=conj {
                $arbre.ajouteFils($conj1.arbre);
            }
        )?
        par2=param {
            $arbre.ajouteFils($par2.arbre);
        }
    )*
;

param returns [Arbre arbre = new Arbre("param")] :
	(
		MOT_TEXTE
		MOT? {
			$arbre.ajouteFils(new Arbre("table", "texte"));
		}
		var_mot_1 = VAR_MOT { $arbre.ajouteFils(new Arbre("mot=", "'"+$var_mot_1.getText()+"'")); }
		(
			conj1 = conj { $arbre.ajouteFils($conj1.arbre); }
			var_mot_2 = VAR_MOT { $arbre.ajouteFils(new Arbre("mot=", "'"+$var_mot_2.getText()+"'")); }
		)*
	)
	|
	(
		MOT_TITRE
		MOT? {
			$arbre.ajouteFils(new Arbre("table", "titre"));
		}
		var_mot_1 = VAR_MOT { $arbre.ajouteFils(new Arbre("mot=", "'"+$var_mot_1.getText()+"'")); }
		(
			conj1 = conj { $arbre.ajouteFils($conj1.arbre); }
			var_mot_2 = VAR_MOT { $arbre.ajouteFils(new Arbre("mot=", "'"+$var_mot_2.getText()+"'")); }
		)*
	)
	|
	(
        MOT { $arbre.ajouteFils(new Arbre("table", "titretexte")); }
        var_mot_1=VAR_MOT {
            $arbre.ajouteFils(new Arbre("mot=", "'" + $var_mot_1.getText() + "'"));
        }
        (
            conj1=conj { $arbre.ajouteFils($conj1.arbre); }
            var_mot_2=VAR_MOT {
                $arbre.ajouteFils(new Arbre("mot=", "'" + $var_mot_2.getText() + "'"));
            }
        )*
    )
	|
	(
		RUBRIQUE { $arbre.ajouteFils(new Arbre("table", "rubrique")); }
		var_rubrique_1 = VAR_MOT { $arbre.ajouteFils(new Arbre("rubrique=", "'"+$var_rubrique_1.getText()+"'")); }
		(
			conj1 = conj { $arbre.ajouteFils($conj1.arbre); }
			var_rubrique_1 = VAR_MOT { $arbre.ajouteFils(new Arbre("rubrique=", "'"+$var_rubrique_1.getText()+"'")); }
		)*
	)
	|
	(
		DATE
		{
			$arbre.ajouteFils(new Arbre("table", "date"));
		}
		var_date_1 = var_date { $arbre.ajouteFils($var_date_1.arbre); }
		(
			conj1 = conj { $arbre.ajouteFils($conj1.arbre); }
			var_date_2 = var_date { $arbre.ajouteFils($var_date_2.arbre); }
		)*
	)
	|
	(
		(
			DATE_TO {
				$arbre.ajouteFils(new Arbre("table", "date"));
				$arbre.ajouteFils(new Arbre("comp", "<="));
			}
			|
			DATE_BEFORE {
				$arbre.ajouteFils(new Arbre("table", "date"));
				$arbre.ajouteFils(new Arbre("comp", "<"));
			}
			|
			DATE_FROM {
				$arbre.ajouteFils(new Arbre("table", "date"));
				$arbre.ajouteFils(new Arbre("comp", ">="));
			}
			|
			DATE_AFTER {
				$arbre.ajouteFils(new Arbre("table", "date"));
				$arbre.ajouteFils(new Arbre("comp", ">"));
			}
		)
		var_date_1 = var_date {
			$arbre.ajouteFils($var_date_1.arbre);
		}
	)
	|
	(
		var_date_comp = DATE_BETWEEN
		var_date_1 = var_date
		CONJ_AND
		var_date_2 = var_date
		{
			$arbre.ajouteFils(new Arbre("table", "date"));
			$arbre.ajouteFils(new Arbre("comp", ">="));
			$arbre.ajouteFils($var_date_1.arbre);
			$arbre.ajouteFils(new Arbre("", "and"));
			$arbre.ajouteFils(new Arbre("comp", "<"));
			$arbre.ajouteFils($var_date_2.arbre);
		}
	)
;

conj returns [Arbre arbre = new Arbre("conj")] :
	CONJ_OR
	{
		$arbre.ajouteFils(new Arbre("", "or"));
	}
	|
	CONJ_AND
	{
		$arbre.ajouteFils(new Arbre("", "and"));
	}
;

var_date returns [Arbre arbre = new Arbre("var_date")] :
	(
		var1 = VAR_ANNEE
		{
			$arbre.ajouteFils(new Arbre("annee=", "'" + $var1.getText() + "'"));
		}
	)
	|
	(
		(
			var1 = VAR_JOUR
			{
				$arbre.ajouteFils(new Arbre("jour=", "'"+$var1.getText()+"'"));
			}
		)?
		(
			VAR_MOIS_JANVIER { $arbre.ajouteFils(new Arbre("mois=", "'01'")); }
			|
			VAR_MOIS_FEVRIER { $arbre.ajouteFils(new Arbre("mois=", "'02'")); }
			|
			VAR_MOIS_MARS { $arbre.ajouteFils(new Arbre("mois=", "'03'")); }
			|
			VAR_MOIS_AVRIL { $arbre.ajouteFils(new Arbre("mois=", "'04'")); }
			|
			VAR_MOIS_MAI { $arbre.ajouteFils(new Arbre("mois=", "'05'")); }
			|
			VAR_MOIS_JUIN { $arbre.ajouteFils(new Arbre("mois=", "'06'")); }
			|
			VAR_MOIS_JUILLET { $arbre.ajouteFils(new Arbre("mois=", "'07'")); }
			|
			VAR_MOIS_AOUT { $arbre.ajouteFils(new Arbre("mois=", "'08'")); }
			|
			VAR_MOIS_SEPTEMBRE { $arbre.ajouteFils(new Arbre("mois=", "'09'")); }
			|
			VAR_MOIS_OCTOBRE { $arbre.ajouteFils(new Arbre("mois=", "'10'")); }
			|
			VAR_MOIS_NOVEMBRE { $arbre.ajouteFils(new Arbre("mois=", "'11'")); }
			|
			VAR_MOIS_DECEMBRE { $arbre.ajouteFils(new Arbre("mois=", "'12'")); }
		)
		var1 = VAR_ANNEE
		{
			$arbre.ajouteFils(new Arbre("annee=", "'"+$var1.getText()+"'"));
		}
	)
	|
	(	// Dans le post-traitement, si l'on détecte 'date =', on viendra séparer en trois
		// élements : annne = , mois =, jour =
		var1 = VAR_DATE
		{
			$arbre.ajouteFils(new Arbre("date=", "'"+$var1.getText()+"'"));
		}
	)
;

SELECT : 'vouloir' | 'quels' | 'quel';

SELECT_FICHIER : 'fichier';

SELECT_NUMERO : 'bulletin';

SELECT_SHORT_DATE : 'quand';

COUNT: 'combien';

CONJ_OR : 'ou';

CONJ_AND : 'et' | ',';

// Titre ou texte
MOT : 'mot' | 'contenir' | 'parler';
MOT_TITRE : 'titre';
MOT_TEXTE : 'texte';

RUBRIQUE: 'rubrique';

DATE : 'date';
DATE_TO : 'jusque'; // <=
DATE_BEFORE : 'avant'; // <
DATE_FROM : 'depuis'; // >=
DATE_AFTER : 'apres'; // >
DATE_BETWEEN : 'entre'; // >= and <

VAR_JOUR	: ('0'..'9') ('0'..'9')?;
VAR_ANNEE	: ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9');
VAR_DATE	: VAR_JOUR'/'VAR_JOUR'/'VAR_ANNEE;
VAR_MOIS_JANVIER: 'janvier';
VAR_MOIS_FEVRIER : 'février';
VAR_MOIS_MARS : 'mars';
VAR_MOIS_AVRIL : 'avril';
VAR_MOIS_MAI : 'mai';
VAR_MOIS_JUIN : 'juin';
VAR_MOIS_JUILLET : 'juillet';
VAR_MOIS_AOUT : 'août';
VAR_MOIS_SEPTEMBRE : 'septembre';
VAR_MOIS_OCTOBRE : 'octobre';
VAR_MOIS_NOVEMBRE : 'novembre';
VAR_MOIS_DECEMBRE : 'décembre';

VAR_MOT     : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+;

WS  : [ \t\r\n]+ -> skip;

POINT : '.' | '?' | '!';