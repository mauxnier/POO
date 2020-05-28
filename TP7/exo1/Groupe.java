package exo1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Groupe
 */
public class Groupe {

	private String nom;
	private HashSet<Etudiant> groupeEtu;
	private int nbEtudiant = groupeEtu.size();

	public Groupe(String nom) {
		this.setNom(nom);
		this.groupeEtu = new HashSet<Etudiant>();
	}

	public void ajoutEtu(Etudiant etudiant) {
		this.groupeEtu.add(etudiant);	
	}

	public void supprEtu(Etudiant etudiant) {
		if (groupeEtu.contains(etudiant)){
			this.groupeEtu.remove(etudiant);
		} else{
			System.err.println("Erreur: l'étudiant n'existe pas");
		}
	}

	public double moyGroupe() {
		Iterator<Etudiant> it = groupeEtu.iterator();
		double addition = 0.0;
		double res;

		if (groupeEtu.size() != 0) {
			while (it.hasNext()) {
				Etudiant cle = it.next();
				addition = addition + cle.calcMoy();
			}
			res = addition / groupeEtu.size();
		} else {
			res = -1;
		}
		return res;
	}
	
	public void afficheEtuEx() {
		Iterator <Etudiant> it = groupeEtu.iterator();

		if (groupeEtu.size() != 0) {
			Etudiant min = it.next();
			Etudiant max = min;

			while (it.hasNext()) {
				Etudiant cle = it.next();
				if (cle.calcMoy() < min.calcMoy()) {
					min = cle;
				} else if (cle.calcMoy() > max.calcMoy()) {
					max = cle;
				}
			}
			System.out.println("Premier de la classe : " + max.getNom() + ", dernier de la classe : " + min.getNom());
		} else {
			System.err.println("Erreur: groupe vide");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtudiant() {
		return nbEtudiant;
	}

	public void setNbEtudiant(int nbEtudiant) {
		this.nbEtudiant = nbEtudiant;
	}
	
	public void afficheEtu() {
		Iterator<Etudiant> it = groupeEtu.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}