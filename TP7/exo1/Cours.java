package exo1;

/**
 * Cours
 */
public class Cours {
	
	private String intitule;

	public Cours(String intitule) {
		super();
		this.intitule = intitule;
	}

	public String toString() {
		return "Cours " + intitule;
	}
	
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}