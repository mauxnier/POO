package partie2;

import java.io.IOException;

/**
 * Date
 */
public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date() throws IOException {
        System.out.println("Veuillez saisir la date au clavier : ");
        System.out.println("Jour : ");
        this.jour = Saisir.entier();
        System.out.println("Mois : ");
        this.mois = Saisir.entier();
        System.out.println("Année : ");
        this.annee = Saisir.entier();
    }

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    
    /**
     * @return the Client
     */
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
}