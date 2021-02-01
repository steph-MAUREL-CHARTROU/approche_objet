package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * 
 * @author StephanieMC
 *
 */

public class Affichageforme {
	
	public static void afficher(Forme forme) {
		
		
		System.out.println(forme.getClass().getSimpleName());
		System.out.println( " le périmètre est de : " + forme.calculerPerimetre());
		System.out.println( " la surface est de : " + forme.calculerSurface());
	}

	
	
}
