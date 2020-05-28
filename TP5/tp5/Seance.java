package tp5;

/**
 * Seance
 */
public class Seance {
	
	private int date;
	private String typeSeance;
	private Film film;
	
	public Seance(int date, String typeSeance) {
		this.date = date;
		this.typeSeance = typeSeance;
		this.film = null;
	}
	
	public boolean equals(Seance seance) {
		boolean res = false;
		if (this.typeSeance.equals(seance.typeSeance) && (this.date==seance.date)) {
			res = true;
		}
		return res;
	}
	
	public void affiche() {
		System.out.println("Séance de " + date + " pendant la " + typeSeance);
		if (this.film == null) {	
			System.out.println("Il n'y a pas de film de programmé");
		} else {
			System.out.println("Film : " + film.getTitre());
		}
	}
	
	public void affecterFilm(Film film){
		this.film = film;
	}
	
	public void ajouterProgrammer(Film film){
		if (film == null) {
			System.out.println("Votre film n'est pas défini");
		} else if (this.film!=null) {
			System.out.println("Il y a déja un film de programmé");
		} else {
			this.affecterFilm(film);
			film.ajouterSeance(this);
		}	
	}
	
	public void enleverFilm() {
		this.film = null;
	}
	
	public void enleverProgrammer() {
		if (this.film != null){
			this.enleverFilm();
			this.film.enleverSeance(this);
		} else {
			System.out.println("Il n'y a pas de film de programmé");
		}
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTypeSeance() {
		return typeSeance;
	}

	public void setTypeSeance(String typeSeance) {
		this.typeSeance = typeSeance;
	}

	public Film getFilm() {
		return film;
	}
}