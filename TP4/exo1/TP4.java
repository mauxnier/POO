package exo1;

/**
 * TP4
 */
public class TP4 {

    static ListeRectangles liste = new ListeRectangles();

    public static void main(String[] args) {
        liste.ajouter(new Rectangle(0, 0, 4, 2));
        liste.ajouter(new Rectangle(-4, 4, 6, 12));
        liste.ajouter(new Rectangle(8, 9, 45, 1));

        liste.afficher();

        liste.trier();

        liste.afficher();

        System.out.println("Plus grand rectangle :");
        liste.obtenirIemeRectangle(0).dessiner("Jaune");
    }
}