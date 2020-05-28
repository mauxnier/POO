package exo1;

import java.util.ArrayList;

/**
 * Concert
 */
public class Concert {

    private String identifiant;
    private Salle salle;
    private Date date;

	public String getIdentifiant() {
		return this.identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public Salle getSalle() {
		return this.salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	ArrayList<ProduitDerive> listProduit;
    static final private int MAX = 100;
    
    public String getListProduit() {
		String list = "";
		for (int i = 0; i < listProduit.size(); i++) {
			list += plist.get(i).toString() + " | ";
		}
		return list;
	}

    public Concert(String identifiant, Salle salle, Date date) {
        this.identifiant = identifiant;
        this.salle = salle;
        this.date = date;
        listProduit = new ArrayList<ProduitDerive>(MAX);
    }

    public void addProduit(ProduitDerive produitDerive) {
		if (listProduit.size() < MAX && !listProduit.contains(p)) {
			listProduit.add(produitDerive);
		} else {
			System.out.println("Error : ArrayList of ProduitDerive is full or the ProduitDerive you want to add is already in the ArrayList");
		}
	}
	
	public void delProduit(ProduitDerive produitDerive) {
		if (listProduit.size() > 0 && listProduit.contains(p)) {
			for (int i = 0; i < listProduit.size(); i++) {
				if (listProduit.get(i) == produitDerive) {
					listProduit.remove(i);
				}
			}
		} else {
			System.out.println("Error : ArrayList of ProduitDerive is empty or the ProduitDerive you want to delete is not in the ArrayList");
		}
	}
	
	public void displayListProduit() {
		for (int i = 0; i < listProduit.size(); i++) {
			System.out.println(listProduit.get(i).toString());
		}
	}

    @Override
	public String toString() {
		return "---------------------- Concert ----------------------\n    identifiant: " + identifiant + "\n    salle: " + salle + "\n    date: " + date + "\n    listProduit: " + getListProduit;
	}
	
	public void display() {
		System.out.println(toString());
	}
}