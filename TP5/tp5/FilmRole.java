package tp5;

/**
 * FilmRole
 */
public class FilmRole {

	private Film film;
	private String role;
	
	public FilmRole(Film film, String role){
		this.film = film;
		this.role = role;
	}
	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean equals(Object object) {
		boolean res = true;

		if (object == null || getClass() != object.getClass())
			res = false;

		FilmRole other = (FilmRole) object;

		if (film == null) {
			if (other.film != null)
				res = false;
		} else if (!film.equals(other.film))
			res = false;

		if (role == null) {
			if (other.role != null)
				res = false;
		} else if (!role.equals(other.role))
			res = false;

		return res;
	}
	
}