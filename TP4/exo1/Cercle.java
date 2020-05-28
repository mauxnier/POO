package exo1;

/**
 * Cercle
 */
public class Cercle extends FormeGeometrique implements Dessinable {

    private double rayon;

    public Cercle(int posX, int posY, double rayon) {
        super(posX, posY);
        this.rayon = rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public void dessiner(String couleur) {
        System.out.println("Cercle " + couleur);
    }
}