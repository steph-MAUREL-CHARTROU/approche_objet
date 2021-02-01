package fr.diginamic.chaines;

import java.util.Arrays;
/**
 * 
 * @author StephanieMC
 *
 */

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);

		int longueurChaine = chaine.length();
		System.out.println(longueurChaine);
		
		
		int indexPointVirgule = chaine.indexOf(";");
		System.out.println( indexPointVirgule);
		
		String nomDeFamille = chaine.substring(0, chaine.indexOf(";"));
		System.out.println(nomDeFamille);
		
		
		
		System.out.println(nomDeFamille.toUpperCase());
		System.out.println(nomDeFamille.toLowerCase());
		
		String []tabChaine = chaine.split(";");
		
		System.out.println(Arrays.toString(tabChaine));
		
	}

}
