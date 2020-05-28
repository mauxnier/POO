package exo1;

/**
 * Impresario
 */
public class Impresario {

    private String nom;
    private String prenom;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    Impresario(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "---------------------- Impresario ----------------------\n    nom: " + nom + "\n    prenom: " + prenom;
    }

    public void display() {
        System.out.println(toString());
    }
}