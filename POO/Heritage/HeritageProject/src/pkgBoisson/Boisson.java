package pkgBoisson;

public class Boisson {

	// indique les modificateurs d'accès appropriés 
	String nom;
    double prix;
    static public double taux;
	
    static {  
    	taux = 0.02;  
	}
	
    public Boisson( ) { 
    	setNom("aucun"); 	//nom = "aucun"; 
		setPrix(0); 		//prix = 0; 
	}
	
	// TODO : à compléter
	public Boisson(String _nom, double _prix) {

	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		if (prix >= 0) {
			this.prix = prix;			
		}
		else {
			this.prix = 0;
		}
	}

	public double calculPrix(double _montant) {
		return  prix  +  prix  +  _montant;
	}
		
	public double prixVente() {
		return  calculPrix (2) +  2;
	}
	
	public double calculTaxe() {
		return   prix  *  taux;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Boisson obj) {
		return nom.equals(obj.getNom()) && prix == obj.getPrix();
	}

	@Override
	public String toString() {
		return "Boisson [nom=" + nom + ", prix=" + prix + "]";
	}
	
	

}

