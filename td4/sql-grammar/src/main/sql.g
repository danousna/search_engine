grammar sql;

SELECT : 'vouloir' | 'quels' | 'quel';

SELECT_ARTICLE : 'article' | 'articles';

SELECT_BULLETIN : 'bulletin';

SELECT_AUTEUR : 'auteur';

SELECT_DATE : 'date';

SELECT_SHORT_AUTEUR : 'qui';

SELECT_SHORT_DATE : 'quand';

CONJ_OR : 'ou';

CONJ_AND : 'et' | ',';

MOT : 'mot' | 'contenir' | 'parler';

AUTEUR: 'par';

RUBRIQUE: 'rubrique';

DATE : 'datant';

VAR_JOUR	: ('0'..'9') ('0'..'9');
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
				sl_arbre = $sl.arbre_select;
				arbre_requete.ajouteFils(sl_arbre);
			} 
		
		ps = params 
			{
				ps_arbre = $ps.arbre_params;
				arbre_requete.ajouteFils(ps_arbre);
			}
		POINT?
;

select returns [Arbre arbre_select = new Arbre("")] :
	(
		SELECT
		(
			SELECT_ARTICLE { arbre_select.ajouteFils(new Arbre("", "select article")); }
			|
			SELECT_BULLETIN { arbre_select.ajouteFils(new Arbre("", "select bulletin")); }
			|
			SELECT_AUTEUR { arbre_select.ajouteFils(new Arbre("", "select auteur")); }
			|
			SELECT_DATE { arbre_select.ajouteFils(new Arbre("", "select date")); }
		)
		(
			CONJ_AND
			(
				SELECT_ARTICLE { arbre_select.ajouteFils(new Arbre("", ", article")); }
				|
				SELECT_BULLETIN { arbre_select.ajouteFils(new Arbre("", ", bulletin")); }
				|
				SELECT_AUTEUR { arbre_select.ajouteFils(new Arbre("", ", auteur")); }
				|
				SELECT_DATE { arbre_select.ajouteFils(new Arbre("", "select date")); }
			)
		)*
	)
	|
	SELECT_SHORT_AUTEUR { arbre_select.ajouteFils(new Arbre("", "select auteur")); }
	|
	SELECT_SHORT_DATE { arbre_select.ajouteFils(new Arbre("", "select date")); }
;

params returns [Arbre arbre_params = new Arbre("")]
	@init {Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.arbre_param;
				arbre_params.ajouteFils(par1_arbre);
			}
		(
			(
				conj1 = conj { //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
					arbre_params.ajouteFils(new Arbre("", conj1.getText()));
				}
			)?
			par2 = param
			{
				par2_arbre = $par2.arbre_param;
				arbre_params.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre arbre_param = new Arbre("")] :
	(
		MOT { arbre_param.ajouteFils(new Arbre("", "table_texte")); }
		var_mot_1 = VAR_MOT { arbre_param.ajouteFils(new Arbre("mot =", "'"+var_mot_1.getText()+"'")); }
		(
			conj1 = conj { arbre_param.ajouteFils(new Arbre("", conj1.getText())); }
			var_mot_2 = VAR_MOT { arbre_param.ajouteFils(new Arbre("mot =", "'"+var_mot_2.getText()+"'")); }
		)*
	)
	|
	(
		AUTEUR { arbre_param.ajouteFils(new Arbre("", "table_auteur")); }
		var_auteur_1 = VAR_MOT { arbre_param.ajouteFils(new Arbre("auteur =", "'"+var_auteur_1.getText()+"'")); }
		(
			conj1 = conj { arbre_param.ajouteFils(new Arbre("", conj1.getText())); }
			var_auteur_2 = VAR_MOT { arbre_param.ajouteFils(new Arbre("auteur =", "'"+var_auteur_2.getText()+"'")); }
		)*
	)
	|
	(
		DATE
		{
			{ arbre_param.ajouteFils(new Arbre("", "table_date")); }
		}
		var_date_1 = var_date { arbre_param.ajouteFils(var_date_1.arbre_var); }
		(
			conj1 = conj { arbre_param.ajouteFils(new Arbre("", conj1.getText())); }
			var_date_2 = var_date { arbre_param.ajouteFils(var_date_2.arbre_var); }
		)*
	)
;

conj returns [Arbre arbre_conj = new Arbre("")] :
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

var_date returns [Arbre arbre_var_date = new Arbre("")] :
	(
		var1 = VAR_ANNEE
		{ 
			arbre_var.ajouteFils(new Arbre("annee =", "'"+var1.getText()+"'"));
		}
	)
	|
	(
		(
			var1 = VAR_JOUR
			{
				arbre_var.ajouteFils(new Arbre("jour =", "'"+var1.getText()+"'"));
			}
		)?
		(
			VAR_MOIS_JANVIER { arbre_var.ajouteFils(new Arbre("mois =", "01")); }
			| 
			VAR_MOIS_FEVRIER { arbre_var.ajouteFils(new Arbre("mois =", "02")); }
			| 
			VAR_MOIS_MARS { arbre_var.ajouteFils(new Arbre("mois =", "03")); }
			| 
			VAR_MOIS_AVRIL { arbre_var.ajouteFils(new Arbre("mois =", "04")); }
			| 
			VAR_MOIS_MAI { arbre_var.ajouteFils(new Arbre("mois =", "05")); }
			| 
			VAR_MOIS_JUIN { arbre_var.ajouteFils(new Arbre("mois =", "06")); }
			| 
			VAR_MOIS_JUILLET { arbre_var.ajouteFils(new Arbre("mois =", "07")); }
			| 
			VAR_MOIS_AOUT { arbre_var.ajouteFils(new Arbre("mois =", "08")); }
			| 
			VAR_MOIS_SEPTEMBRE { arbre_var.ajouteFils(new Arbre("mois =", "09")); }
			| 
			VAR_MOIS_OCTOBRE { arbre_var.ajouteFils(new Arbre("mois =", "10")); }
			| 
			VAR_MOIS_NOVEMBRE { arbre_var.ajouteFils(new Arbre("mois =", "11")); }
			| 
			VAR_MOIS_DECEMBRE { arbre_var.ajouteFils(new Arbre("mois =", "12")); }
		)
		var1 = VAR_ANNEE
		{ 
			arbre_var.ajouteFils(new Arbre("annee =", "'"+var1.getText()+"'"));
		}
	)
	|
	(	// Dans le post-traitement, si l'on détecte 'date =', on viendra séparer en trois
		// élements : annne = , mois =, jour =
		var1 = VAR_DATE
		{
			arbre_var.ajouteFils(new Arbre("date =", "'"+var1.getText()+"'"));
		}
	)
;
