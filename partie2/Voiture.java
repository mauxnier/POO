package partie2;

import java.io.*;

/**
 * Voiture
 */
public class Voiture {
    private String matricule;
    private String modele;
    private int nbKm;
    private float tarif;

    public Voiture() throws IOException {
        System.out.println("Veuillez saisir au clavier les caractéristiques de la voiture : ");
        System.out.println("Immatriculation : ");
        this.matricule = Saisir.chaine();
        System.out.println("Modèle : ");
        this.modele = Saisir.chaine();
        System.out.println("Nombre de Kilomètres parcourus  : ");
        this.nbKm = Saisir.entier();
        System.out.println("Tarif de location au Kilomètre : ");
        this.tarif = Saisir.reelf();
    }

    public Voiture(String matricule, String modele, int nbKm, float tarif) {
        this.matricule = matricule;
        this.modele = modele;
        this.nbKm = nbKm;
        this.tarif = tarif;
    }

    /**
     * @return the modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * @return the nbKm
     */
    public int getNbKm() {
        return nbKm;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    /**
     * @return the Voiture
     */
    public String toString() {
        return "Immatriculation : " + matricule + " | Modèle : " + modele + " | " + nbKm + " Km | Tarif : " + tarif;
    }
}