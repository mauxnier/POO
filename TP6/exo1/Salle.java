package exo1;

/**
 * Salle
 */
public class Salle {

    private String nom;
    private String adresse;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Salle(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "---------------------- Salle ----------------------\n    nom: " + nom + "\n    adresse: " + adresse;
    }

    public void display() {
        System.out.println(toString());
    }
}