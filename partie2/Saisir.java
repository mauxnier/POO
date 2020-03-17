package partie2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Saisir
 */
public class Saisir {

    static private BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	static private String ligne;

	public static int entier() throws IOException {
		ligne = entree.readLine();
		return Integer.parseInt(ligne);
	}
	public static double reeld() throws IOException {
		ligne = entree.readLine();
		return Double.valueOf(ligne).doubleValue(); //change la string en instance de double puis en type primitif de double
		
	}
	public static float reelf() throws IOException {
		ligne = entree.readLine();
		return Float.valueOf(ligne).floatValue(); //change la string en instance de float puis en type primitif de float
	}
	public static String chaine() throws IOException {
		ligne = entree.readLine();
		return ligne;
	}
	public static char car() throws IOException {
		ligne = entree.readLine();
		return ligne.charAt(0);
    }
}