package exo1;

/**
 * Date
 */
public class Date {

    private Integer jour;
    private Integer mois;
    private Integer annee;

    public Integer getJour() {
        return this.jour;
    }

    public void setJour(Integer jour) {
        this.jour = jour;
    }

    public Integer getMois() {
        return this.mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public Integer getAnnee() {
        return this.annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    Date(Integer jour, Integer mois, Integer annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "---------------------- Date ----------------------\n    jour: " + jour + "\n    mois: " + mois + "\n    annee: " + annee;
    }

    public void display() {
        System.out.println(toString());
    }
}