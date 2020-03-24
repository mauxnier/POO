package exo1bis;

/**
 * Gerant
 */
public class Gerant extends Employe {

    final private static int Nb_H_G = 20;

    Gerant(String nom, int age, int Nb_A) {
        super(nom, age, Nb_A);
    }
    
    public int calculSalaire() {
        return 5 * Nb_H_G * (20 + this.getNb_A() / 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Salaire : " + calculSalaire();
    }
}