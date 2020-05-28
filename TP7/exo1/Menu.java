package exo1;

import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Groupe groupe = new Groupe();

		while (run) {
			System.out.println("1 - Afficher les étudiants du groupe");
			System.out.println("2 - Ajouter un étudiant du groupe");
			System.out.println("3 - Enlever un étudiant du groupe");
			System.out.println("4 - Calculer la moyenne du groupe");
			System.out.println("0 - Quitter");

			int input = sc.nextInt();

			switch (input) {
				case 0:
					run = false;
					break;
				case 1:
					groupe.afficheEtu();
					break;
				case 2:
					System.out.println("Quel est le nom de l'étudiant que vous voulez ajouter ?");
					String nomA = sc.next();
					groupe.ajoutEtu(nomA);
					System.out.println(nomA + " a été ajouté au groupe.");
					break;
				case 3:
					System.out.println("Quel est le nom de l'étudiant que vous voulez supprimer ?");
					String nomS = sc.next();
					groupe.supprEtu(nomS);
					System.out.println(nomS + " a été supprimé du groupe.");
					break;
				case 4:
					groupe.moyGroupe();
					break;
				default:
					System.err.println("Erreur de saisie");
			}
			sc.close();
		}
	}
}
