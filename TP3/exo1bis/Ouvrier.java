package exo1bis;

/**
 * Ouvrier
 */
public class Ouvrier extends Employe {
    
    final private static int Nb_H_O = 35;

    Ouvrier(String nom, int age, int Nb_A) {
        super(nom, age, Nb_A);
    }
    
    public int calculSalaire() {
        return 4 * Nb_H_O * (10 + this.getNb_A() / 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " | Salaire : " + calculSalaire();
    }
}