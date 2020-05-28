package tp5;

/**
 * ActeurRole
 */
public class ActeurRole {

	private Acteur acteur;
	private String role;
	
	public ActeurRole(Acteur acteur, String role){
		this.acteur = acteur;
		this.role = role;
	}
	
	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object object) {
		boolean res = true;

		if (object == null || getClass() != object.getClass())
			res = false;

		ActeurRole other = (ActeurRole) object;

		if (acteur == null) {
			if (other.acteur != null)
				res = false;
		} else if (!acteur.equals(other.acteur))
			res = false;

		if (role == null) {
			if (other.role != null)
				res = false;
		} else if (!role.equals(other.role))
			res = false;

		return res;
	}
}