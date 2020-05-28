package tp5;

import java.util.ArrayList;

/**
 * Film
 */
public class Film {
	
	private String titre;
	private int duree;
	private String nationalite;
	private String resume;
	private ArrayList<Acteur> mesActeurs;
	private ArrayList<Seance> mesSeances;
	private ArrayList<ActeurRole> mesActeurRole;
	
	public Film(String titre, int duree, String nationalite, String resume) {
		this.titre = titre;
		this.duree = duree;
		this.nationalite = nationalite;
		this.resume = resume;
		this.mesActeurs = new ArrayList<Acteur>();
		this.mesSeances = new ArrayList<Seance>();
	}
	
	public boolean equals(Film film) {
		boolean res = false;
		if (this.titre.equals(film.titre)){
			res = true;
		}
		return res;
	}
	
	public void affiche() {
		System.out.println(titre+"	   Film " + nationalite + " de " + duree + " mn");
		System.out.println();
		System.out.println("Acteurs : ");
		this.listerActeurs();
		System.out.println("Résumé : " + resume);
	}
	
	public boolean contientActeur(ActeurRole roleActeur) {
		return this.mesActeurs.contains(roleActeur.getActeur());
	}
	
	public void ajouterActeur(ActeurRole roleActeur) {
		this.mesActeurs.add(roleActeur.getActeur());
		this.mesActeurRole.add(roleActeur);
	}
	
	public void ajouterJouer(ActeurRole roleActeur) {
		if (!this.contientActeur(roleActeur)) {
			this.ajouterActeur(roleActeur);
			roleActeur.getActeur().ajouterFilmRole(new FilmRole(this, roleActeur.getRole()));
		}
	}
	
	public void enleverActeur(ActeurRole roleActeur) {
		this.mesActeurs.remove(roleActeur.getActeur());
	}
	
	public void enleverJouer(ActeurRole roleActeur) {
		if (this.contientActeur(roleActeur)) {
			this.enleverActeur(roleActeur);
		}
	}
	
	public void listerActeurs() {
		for (int i = 0; i < mesActeurs.size(); i++) {
			System.out.print(" -");
			mesActeurs.get(i).affiche();
			System.out.println();
		}
	}
	
	public void ajouterProgrammer(Seance seance) {
		if (seance != null){
			seance.ajouterProgrammer(this);
		}
	}
	
	public boolean contientSeance(Seance seance) {
		return this.mesSeances.contains(seance);
	}
	
	public void ajouterSeance(Seance seance) {
		if (!this.contientSeance(seance))
			this.mesSeances.add(seance);
	}
	
	public void enleverSeance(Seance seance) {
		if (this.contientSeance(seance))
			this.mesSeances.remove(seance);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}