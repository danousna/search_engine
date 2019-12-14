grammar sql;

SELECT : 'vouloir' | 'quels' | 'quel';

SELECT_ARTICLE : 'article';

SELECT_BULLETIN : 'bulletin';

SELECT_DATE : 'date';

SELECT_SHORT_DATE : 'quand';

COUNT: 'combien';

CONJ_OR : 'ou';

CONJ_AND : 'et' | ',';

MOT : 'mot' | 'contenir' | 'parler';

RUBRIQUE: 'rubrique';

DATE : 'datant';
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

VAR_MOT 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+;

WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' ;

POINT : '.';

requete returns [Arbre arbre_requete = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		sl = select 
			{
				arbre_requete.ajouteFils(sl);
			} 
		
		ps = params 
			{
				arbre_requete.ajouteFils(ps);
			}
		POINT?
;

select returns [Arbre arbre_select = new Arbre("select")] :
	(
		SELECT
		(
			SELECT_ARTICLE { arbre_select.ajouteFils(new Arbre("", "fichier")); }
			|
			SELECT_BULLETIN { arbre_select.ajouteFils(new Arbre("", "numero")); }
			|
			SELECT_DATE { arbre_select.ajouteFils(new Arbre("", "date")); }
			|
			RUBRIQUE { arbre_select.ajouteFils(new Arbre("", "rubrique")); }
		)
		(
			CONJ_AND
			(
				SELECT_ARTICLE { arbre_select.ajouteFils(new Arbre("", ", fichier")); }
				|
				SELECT_BULLETIN { arbre_select.ajouteFils(new Arbre("", ", numero")); }
				|
				SELECT_DATE { arbre_select.ajouteFils(new Arbre("", ", date")); }
				|
				RUBRIQUE { arbre_select.ajouteFils(new Arbre("", "rubrique")); }
			)
		)*
	)
	|
	SELECT_SHORT_DATE { arbre_select.ajouteFils(new Arbre("", "date")); }
	|
	(
		COUNT 
		(
			SELECT_ARTICLE { arbre_select.ajouteFils(new Arbre("", "count(fichier)")); }
			|
			SELECT_BULLETIN { arbre_select.ajouteFils(new Arbre("", "count(numero)")); }
			| 
			RUBRIQUE { arbre_select.ajouteFils(new Arbre("", "count(rubrique)")); }
		)
	)
;

params returns [Arbre arbre_params = new Arbre("params")]
	@init {Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				arbre_params.ajouteFils(par1);
			}
		(
			(
				conj1 = conj { //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
					arbre_params.ajouteFils(conj1);
				}
			)?
			par2 = param
			{
				arbre_params.ajouteFils(par2);
			}
		)*
;

param returns [Arbre arbre_param = new Arbre("param")] :
	(
		MOT { arbre_param.ajouteFils(new Arbre("table", "texte")); }
		var_mot_1 = VAR_MOT { arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); }
		(
			conj1 = conj { arbre_param.ajouteFils(conj1); }
			var_mot_2 = VAR_MOT { arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); }
		)*
	)
	|
	(
		RUBRIQUE { arbre_param.ajouteFils(new Arbre("table", "rubrique")); }
		var_rubrique_1 = VAR_MOT { arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); }
		(
			conj1 = conj { arbre_param.ajouteFils(conj1); }
			var_rubrique_1 = VAR_MOT { arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); }
		)*
	)
	|
	(
		DATE
		{
			arbre_param.ajouteFils(new Arbre("table", "date"));
		}
		var_date_1 = var_date { arbre_param.ajouteFils(var_date_1); }
		(
			conj1 = conj { arbre_param.ajouteFils(conj1); }
			var_date_2 = var_date { arbre_param.ajouteFils(var_date_2); }
		)*
	)
	|
	(
		(
			DATE_TO {
				arbre_param.ajouteFils(new Arbre("table", "date"));
				arbre_param.ajouteFils(new Arbre("comp", "<="));
			}
			|
			DATE_BEFORE {
				arbre_param.ajouteFils(new Arbre("table", "date"));
				arbre_param.ajouteFils(new Arbre("comp", "<"));
			}
			|
			DATE_FROM {
				arbre_param.ajouteFils(new Arbre("table", "date"));
				arbre_param.ajouteFils(new Arbre("comp", ">="));
			}
			|
			DATE_AFTER {
				arbre_param.ajouteFils(new Arbre("table", "date"));
				arbre_param.ajouteFils(new Arbre("comp", ">"));
			}
		)
		var_date_1 = var_date {
			arbre_param.ajouteFils(var_date_1);
		}
	)
	|
	(
		var_date_comp = DATE_BETWEEN 
		var_date_1 = var_date
		CONJ_AND
		var_date_2 = var_date
		{
			arbre_param.ajouteFils(new Arbre("table", "date"));
			arbre_param.ajouteFils(new Arbre("comp", ">="));
			arbre_param.ajouteFils(var_date_1);
			arbre_param.ajouteFils(new Arbre("", "and"));
			arbre_param.ajouteFils(new Arbre("comp", "<"));
			arbre_param.ajouteFils(var_date_2);
		}
	)
;

conj returns [Arbre arbre_conj = new Arbre("conj")] :
	CONJ_OR
	{
		arbre_conj.ajouteFils(new Arbre("", "or"));
	}
	|
	CONJ_AND
	{
		arbre_conj.ajouteFils(new Arbre("", "and"));
	}
;

var_date returns [Arbre arbre_var = new Arbre("var_date")] :
	(
		var1 = VAR_ANNEE
		{ 
			arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
		}
	)
	|
	(
		(
			var1 = VAR_JOUR
			{
				arbre_var.ajouteFils(new Arbre("jour=", "'"+var1.getText()+"'"));
			}
		)?
		(
			VAR_MOIS_JANVIER { arbre_var.ajouteFils(new Arbre("mois=", "'01'")); }
			| 
			VAR_MOIS_FEVRIER { arbre_var.ajouteFils(new Arbre("mois=", "'02'")); }
			| 
			VAR_MOIS_MARS { arbre_var.ajouteFils(new Arbre("mois=", "'03'")); }
			| 
			VAR_MOIS_AVRIL { arbre_var.ajouteFils(new Arbre("mois=", "'04'")); }
			| 
			VAR_MOIS_MAI { arbre_var.ajouteFils(new Arbre("mois=", "'05'")); }
			| 
			VAR_MOIS_JUIN { arbre_var.ajouteFils(new Arbre("mois=", "'06'")); }
			| 
			VAR_MOIS_JUILLET { arbre_var.ajouteFils(new Arbre("mois=", "'07'")); }
			| 
			VAR_MOIS_AOUT { arbre_var.ajouteFils(new Arbre("mois=", "'08'")); }
			| 
			VAR_MOIS_SEPTEMBRE { arbre_var.ajouteFils(new Arbre("mois=", "'09'")); }
			| 
			VAR_MOIS_OCTOBRE { arbre_var.ajouteFils(new Arbre("mois=", "'10'")); }
			| 
			VAR_MOIS_NOVEMBRE { arbre_var.ajouteFils(new Arbre("mois=", "'11'")); }
			| 
			VAR_MOIS_DECEMBRE { arbre_var.ajouteFils(new Arbre("mois=", "'12'")); }
		)
		var1 = VAR_ANNEE
		{ 
			arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
		}
	)
	|
	(	// Dans le post-traitement, si l'on détecte 'date =', on viendra séparer en trois
		// élements : annne = , mois =, jour =
		var1 = VAR_DATE
		{
			arbre_var.ajouteFils(new Arbre("date=", "'"+var1.getText()+"'"));
		}
	)
;
