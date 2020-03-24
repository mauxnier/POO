package exo2;

/**
 * Jockey
 */
public class Jockey extends Personne {
    private double poids;
    private double salaire;
    
    public Jockey(String nom, String prenom, String adresse, double poids, double salaire) {
        super(nom, prenom, adresse);
        this.poids = poids;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Poids : " + poids + " | Salaire : " + salaire + " |";
    }
    
}