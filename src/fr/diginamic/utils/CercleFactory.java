package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public CercleFactory(double rayon) {
		
	}
	
	public static  Cercle factory(double rayon) {
		
		 Cercle cercle = new Cercle(rayon);
		 
		 return cercle;
		
	}


}