/**
 * Test de la classe point
 * 
 * @author Charrier Simon
 * @version 1.0
 */
public class TestPoint {

	/**
	 * Fonction main
	 * 
	 * @param args : Inutile pour le moment
	 */
	public static void main(String[] args) {

		// Création de 2 points distinct
		PointPolaire origine = new PointPolaire();
		PointPolaire pt = new PointPolaire(4, 2);

		// Affichage des points
		System.out.println("Point origine : " + origine.toString());
		System.out.println("Point 1 : " + pt.toString());

		// Affichage de la distance entre ces points
		System.out.println("Distance entre le point 1 et le point origine : " + origine.distance(pt));

		// Deplacement d'un point vers l'autre
		System.out.println("Translation du point 1 vers le point origine.");
		pt.translater(-4, -2);
		System.out.println(pt.toString());

		// Comparaison des 2 points en utilisant equals puis ==
		System.out.println("Comparaison des points en utilisant equals : " + pt.equals(origine));
		System.out.println("Comparaison des points en utilisant == : " + (pt == origine));

		// Création d'une référence à un des 2 points
		System.out.println("Création d'une référence au point 1.");
		PointPolaire ref = pt;

		// Utilisation d'un setteur sur la référence
		System.out.println("Utilisation d'un setteur pour modifier la référence.");
		ref.setX(10);
		ref.setY(-2);

		// Afficher les points et la référence
		System.out.println("Point origine : " + origine.toString());
		System.out.println("Point 1 : " + pt.toString());
		System.out.println("Référence : " + ref.toString());
	}
}