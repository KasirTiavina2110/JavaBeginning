package pkgBoisson;


public class BoissonAlcoolisee extends Boisson {

	int degreAlcool;			// indique le modificateur d'accès approprié.
	static public double taux;
	
	static {
		taux = 0.05;
	}
	
	// TODO : à compléter
	public BoissonAlcoolisee() {
		
	}
	
	// TODO : à compléter
	public BoissonAlcoolisee(String _nom, double _prix, int _degreAlcool) {
		
	}
	
	public int getDegreAlcool() {
		return degreAlcool;
	}

	public void setDegreAlcool(int degreAlcool) {
		this.degreAlcool = degreAlcool > 0 ? degreAlcool : 0;
	}

	private  double  calculPrix(int _montant) {
		return prix + _montant;
	}
		
	public double prixVente(double _commission) {
		return  calculPrix(2) + _commission;
	}
		
	public double calculTaxe() {
		return(prix * taux) + 20;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + degreAlcool;
		return result;
	}

	public boolean equals(BoissonAlcoolisee obj) {
		return degreAlcool == obj.getDegreAlcool() && super.equals(obj);
	}

	@Override
	public String toString() {
		return "BoissonAlcoolisee [degreAlcool=" + degreAlcool + ", " + super.toString() + "]";
	}

}










