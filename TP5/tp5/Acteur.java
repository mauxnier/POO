package tp5;

import java.util.ArrayList;

/**
 * Acteur
 */
public class Acteur {
	
	private String nom;
	private String prenom;
	private ArrayList<FilmRole> mesFilmRole;
	
	public Acteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		mesFilmRole = new ArrayList<FilmRole>();
	}
	
	public boolean equals(Acteur acteur) {
		boolean res = false;
		if (this.prenom.equals(acteur.prenom) && (this.nom.equals(acteur.nom))){
				res= true;
		}
		return res;
	}
	
	public void ajouterFilmRole(FilmRole roleFilm) {
		this.mesFilmRole.add(roleFilm);
	}
	
	public void ajouterJouer (FilmRole roleFilm) {
		roleFilm.getFilm().ajouterJouer(new ActeurRole(this, roleFilm.getRole()));
	}
	
	public void affiche() {
		System.out.println(prenom + " " + nom);
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
}