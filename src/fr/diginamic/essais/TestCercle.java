package fr.diginamic.essais;
/**
 * @author StephanieMC
 */


import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;



// EXERCICE CERCLE TP- J3 & J4

public class TestCercle {

	public static void main(String[] args) {
		
		
	 Cercle cercle1 = CercleFactory.factory(6);
	 Cercle cercle2 = CercleFactory.factory(10);
	 
		

		System.out.println(" Le périmètre du cercle 1 est de : " + cercle1.calculPerimetre()
				+ " cm et sa surface est de " + cercle1.calculSurface() + " cm");
		System.out.println(" Le périmètre du cercle 2 est de : " + cercle2.calculPerimetre()
				+ " cm et sa surface est de " + cercle2.calculSurface() + " cm");

	}

}


