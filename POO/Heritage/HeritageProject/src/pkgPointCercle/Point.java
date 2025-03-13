package pkgPointCercle;

public class Point {
	protected int x;	
	protected int y;
	protected static int staticPoint;  	// pour compter le nombre de points créés
	protected static int attrStatique;		// pour voir l'effet de l'héritage
	
	static {
		staticPoint = 0;
		attrStatique = 0;
	}

	// Constructeur par défaut
	public Point() {
	    setPoint(0, 0);
	    staticPoint++;
	}

	// Constructeur paramétré
	public Point(int coorX, int coorY) {
		setPoint(coorX, coorY);
	    staticPoint++;
	}

	// Constructeur de copie
	public Point(Point _point) {
		setPoint(_point.getX(), _point.getY());
	    staticPoint++;
	}

	// Accesseurs & mutateurs approipriés
	public void setPoint(int coorX, int coorY) {
	    x   =   coorX;
	    y   =   coorY;				
	}
	
	public int getX()  {
	    return x;
	}
	
	public int getY() {
	    return y;
	}

	public static int getAttrStatique() {
		return attrStatique;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	public boolean equals(Point _point) {
		return x == _point.getX() && y == _point.getY();
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// Méthode pour illustrer la redéfinition (overriding)
	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	

}
