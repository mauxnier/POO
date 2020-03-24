package exo1;

import java.util.ArrayList;

/**
 * LesSports
 */
public class LesSports {
    private ArrayList<Sport> sports;

    public LesSports(int initialCapacity) {
        sports = new ArrayList<Sport>(initialCapacity);
    }
    /**
     * @param sport the sport to set in the ArrayList named sports
     */
    public void ajouterSport(Sport sport) {
        sports.add(sport);
    }
    /**
     * @view all the sport in the ArrayList named sports 
     */
    public void listerSport() {
        System.out.println("---------------------------");
        for (Sport sport : sports) {
            System.out.println(sport.toString());
            System.out.println("---------------------------");
        }
    }
}