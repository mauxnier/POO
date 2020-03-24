package exo2;

/**
 * ChevalDeCourse
 */
public class ChevalDeCourse extends Cheval {
    private double montantGain;
    private Entraineur entraineur;
    private Jockey jockey;

    public ChevalDeCourse(String nom, String sexe, String race, double montantGain, Entraineur entraineur) {
        super(nom, sexe, race);
        this.montantGain = montantGain;
        this.entraineur = entraineur;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Montant du gain : " + montantGain + " | Entaineur : " + entraineur.toString();
    }
    
    public void affiche() {
        System.out.println(this.toString());
    }

    public void attribut_jocket(Jockey j) {
        this.jockey = j;
    }

    /**
     * @return the jockey
     */
    public Jockey getJockey() {
        return jockey;
    }
}