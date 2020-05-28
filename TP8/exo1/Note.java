package exo1;

/**
 * Note
 */
public class Note {

	static public double moyenne(String[] valeur) throws MonException {
		double res = 0;
		int cpt = 0;
		
		for (int i = 0; i < valeur.length; i++){
			try {
				res = res + Integer.parseInt(valeur[i]);
				cpt++;
			} catch (NumberFormatException e) {
				System.out.println(valeur[i] + "n'est pas un entier");
			}
		}
		if (cpt == 0) throw new MonException();
		return res / valeur.length;
	}

	public static void main(String[] args) {
		String[] tab = {};
		try {
			System.out.println("La moyenne : " + moyenne(tab));
		} catch(MonException e) {
			System.out.println(e);
		}
	}
}