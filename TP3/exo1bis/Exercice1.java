package exo1bis;

/**
 * Exo1
 */
public class Exo1 {

    public static void main(String[] args) {
        Ouvrier o1 = new Ouvrier("Thomas", 18, 1);
        Ouvrier o2 = new Ouvrier("Kilian", 19, 3);
        Ouvrier o3 = new Ouvrier("Evan", 18, 58);

        Gerant g1 = new Gerant("Killian", 18, 1);

        ListeEmployes liste = new ListeEmployes();

        liste.ajouter(o1);
        liste.ajouter(o2);
        liste.ajouter(o3);
        liste.ajouter(g1);

        liste.afficher();
        liste.trier();
        liste.afficher();
    }
}