package exo2;

/**
 * Cheval
 */
public class Cheval {
    private static int nombreChevaux = 0;
    private int numeroIdentification;
    private String nom;
    private String sexe;
    private String race;

    public Cheval(String nom, String sexe, String race) {
        this.nom = nom;
        this.sexe = sexe;
        this.race = race;
        nombreChevaux++;
        this.numeroIdentification = nombreChevaux;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Nom : " + nom + " | Sexe : " + sexe + " | Race : " + race + " | Numéro " + numeroIdentification + " | Nombre : " + nombreChevaux;
    }

    /**
     * @return int return the numeroIdentification
     */
    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    /**
     * @param numeroIdentification the numeroIdentification to set
     */
    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
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
     * @return String return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return String return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    
}