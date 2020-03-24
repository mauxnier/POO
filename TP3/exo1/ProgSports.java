package exo1;

/**
 * ProgSports
 */
public class ProgSports {
    public static void main(String[] args) {
        final int MAX = 5;
        LesSports sports = new LesSports(MAX);
        SportCo football = new SportCo(1, "Football", 22);
        SportCo basketball = new SportCo(2, "Basketball", 10);
        SportCo handball = new SportCo(3, "Handball", 7);
        Sport judo = new Sport(4, "Judo");
        Sport lancerDeTroncDarbre = new Sport(5, "Lancer de tronc d'arbre");


        sports.ajouterSport(football);
        sports.ajouterSport(basketball);
        sports.ajouterSport(handball);
        sports.ajouterSport(judo);
        sports.ajouterSport(lancerDeTroncDarbre);

        sports.listerSport();
    }
    
}