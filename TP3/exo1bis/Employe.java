package exo1bis;

/**
 * Employe
 */
public abstract class Employe implements Comparable<Employe> {

    private String nom;
    private int age;
    private int Nb_A;
    private int num;
    private static int NbEmploye = 0;

    Employe(String nom, int age, int Nb_A) {
        this.nom = nom;
        this.age = age;
        this.Nb_A = Nb_A;
        NbEmploye++;
        this.num = NbEmploye;
    }

    abstract public int calculSalaire();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nom : " + nom + " | Âge : " + age + " | Nb_A : " + Nb_A + " | Num : " + num + " | NbEmploye : " + NbEmploye;
    }

    public void afficher() {
        System.out.println(this.toString());
    }

    /**
     * @return the nb_A
     */
    public int getNb_A() {
        return Nb_A;
    }

    
    @Override
    public int compareTo(Employe employe) { //tris les employés dans l'ordre croissant selon leur age 
    //retourne un entier négatif, zéro ou positive si l'age de cet employé est moins que, égale à ou supérieur à l'objet comparé avec
        return (int) (this.calculSalaire() - employe.calculSalaire());
 }
}