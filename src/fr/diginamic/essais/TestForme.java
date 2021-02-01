package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;


/**
 * 
 * @author StephanieMC
 *
 */

public class TestForme {

	public static void main(String[] args) {
		
		
		Cercle cercle1 = new Cercle(6);
		Rectangle rect1 = new Rectangle(10, 5);
		Carre car1 = new Carre(9);
		
		
		Affichageforme.afficher(cercle1);
		Affichageforme.afficher(rect1);
		Affichageforme.afficher(car1);
	}
	
	

}
