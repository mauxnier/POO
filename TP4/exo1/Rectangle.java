package exo1;

/**
 * Rectangle
 */
public class Rectangle extends FormeGeometrique implements Dessinable, Comparable<Rectangle> {

    private double largeur;
    private double hauteur;

    public Rectangle(int posX, int posY, double largeur, double hauteur) {
        super(posX, posY);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double perimetre() {
        return (largeur + hauteur) * 2;
    }

    public double surface() {
        return largeur * hauteur;
    }

    public void dessiner(String couleur) {
        System.out.println("Rectangle " + couleur);
    }

    @Override
    public int compareTo(Rectangle autre) {
        if (this.surface() > autre.surface())
            return 1;
        else if (this.surface() == autre.surface())
            return 0;
        else
            return -1;
    }
}