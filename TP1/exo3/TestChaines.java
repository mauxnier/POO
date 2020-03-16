import java.io.*;
import java.util.*;
import java.lang.*;

public class TestChaines{
	public static void main(String[] args) throws Exception{/*
		//A.
		int entier = 12345;
		String str = String.valueOf(entier);
		System.out.println("A. " + str);
		//B.*/
		Scanner clavier = new Scanner(System.in);/*
		System.out.println("B. Rentrez un nombre au clavier : ");
		String chaine = clavier.next(); //retourne l'input en string dans la var chaine
		System.out.println("Vous avez tapé : " + chaine);
		int nombre = Integer.parseInt(chaine) + 1;
		System.out.println(nombre);
		//C
		System.out.println("C. Rentrez un nombre flottant au clavier : ");
		chaine = clavier.next();
		System.out.println("Vous avez tapé : " + chaine);
		float flottant = Float.parseFloat(chaine) + (float)1.1;
		System.out.println(flottant);
		//D
		System.out.println("D. Rentrez un nom de ville au clavier : ");
		chaine = clavier.next();
		chaine = chaine.trim().toUpperCase(); //enleve les espaces avant et apres la chaine et la change en MAJ
		System.out.println("Vous avez tapé : " + chaine);
		//E
		System.out.println("E. Rentrez deux chaines au clavier : ");
		String s1 = clavier.next();
		String s2 = clavier.next();
		if (s1.charAt(0) == s2.charAt(0)){
			System.out.println("Ces deux chaines commencent par le meme caractere");
		} else {
			System.out.println("Ces deux chaines ne commencent pas par le meme caractere");
		}
		//F
		System.out.println("F. Rentrez deux chaines au clavier : ");
		s1 = clavier.next();
		s2 = clavier.next();
		System.out.println("s1 est egale a s2 : " + s1.equals(s2));
		System.out.println("s1 compare a s2 lexicographiquement : " + s1.compareTo(s2));
		System.out.println("pareil que avant mais en ignorant la casse : " + s1.compareToIgnoreCase(s2));
		//G
		System.out.println("G. Rentrez deux chaines au clavier : ");
		s1 = clavier.next();
		s2 = clavier.next();
		System.out.println("s1 commence-t-elle par s2 : " + s1.startsWith(s2));
		System.out.println("s1 finit-t-elle par s2 : " + s1.endsWith(s2));
		System.out.println("s1 contient-t-elle par s2 : " + s1.contains(s2));
		//H*/
		System.out.println("H. Rentrez deux chaines au clavier : ");
		String s1 = entree.readLine();
		String s2 = entree.readLine();
		if (s1.contains(s2)){
			s1.
		/*
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		String s1 = entree.readLine();
		String s2 = entree.readLine();
		if (s1.contains(s2)){
			int indexS2 = s1.indexOf(s2);
			int longueurS2 = s2.length();
			char car;
			StringBuffer buff = new StringBuffer(s1);
			for(int i = indexS2; (i < indexS2 + longueurS2) && (i < .length()-1); i++){
				car = buff.charAt(i + longueurS2);
				buff.setCharAt(i, car);
			}
			s1 = new String(buff);
		}
		System.out.println(s1);
		*/
	}
}
