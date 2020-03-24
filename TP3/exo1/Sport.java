package exo1;

/**
 * Sport
 */
public class Sport {
    private int code;
    private String libelle;

    public Sport(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    @Override
    /**
     * @return the Sport instance in a String
     */
    public String toString() {
        return "Code : " + code + "\n" + "Libellé : " + libelle;
    }

    public void display() {
        System.out.println(this.toString());
    }
}