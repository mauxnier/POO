package tp5;

/**
 * Main
 */
public class Main {
	
	public static void main(String[] args) {
		Seance s1 = new Seance(2, "Matin");
		Seance s4 = new Seance(2, "Matin");
		Seance s2 = new Seance(3, "Matin");
		Seance s3 = new Seance(2, "Soir");
		Film f1 = new Film("Django", 60, "Ame", "cool");
		Film f2 = new Film("Captain Marvel", 60, "Ame", "cool");
		boolean b;
		b = s1.equals(s4);
		System.out.println(b);
		b = s1.equals(s2);
		System.out.println(b);
		b = s1.equals(s3);
		System.out.println(b);
		s1.affiche();
		
		s1.ajouterProgrammer(f1);
		s1.affiche();
		s2.ajouterProgrammer(null);
		s1.ajouterProgrammer(f1);
		s1.ajouterProgrammer(f2);
	}
}