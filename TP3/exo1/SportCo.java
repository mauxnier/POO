package exo1;

/**
 * SportCo
 */
public class SportCo extends Sport {
    private int nbJoueurs;

    public SportCo(int code, String libelle, int nbJoueurs) {
        super(code, libelle);
        this.nbJoueurs = nbJoueurs;
    }

    /**
     * @return the nbJoueurs
     */
    public int getNbJoueurs() {
        return nbJoueurs;
    }

    @Override
    /**
     * @return the SportCo instance in a String
     */
    public String toString() {
        return "Code : " + getCode() + "\n" + "Libellé : " + getLibelle() + "\n" + "Nombre de Joueurs : " + nbJoueurs;
    }
}