package fr.diginamic.essais;

import fr.entites.Salarie;

/**
 * 
 * @author StephanieMC
 *
 */

public class Testsalarie {

	public static void main(String[] args) {
		
		String salaire = "2 523.5";
		
		 salaire=salaire.replace(" ", "");
		 
		 double salaireOk = Double.parseDouble(salaire);
		 
		 Salarie salarie1 = new Salarie("Durand", "Marcel", salaireOk);
	}

}
