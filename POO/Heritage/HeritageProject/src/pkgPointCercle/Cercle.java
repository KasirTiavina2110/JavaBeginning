package pkgPointCercle;

// TODO: Cercle doit "étendre" (ou hériter de) Point
public class Cercle extends Point{
	// TODO : attribuer des modificateurs d'accès appropriés à rayon et staticCercle
	double rayon;
	static int staticCercle;  // attribut statique pour compter le nombre de cercles créés.
	static int compteur;	  // pour voir l'effet de l'héritage (même nom que dans Point)
	
	// TODO : initialiser les attributs statiques à 0
	

	// TODO : définir un constructeur par défaut qui initialise le rayon à 0 et incrémente les variables statiques
	public Cercle() {
		
	}
	
	// TODO : définir un constructeur qui prend en paramètre un rayon (double) et deux coordonnées x et y (int) 
	// et incrémente les variables statiques
	public Cercle(double rayonCercle, int coorX, int coorY) {
		
	}
	
	// TODO : définir un 3e constructeur qui prend en paramètre un Point et un rayon (double) 
	// et incrémente les variables statiques
	public Cercle(Point _point, double _rayon) {
		
	}
	
	// TODO : définir un accesseur pour rayon qui valide que le rayon est positif et le met à 0 si négatif
	public void setRayon(double rayonCercle) {
	    
	}
	
	// TODO : définir un accesseur pour rayon
	

	// TODO : définir un accesseur pour chaque variable statique
	

	// TODO : implémenter la méthode aire() pour calculer l'aire du cercle
	
	
	// TODO : redéfinir la méthode toString() pour afficher les coordonnées du centre et le rayon.
	// Celle-ci doit appeler la méthode toString() de la classe mère (Point)
	

	// TODO : générer automatiquement hashCode() et equals() pour la classe Cercle et redéfinir la 
	// méthode equals() pour comparer les rayons et les coordonnées du centre.
	// Celle-ci doit appeler la méthode equals() de la classe mère (Point)


	// Méthode pour illustrer la redéfinition (overriding)
	@Override
	public double distance() {
		// On utilise la méthode de la super classe pour calculer la distance entre le centre et l'origine
		double distance =  super.distance();

		// On veut calculer la distance entre l'origine et le cercle.
		// Si la distance est inférieure au rayon, on retourne 0 (l'origine est dans le cercle),
		// sinon on retourne la différence entre la distance et le rayon.
		return distance < rayon ? 0.0 : distance - rayon;
	}

}

