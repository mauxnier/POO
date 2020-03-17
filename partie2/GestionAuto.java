package partie2;

import java.io.*;
//import java.util.ArrayList;

/**
 * GestionAuto
 */
public class GestionAuto {
    public static void main(String[] args) throws IOException {
    /*
        //Question 1
        Voiture laVoitureDeNicolas = new Voiture();
        System.out.println("Le modèle de la voiture de Nicolas est " + laVoitureDeNicolas.getModele());

        System.out.println("Veuillez saisir un tarif au Km pour la voiture de Nicolas : ");
        float newTarif = Saisir.reelf();
        laVoitureDeNicolas.setTarif(newTarif);

        System.out.println("Les caractéristiques de la voiture de Nicolas sont " + laVoitureDeNicolas.toString());

        //Question 2
        ArrayList<Voiture> voitures10 = new ArrayList<Voiture>(10);
        Voiture v1 = new Voiture(); Voiture v2 = new Voiture();
        voitures10.add(0, v1);
        voitures10.add(1, v2);
        String display1;
        String display2;

        for (int i = 0; i < voitures10.size(); i++) { //chose
            display1 = voitures10.get(i).toString();
            System.out.println("display 1 : " + display1);
        }

        voitures10.remove(0);

        for (Voiture i : voitures10) { //même chose
            display2 = i.toString();
            System.out.println("display 2 : " + display2);
        }

        //Question 3
        Client nicolas = new Client();
        System.out.println("Le client " + nicolas.getNom() + " habite au domicile " + nicolas.getDomicile() + " et a le numéro " + nicolas.getNumero());

        //Question 4
        Date aujDate = new Date();
        System.out.println("La date d'aujourd'hui est " + aujDate.toString());

        //Question 5
        Location nvlLocation = new Location(laVoitureDeNicolas, nicolas, aujDate);
        System.out.println(nvlLocation.toString());

        //Question 6
        Agence agenceAuto = new Agence();
        agenceAuto.setVoiture(laVoitureDeNicolas);
        agenceAuto.setClient(nicolas);
    */
        //Menu
        Agence agenceAuto = new Agence();
        boolean isClosed = false;
        boolean errorFormat = false;
        int choix = 0;
    
        while (!isClosed) {
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Enregistrer une nouvelle location");
            System.out.println("2 - Enregistrer un nouveau client dans l'agence");
            System.out.println("3 - Enregistrer une nouvelle voiture dans l'agence");
            System.out.println("4 - Afficher les locations disponibles");
            System.out.println("5 - Afficher la liste des locations");
            System.out.println("6 - Afficher la liste des clients enregistrés");
            System.out.println("7 - Afficher la liste des voitures enregistrées");
            System.out.println("8 - Quitter le menu");
            System.out.println("--------------------------------------------------");

            try {
                choix = Integer.parseInt(Saisir.chaine());
            } catch (NumberFormatException e) {
                System.err.println("Erreur de saisie, veuillez réessayer");
                errorFormat = true;
            }

            if (!errorFormat) {
                switch (choix) {
                    case 1:
                        agenceAuto.enregistrerLocation();
                        break;
    
                    case 2:
                        Client client = new Client();
                        agenceAuto.setClient(client);
                        break;
    
                    case 3:
                        Voiture voiture = new Voiture();
                        agenceAuto.setVoiture(voiture);
                        break;
    
                    case 4:
                        agenceAuto.afficherDispo();
                        break;
    
                    case 5:
                        agenceAuto.afficherlocation();
                        break;
    
                    case 6:
                        agenceAuto.afficherClients();
                        break;
    
                    case 7:
                        agenceAuto.afficherVoitures();
                        break;
    
                    case 8:
                        isClosed = true;
                        break;
    
                    default:
                        System.err.println("Cette action n'existe pas, veuillez réessayer");
                        break;
                }
            }
        }
    }
}