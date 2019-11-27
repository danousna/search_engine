grammar tal_sql;

SELECT : 'vouloir'
;

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler'
;

DATE : 'datant'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR_MOT 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

VAR_ANNEE	: ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		SELECT 
			{
			req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin"));
			})
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.arbre_param;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(
			conj1 = CONJ { //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
				les_pars_arbre.ajouteFils(new Arbre("", conj1.getText()));
			}
			par2 = param
			{
				par2_arbre = $par2.arbre_param;
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre arbre_param = new Arbre("")] :
	(
		MOT
		{
			{ arbre_param.ajouteFils(new Arbre("", "texte")); }
		}
	|
		DATE
		{
			{ arbre_param.ajouteFils(new Arbre("", "date")); }
		}
	)
	var1 = var
		{ 
			arbre_param.ajouteFils(new Arbre("mot =", var1.arbre_var));
		}
	(
		conj1 = CONJ {
			arbre_param.ajouteFils(new Arbre("", conj1.getText()));
		}
		var2 = var { 
			arbre_param.ajouteFils(new Arbre("mot =", var2.arbre_var));
		}
	)*
;

var returns [Arbre arbre_var = new Arbre("")] :
	(
		var1 = VAR_MOT
		{ 
			arbre_var.ajouteFils(new Arbre("mot =", "'"+var1.getText()+"'"));
		}
	)
	|
	(
		var1 = VAR_ANNEE
		{ 
			arbre_var.ajouteFils(new Arbre("annee =", "'"+var1.getText()+"'"));
		}
	)
;
