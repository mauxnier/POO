package exo2bis;

/**
 * MotorYacht
 */
public class MotorYacht extends Bateau {
    
    private int puissanceMoteur;
    private int NbsEquipage;
    private static final int PRIX_KW = 5;
    
    public MotorYacht(String nom, double poids, String portAttache, double longueur, int puissanceMoteur, int NbsEquipage) {
        super(nom, poids, portAttache, longueur);
        this.puissanceMoteur = puissanceMoteur;
        this.NbsEquipage = NbsEquipage;
    }

    private int sommeTaxe() {
        return 110 * this.longueur + PRIX_KW * this.puissanceMoteur + 20 * NbsEquipage;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Puissance Moteur : " + puissanceMoteur + " | Nombres d'équipages : " + NbsEquipage;
    }
}