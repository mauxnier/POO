package exo2;

/**
 * Exo2
 */
public class Exo2 {

    public static void main(String[] args) {
        Course c1 = new Course("Grand Prix Classic", 30000.0);
        ChevalDeCourse cheval1 = new ChevalDeCourse("Adagio", "Quintuple Poney", "Je sais pas", 1000.0, new Entraineur("MONNIER", "Erwan", "Beauvais", "123456"));
        c1.enregistre(cheval1);
        c1.affiche();
        c1.rechercheCheval("Presqu-île");
        c1.rechercheCheval("Adagio");
    }
}