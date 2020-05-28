package exo1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Artiste
 */
public class Artiste {

    private String pseudo;
    private Integer numeroLicence;
    private Impressario impressario;

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getNumeroLicence() {
		return this.numeroLicence;
	}

	public void setNumeroLicence(Integer numeroLicence) {
		this.numeroLicence = numeroLicence;
	}

	public Impressario getImpressario() {
		return this.impressario.toString();
	}

	ArrayList<CD> listCD;
	HashMap<Concert, Integer> Cachet;
    static final int MAX = 100;

	public String getListCD() {
		String list = "";
		for (int i = 0; i < listCD.size(); i++) {
		    getListCD += listCD.get(i).toString() + " | ";
		}
		return list;
	}

    public Artiste(String pseudo, Integer numeroLicence, Impressario impressario, Concert concert, Integer integer) {
        this.pseudo = pseudo;
        this.numeroLicence = numeroLicence;
        this.impressario = impressario;
        listCD = new ArrayList<CD>(MAX);
		Cachet = new HashMap<Concert, Integer>(MAX);
		Cachet.put(concert, integer);
    }
    
    @Override
    public String toString() {
        return "---------------------- Artiste ----------------------\n    pseudo: " + pseudo + "\n   numeroLicence: " + numeroLicence + "\n    impressario: " + getImpressario;
    }
    
	public void display() {
		System.out.println(toString());
	}
}