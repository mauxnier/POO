package exo1;

/**
 * CD
 */
public class CD {

    private String titre;
    private String numeroCD;

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNumeroCD() {
		return this.numeroCD;
	}

	public void setNumeroCD(String numeroCD) {
		this.numeroCD = numeroCD;
	}

    public CD(String titre, String numeroCD) {
        this.titre;
        this.numeroCD;

    }

    @Override
    public String toString() {
        return "---------------------- CD ----------------------\n    titre: " + titre + "\n    numeroCD: " + numeroCD;
    }

    public void display() {
		System.out.println(toString());
	}
}