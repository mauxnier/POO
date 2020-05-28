package exo1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Etudiant
 */
public class Etudiant {
	private static int matr;
	private String nom;
	private String prenom;
	private HashMap <Cours,Double> note;
	
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.note = new HashMap<Cours, Double>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public HashMap<Cours, Double> getNote() {
		return note;
	}

	public void setNote(HashMap<Cours, Double> note) {
		this.note = note;
	}

	public static int getMatr() {
		return matr;
	}

	public void ajoutNote(Double noteCours, Cours cours) {
		this.note.put(cours, noteCours);
	}

	public void modifierNote(Double noteCours, Cours cours) {
		this.note.replace(cours, noteCours);
	}
	
	public void supprNote(Cours cours) {
		this.note.remove(cours);
	}

	public double calcMoy() {
		Iterator<Cours> it = note.keySet().iterator();
		int compteur = 0;
		double addition = 0 ;
		double res = -1;

		if (note.size() != 0) {
			while (it.hasNext()) {
				addition = addition + this.note.get(it.next());
				compteur += 1;
			}
			res = addition / compteur;
		}
		return res;
	}

	public double delivreNote(Cours cours) {
		return this.note.get(cours);
	}

	public double meilleurNote() {
		Iterator<Cours> it = note.keySet().iterator();
		double max = 0;

		while (it.hasNext()) {
			Cours cle = it.next();
			if (this.note.get(cle) > max) {
				max = this.note.get(cle);
			}
		}
		return max;
	}
	
	public double pireNote() {
		Iterator<Cours> it = note.keySet().iterator();
		double min = note.get(it.next());

		while (it.hasNext()) {
			Cours cle = it.next();
			if (this.note.get(cle) < min) {
				min = this.note.get(cle);
			}
		}
		return min;
	}
	
	public void listeNote() {
		Iterator<Cours> it = note.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(this.note.get(it.next()));
		}
	}
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom +", calcMoy()=" + calcMoy() + ", meilleurNote()=" + meilleurNote() + ", pireNote()=" + pireNote() + "]";
	}

	@Override
	public boolean equals(Object object) {
		boolean res = false;

		if (object == null || getClass() != object.getClass())
			return false;

		Etudiant other = (Etudiant) object;

		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
			
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
	}
}