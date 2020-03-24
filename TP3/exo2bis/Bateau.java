package exo2bis;

/**
 * Bateau
 */
public abstract class Bateau {

    private String nom;
    private double poids;
    private String portAttache;
    private double longueur;

    public Bateau(String nom, double poids, String portAttache, double longueur) {
        this.nom = nom;
        this.poids = poids;
        this.portAttache = portAttache;
        this.longueur = longueur;
    }

    public abstract int sommeTaxe();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nom : " + nom + " | Poids : " + poids + " | Port d'attache : " + portAttache + " | Longueur : " + longueur;
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}