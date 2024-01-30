/*
 * 1. Comme nous utilisons les méthodes get et set, seuls les constructeur et ces méthodes seront à modifier.
 * 2. Le nom des fonction a été modifier pour éviter les conflits avec "Point.java"
 */

/**
 * Modélise un point en coordonnées cartésiennes
 * 
 * @author Charrier Simon
 * @version 1.0
 */
public class PointPolaire {
	private double r;
	private double t;

	/**
	 * Constructeur
	 * 
	 * @param x : abscisse du point
	 * @param y : ordonnée du point
	 */
	public PointPolaire(double x, double y) {
		this.r = Math.sqrt(x * x + y * y);

		if (x > 0) {
			this.t = Math.atan(y / x);
		} else if (x < 0) {
			if (y >= 0) {
				this.t = Math.atan(y / x) + Math.PI;
			} else {
				this.t = Math.atan(y / x) - Math.PI;
			}
		} else {
			if (y > 0) {
				this.t = Math.PI / 2;
			}
			if (y < 0) {
				this.t = -Math.PI / 2;
			} else {
				this.t = 0;
			}
		}
	}

	/**
	 * Constructeur par défaut, créant un point à l'origine
	 */
	public PointPolaire() {
		this(0, 0);
	}

	/**
	 * Getter de la coordonnée x
	 * 
	 * @return x : l'abscisse du point
	 */
	public double getX() {
		double x = this.r * Math.cos(this.t);
		return x;
	}

	/**
	 * Setter de la coordonnée x
	 * 
	 * @param x : nouvelle abscisse du point
	 */
	public void setX(double x) {
		double y = this.r * Math.sin(this.t);
		this.r = Math.sqrt(x * x + y * y);
		if (x > 0) {
			this.t = Math.atan(y / x);
		} else if (x < 0) {
			if (y >= 0) {
				this.t = Math.atan(y / x) + Math.PI;
			} else {
				this.t = Math.atan(y / x) - Math.PI;
			}
		} else {
			if (y > 0) {
				this.t = Math.PI / 2;
			}
			if (y < 0) {
				this.t = -Math.PI / 2;
			} else {
				this.t = 0;
			}
		}

	}

	/**
	 * Getter de la coordonnée y
	 * 
	 * @return l'ordonnée du point
	 */
	public double getY() {
		double y = this.r * Math.sin(this.t);
		return y;
	}

	/**
	 * Setter de la coordonnée y
	 * 
	 * @param y : nouvelle ordonnée du point
	 */
	public void setY(double y) {
		double x = this.r * Math.cos(this.t);
		this.r = Math.sqrt(x * x + y * y);
		if (x > 0) {
			this.t = Math.atan(y / x);
		} else if (x < 0) {
			if (y >= 0) {
				this.t = Math.atan(y / x) + Math.PI;
			} else {
				this.t = Math.atan(y / x) - Math.PI;
			}
		} else {
			if (y > 0) {
				this.t = Math.PI / 2;
			}
			if (y < 0) {
				this.t = -Math.PI / 2;
			} else {
				this.t = 0;
			}
		}
	}

	/**
	 * On veut afficher les point de la forme "(x,y)"
	 * 
	 * @return Point de la forme "(x,y)"
	 */
	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}

	/**
	 * Redéfinition d'equals pour qu'elle soit fonctionnelle pour nos points
	 * 
	 * @param o : Objet qu'on veut comparé au receveur
	 * @return True si ils ont les mêmes coordonnées
	 */
	@Override
	public boolean equals(Object o) {

		// L'objet est de type point ?
		if (o instanceof PointPolaire) {

			// Si oui on compare les abscisses et les ordonnées
			PointPolaire p = (PointPolaire) o;
			return (p.getX() == this.getX() && p.getY() == this.getY());
		} else {
			return false;
		}

	}

	/**
	 * Distance entre 2 points
	 * 
	 * @param p Point à comparer avec le receveur
	 * @return distance entre le receveur et le paramètre
	 */
	public double distance(PointPolaire p) {
		return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
				+ (this.getY() - p.getY()) * (this.getY() - p.getY()));
	}

	/**
	 * Translation d'un point selon un vecteur
	 * 
	 * @param dx : abscisse du vecteur
	 * @param dy : ordonnée du vecteur
	 */
	public void translater(double dx, double dy) {
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
	}

}