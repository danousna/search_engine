package main;

public class Arbre {
    Arbre fils=null;
    Arbre frere=null;
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
    
    public String afficheCat() {
    	String result = "";
    	
    	if (categorie != "" || mot != "") {
    		result += categorie + " " + mot + " ";
    	}
	    if (fils != null) {
	    	result += fils.afficheCat();
        }
	    if (frere != null) {
	    	result += frere.afficheCat();
        }
	    return result;
    }

    private void afficheCatAvecNl() {
	    System.out.print(categorie+" ");
	    System.out.print(mot+" ");
	    
	    if (fils != null) {
	        fils.afficheCatAvecNl();
        }
	    
	    if (frere != null) {
	        frere.afficheCatAvecNl();
        }
    }
    
    private void afficheCatSansNl() {
    System.out.print(categorie+" ");
    
    if (fils != null) {
        fils.afficheCatSansNl();
    }
    if (frere != null) {
        frere.afficheCatSansNl();
        }
    }
    
    public String toString() {
    	String result = "";
    	Arbre bro = this.frere;
    	Arbre son = this.fils;
    	
    	System.out.println(this.afficheCat());
    	
    	result += this.afficheCat() + '\n';
    	
    	do {
    		result += bro.afficheCat();
    		bro = bro.frere;
    	} while (bro != null);
    	
    	result += "\n";
    	
    	do {
    		result += son.afficheCat();
    		son = son.fils;
    	} while (fils != null);
    	
    	return result;
	}
}
