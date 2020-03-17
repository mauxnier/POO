package partie1;

/**
 * Pile
 */
public class Pile {

    private Produit[] tabProduit;
	private int index;
	private int max;
	
	public Pile(int max){
		tabProduit = new Produit[max];
		index = -1;
		this.max = max;
	}
	
	public boolean pilevide(){
		boolean bool;
		if (index == -1) bool = true;		
		else bool = false;
		return bool;
	}

	public boolean pilepleine(){
		boolean bool;
		if (index == max-1) bool = true;
		else bool = false;
		return bool;
	}

	public void empiler(Produit p){
		if (!pilepleine()){
			index++;
			tabProduit[index] = p;
		} else System.out.println("Le stock est plein");	
	}
	
	public void depiler(){
		if (!pilevide()){
			index--;
		} else System.out.println("Le stock est vide");	
	}
	
	public Produit sommet(){
		return tabProduit[index];
	}
}