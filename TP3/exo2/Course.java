package exo2;

import java.util.ArrayList;

/**
 * Course
 */
public class Course {
    private String nom;
    private double dotation;
    private ArrayList<ChevalDeCourse> chevauxDeCourse;
    private static final int tailleMax = 10;

    public Course(String nom, double dotation) {
        this.nom = nom;
        this.dotation = dotation;
        chevauxDeCourse = new ArrayList<ChevalDeCourse>(tailleMax);
    }

    public void affiche() {
        for (ChevalDeCourse cheval : chevauxDeCourse) {
            System.out.println(cheval.toString() + " | Nom de la course : " + nom + " | Dotation : " + dotation);
        }
    }

    public boolean chevalPresent(String nom) {
        boolean isFound = false;
        int i = 0;

        while ((!isFound) && (i < chevauxDeCourse.size())) {
            if (chevauxDeCourse.get(i).getNom().equals(nom)) {
                isFound = true;
            } else {
                i++;
            }
        }
        return isFound;
    }

    public boolean enregistre(ChevalDeCourse cheval) {
        if (chevalPresent(cheval.getNom())) {
            return false;
        } else {
            if (chevauxDeCourse.size() < tailleMax) {
                chevauxDeCourse.add(cheval);
                return true;
            } else {
                return false;
            }
        }
    }

    public void rechercheCheval(String nom) {
        boolean isFound = false;
        int i = 0;

        while ((!isFound) && (i < chevauxDeCourse.size())) {
            if (chevauxDeCourse.get(i).getNom().equals(nom)) {
                isFound = true;
            } else {
                i++;
            }
        }
        
        if (i != chevauxDeCourse.size()) {
            chevauxDeCourse.get(i).affiche();
        } else {
            System.out.println("absent");
        }
    }
}