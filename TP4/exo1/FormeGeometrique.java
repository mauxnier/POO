package exo1;

/**
 * FormeGeometrique
 */
public abstract class FormeGeometrique {
    
    private int posX;
    private int posY;
    private double perimetre;
    private double surface;
    private String couleur;

    public FormeGeometrique(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public void deplacer(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void afficherPosition() {
        System.out.println("Position de la forme :");
        System.out.println("X : " + posX);
        System.out.println("Y : " + posY);
        System.out.println("----------------------");
    }

    public abstract double surface();
    public abstract double perimetre();

    /**
     * @return the perimetre
     */
    public double getPerimetre() {
        return perimetre;
    }

    /**
     * @return the surface
     */
    public double getSurface() {
        return surface;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }
}