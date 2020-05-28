package exo1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ListeRectangles
 */
public class ListeRectangles {

    private static final int MAX = 10;
    private ArrayList<Rectangle> listeR;
    private Rectangle tabR[];

    public ListeRectangles() {
        listeR = new ArrayList<Rectangle>(MAX);
    }

    public void ajouter(Rectangle rectangle) {
        if (listeR.size() < MAX) {
            listeR.add(rectangle);
        } else {
            System.err.println("Erreur : liste pleine");
        }
    }

    public void afficher() {
        for (Rectangle rectangle : listeR) {
            System.out.println(rectangle.toString());
        }
    }

    public void trier() {
        if (!listeR.isEmpty()) {
            tabR = new Rectangle[listeR.size()];
            tabR = listeR.toArray(tabR);
            Arrays.sort(tabR);
            listeR = new ArrayList<Rectangle>(MAX);
            for (Rectangle rectangle : tabR) {
                this.ajouter(rectangle);
            }
        }
        else
            System.err.println("Erreur : liste vide");
    }

    public Rectangle obtenirIemeRectangle(int i) {
        if (listeR.size() < i)
            return null;
        else
            return listeR.get(i);
    }

    public int obtenirNombreRectangles() {
        return listeR.size();
    }
}