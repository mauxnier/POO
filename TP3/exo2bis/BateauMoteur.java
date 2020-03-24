package exo2bis;

/**
 * BateauMoteur
 */
public class BateauMoteur extends Bateau {

    private int puissanceMoteur;
    private static final int PRIX_KW = 5;

    public BateauMoteur(String nom, double poids, String portAttache, double longueur, int puissanceMoteur) {
        super(nom, poids, portAttache, longueur);
        this.puissanceMoteur = puissanceMoteur;
    }

    private int sommeTaxe() {
        return 70 * this.longueur + PRIX_KW * this.puissanceMoteur;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Puissance Moteur : " + puissanceMoteur;
    }
    
}