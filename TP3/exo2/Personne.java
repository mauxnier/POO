package exo2;

/**
 * Personne
 */
public class Personne {
    private String nom;
    private String prenom;
    private String adresse;

    public Personne(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "| Nom : " + nom + "| Prénom : " + prenom + "| Adresse : " + adresse + " |";
    }

    /**
     * Afficher une personne
     */
    public void display() {
        for (int i = 0; i < this.toString().length(); i++) System.out.print("-");
        System.out.println("");
        System.out.println(this.toString());
        for (int i = 0; i < this.toString().length(); i++) System.out.print("-");
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return String return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}