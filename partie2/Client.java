package partie2;

import java.io.*;

/**
 * Client
 */
public class Client {
    private int numero;
    private String nom;
    private String domicile;
    static private int nbClient = 0;

    public Client() throws IOException {
        System.out.println("Veuillez saisir au clavier les caractéristiques du client");
        System.out.print("Nom : ");
        this.nom = Saisir.chaine();
        System.out.print("\nDomicile : ");
        this.domicile = Saisir.chaine();

        nbClient++;
        this.numero = nbClient;
    }

    public Client(String nom, String domicile) {
        nbClient++;
        this.nom = nom;
        this.domicile = domicile;
        this.numero = nbClient;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the domicile
     */
    public String getDomicile() {
        return domicile;
    }

    /**
     * @return the Client
     */
    public String toString() {
        return numero + " " + nom + " " + domicile + " " + nbClient;
    }
}