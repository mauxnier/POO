package exo2;

/**
 * Entraineur
 */
public class Entraineur extends Personne {
    private String licence;
    
    public Entraineur(String nom, String prenom, String adresse, String licence) {
        super(nom, prenom, adresse);
        this.licence = licence;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Licence : " + licence;
    }
}