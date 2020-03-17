package partie1;

/**
 * GestionStock
 */

import java.io.*;
import java.util.*;

public class GestionStock {

    static void afficheMenu() {
        System.out.println("Menu :");
        System.out.println("e : entrée d'un produit");
        System.out.println("s : sortie d'un produit");
        System.out.println("i : incrémentation de la date du jour");
        System.out.println("q : quitter");
        System.out.print("> ");
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String choix = new String(" ");

        int dateJour = 0;

        final int taille = 50;
        Stock stock = new Stock(taille);

        GestionStock.afficheMenu();
        
        while (choix.charAt(0) != 'q') {
            choix = sc.nextLine();
            switch (choix.charAt(0)) {
                case 'e':
                    System.out.println("Saisir la référence :");
                    Produit produit = new Produit(dateJour);
                    stock.entrer(produit);
                    break;
                
                case 's':
                    stock.sortir(dateJour);
                    break;

                case 'i':
                    dateJour++;
                    break;

                case 'q':
                    System.out.println("Au revoir.");
                    break;

                default:
                    System.out.println("Erreur.");
                    break;
            }
            GestionStock.afficheMenu();
        }
        sc.close();
    }
}