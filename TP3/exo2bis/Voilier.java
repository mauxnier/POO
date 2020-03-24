package exo2bis;

/**
 * Voilier
 */
public class Voilier extends Bateau {

    private double surfaceVoilure;

    public Voilier(String nom, double poids, String portAttache, double longueur, double surfaceVoilure) {
        super(nom, poids, portAttache, longueur);
        this.surfaceVoilure = surfaceVoilure;
    }

    private int sommeTaxe() {
        return 50 * this.longueur;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Surface de voilure  : " + surfaceVoilure;
    }
}