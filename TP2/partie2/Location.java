package partie2;

/**
 * Location
 */
public class Location {
    private int numero = 0;
    private Voiture voiture;
    private Client client;
    private Date locationDate;
    private Date retourDate;
    private int nbKm;
    
    public Location(Voiture voiture, Client client, Date locationDate) {
        this.numero++;
        this.retourDate = null;
        this.nbKm = voiture.getNbKm();
    }
    
    /**
     * @return the Location
     */
    public String toString() {
        if (retourDate != null){
            return "Location terminée : La voiture " + voiture.toString() + " numéro " + numero + " appartenant au client " + client.toString() + " a loué la voiture le " + locationDate + " et l'a rendu le " + retourDate + ". Le client a au total parcouru " + nbKm + " Km.";
        } else {
            return "Location en cours : La voiture " + voiture.toString() + " numéro " + numero + " appartenant au client " + client.toString() + " a loué la voiture le " + locationDate + ". Le client a actuellement parcouru " + nbKm + " Km.";
        }    
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @return the retourDate
     */
    public Date getRetourDate() {
        return retourDate;
    }

    /**
     * @return the voiture
     */
    public Voiture getVoiture() {
        return voiture;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
}