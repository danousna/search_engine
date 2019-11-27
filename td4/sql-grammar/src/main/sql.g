grammar tal_sql;

SELECT : 'vouloir';

ARTICLE : 'article';

BULLETIN : 'bulletin';

CONJ : 'et' | 'ou';

POINT : '.';

MOT : 'mot' | 'contenir' | 'parler';

DATE : 'datant';
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' ;

VAR_MOT 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+;

VAR_ANNEE	: ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9');

VAR_MOIS_JANVIER : 'janvier';
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

VAR_JOUR	: ('0'..'9') ('0'..'9');

VAR_DATE	: VAR_JOUR'/'('0'..'9') ('0'..'9')'/'VAR_ANNEE;

requete returns [Arbre arbre_requete = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		SELECT 
			{
			arbre_requete.ajouteFils(new Arbre("","select distinct"));
			} 
		(ARTICLE
			{
			arbre_requete.ajouteFils(new Arbre("","article"));
			}
		 | BULLETIN
			{
			arbre_requete.ajouteFils(new Arbre("","bulletin"));
			})
		ps = params 
			{
				ps_arbre = $ps.arbre_params;
				arbre_requete.ajouteFils(ps_arbre);
			}
		POINT?
;

params returns [Arbre arbre_params = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.arbre_param;
				arbre_params.ajouteFils(par1_arbre);
			}
		(
			conj1 = CONJ { //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
				arbre_params.ajouteFils(new Arbre("", conj1.getText()));
			}
			par2 = param
			{
				par2_arbre = $par2.arbre_param;
				arbre_params.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre arbre_param = new Arbre("")] :
	(
		MOT
		{
			{ arbre_param.ajouteFils(new Arbre("", "texte")); }
		}
		var1 = VAR_MOT
		{
		 	arbre_param.ajouteFils(new Arbre("mot =", "'"+var1.getText()+"'"));
		}
		(
			conj1 = CONJ {
				arbre_param.ajouteFils(new Arbre("", conj1.getText()));
			}
			var2 = VAR_MOT { 
				arbre_param.ajouteFils(new Arbre("mot =", "'"+var2.getText()+"'"));
			}
		)*
	)
	|
		DATE
		{
			{ arbre_param.ajouteFils(new Arbre("", "date")); }
		}
		var1 = var_date
		{
		 	arbre_param.ajouteFils(var1.arbre_var);
		}
		(
			conj1 = CONJ {
				arbre_param.ajouteFils(new Arbre("", conj1.getText()));
			}
			var2 = var_date { 
				arbre_param.ajouteFils(var2.arbre_var);
			}
		)*
	)
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
		// Match du jour en option
		(
			var1 = VAR_JOUR
			{
				arbre_var.ajouteFils(new Arbre("jour =", "'"+var1.getText()+"'"));
			}
		)?
		// Match du mois
		(
			VAR_MOIS_JANVIER {{ arbre_var.ajouteFils(new Arbre("mois =", "01")); }}
			| 
			VAR_MOIS_FEVRIER {{ arbre_var.ajouteFils(new Arbre("mois =", "02")); }}
			| 
			VAR_MOIS_MARS {{ arbre_var.ajouteFils(new Arbre("mois =", "03")); }}
			| 
			VAR_MOIS_AVRIL {{ arbre_var.ajouteFils(new Arbre("mois =", "04")); }}
			| 
			VAR_MOIS_MAI {{ arbre_var.ajouteFils(new Arbre("mois =", "05")); }}
			| 
			VAR_MOIS_JUIN {{ arbre_var.ajouteFils(new Arbre("mois =", "06")); }}
			| 
			VAR_MOIS_JUILLET {{ arbre_var.ajouteFils(new Arbre("mois =", "07")); }}
			| 
			VAR_MOIS_AOUT {{ arbre_var.ajouteFils(new Arbre("mois =", "08")); }}
			| 
			VAR_MOIS_SEPTEMBRE {{ arbre_var.ajouteFils(new Arbre("mois =", "09")); }}
			| 
			VAR_MOIS_OCTOBRE {{ arbre_var.ajouteFils(new Arbre("mois =", "10")); }}
			| 
			VAR_MOIS_NOVEMBRE {{ arbre_var.ajouteFils(new Arbre("mois =", "11")); }}
			| 
			VAR_MOIS_DECEMBRE {{ arbre_var.ajouteFils(new Arbre("mois =", "12")); }}
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
