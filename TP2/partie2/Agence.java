package partie2;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Agence
 */
public class Agence {
    public final int tailleListe = 3;

    private ArrayList<Voiture> voitures;
    private ArrayList<Client> clients;
    private ArrayList<Location> locations;

    public Agence() throws IOException {
        voitures = new ArrayList<Voiture>(tailleListe);
        clients = new ArrayList<Client>(tailleListe);
        locations = new ArrayList<Location>(tailleListe);

        Voiture v1 = new Voiture("MR-L18-KM", "Break", 430, 18);
        Client c1 = new Client("Bernard", "Lannion");
        Location l1 = new Location(v1, c1, new Date(29, 9, 2019));

        voitures.add(v1);
        clients.add(c1);
        locations.add(l1);
    }

    /**
     * @param voitures the voiture to set
     */
    public void setVoiture(Voiture voiture) {
        voitures.add(voiture);
    }

    /**
     * @param clients the client to set
     */
    public void setClient(Client client) {
        clients.add(client);
    }

    public void afficherVoitures() {
        for (Voiture voiture : voitures) {
            System.out.println(voiture.toString());
        }
    }

    public void afficherClients() {
        for (Client client : clients) {
            System.out.println(client.toString());
        }
    }

    public void afficherlocation() {
        for (Location location : locations) {
            System.out.println(location.toString());
        }
    }

    public boolean isRegistered(int numeroClient) {
        boolean isFound = false;
        if (numeroClient > 0 && numeroClient <= clients.size()) {
            for (Client client : clients) {
                if (numeroClient == client.getNumero()) {
                    isFound = true;
                }
            }
        }
        return isFound;
    }

    public void afficherDispo() {
        for (Location location : locations) {
            if (location.getRetourDate() != null) {
                System.out.print(location.getNumero() + " = ");
                System.out.println(location.getVoiture().toString());
            }
        }
    }

    /**
     * @return the voiture in the ArrayList named voitures with the following parameter
     */
    public Voiture getVoiture(int numeroVoiture) {
        if (numeroVoiture < voitures.size() && numeroVoiture > 0){
            return voitures.get(numeroVoiture-1);
        } else {
            System.err.println("Erreur paramètre, le numéro voiture n'existe pas");
            return null;
        }
    }

    public void enregistrerLocation() throws IOException {
        int numeroClient;
        String saisie;
        
        System.out.println("Quel est le numéro du client ?");
        numeroClient = Saisir.entier();
        
        if (isRegistered(numeroClient)) {
            System.out.println("Le client est enregistré");
            System.out.println("Saisissez le numéro de la voiture souhaitée ou tapez * pour quitter : ");
            saisie = Saisir.chaine();
            if (saisie != "*") {
                locations.add(new Location(this.getVoiture(Integer.parseInt(saisie)), clients.get(numeroClient), new Date(10, 02, 2020)));
            }

        } else {
            System.out.println("Le client n'est pas enregistré ou le numéro est incorrecte.\nVeuillez retenter l'opération");
        }

    }

    
}