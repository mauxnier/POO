package partie1;

import java.util.Scanner;

/**
 * Produit
 */
public class Produit {

    private String ref;
	private int dateEntree;

	public Produit(int dateJour){
		System.out.println("Entrez le nom du produit : ");
		Scanner sc = new Scanner(System.in);
		ref = sc.nextLine();
		dateEntree = dateJour;
        sc.close();
	}

	/**
	 * @return the dateEntree
	 */
	public int getDateEntree() {
		return dateEntree;
	}

	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
}
