package exo1bis;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ListeEmployes
 */
public class ListeEmployes {

    private ArrayList<Employe> liste;
    private static final int tailleMax = 10;

    public ListeEmployes() {
        liste = new ArrayList<Employe>(tailleMax);
    }

    public boolean ajouter(Employe employe) {
        if (liste.size() < tailleMax) {
            liste.add(employe);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean trier() {
        if (liste.size() > 0) {
            Collections.sort(liste);
            return true;
        }
        else {
            return false;
        }
        
    }

    public void afficher() {
        for (Employe employe : liste) {
            employe.afficher();
        }
    }
}