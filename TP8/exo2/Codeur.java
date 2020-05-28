package exo2;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Codeur
 */
public class Codeur {
	private HashMap<String,String> tab;

	public Codeur() {
		super();
		this.tab = new HashMap<String, String>();
	}

	public void ajout(String code, String valeur){
		this.tab.put(code, valeur);
	}

	public String Coder(String CH1){
		 return this.tab.get(CH1);
	}

	public int Coder(String CH1, String CH2){
		StringTokenizer ch1 = new StringTokenizer(CH1);
		int res = 0;
		String affiche = "";

		while (ch1.hasMoreElements()) {
			String cle = ch1.nextToken();
			try {
				res += Integer.parseInt(cle);
			} catch(NumberFormatException e) {
				if (tab.containsKey(cle)) {
					affiche += this.Coder(cle);
				} else {
					affiche += cle;
				}
			}
		}
		System.out.println(affiche);
		return res;
	}
}