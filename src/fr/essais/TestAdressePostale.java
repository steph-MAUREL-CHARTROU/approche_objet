package fr.essais;

import fr.entites.AdressePostale;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		
		adresse1.numRue = 35;
		adresse1.rue = "avenue de Genève";
		adresse1.codePostal="74140";
		adresse1.ville ="Douvaine";
		
AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numRue = 2;
		adresse2.rue = "allée des roches";
		adresse2.codePostal="66160";
		adresse2.ville ="Le boulou";
		
	}

}
