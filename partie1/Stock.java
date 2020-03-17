package partie1;

/**
 * Stock
 */
public class Stock {

    private Pile pile;

    public Stock(int taille) {
        pile = new Pile(taille);
    }

    public void entrer(Produit produit) {
        if (pile.pilepleine()) {
            System.out.println("Erreur : Pile pleine");
        } else {
            pile.empiler(produit);
        }
    }

    public void sortir(int dateJour) {
        if (pile.pilevide()) {
            System.out.println("Erreur : Pile vide");
        } else {
            if ((dateJour - pile.sommet().getDateEntree()) <= 5) {
                pile.depiler();
            } else {
                System.out.println("On jette ces produits : ");
                while ((dateJour - pile.sommet().getDateEntree()) > 5) {
                    pile.depiler();
                }
            }
        }
    }
}