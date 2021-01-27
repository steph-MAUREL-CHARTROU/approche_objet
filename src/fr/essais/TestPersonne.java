package fr.essais;

import fr.entites.AdressePostale;
import fr.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale a1 = new AdressePostale(65, "avenue des pr�s d'ar�nes", "34070", "Montpellier");

		Personne durand = new Personne("Jacques", "Durand", a1);

	  
	   
	    a1.setNumRue(50);
	    a1.setRue("Rue de l'amour");
	    a1.setCodePostal("34680");
	    a1.setVille("Saint Georges d'Orques");
	    
	    System.out.println(durand.toString());

	}
	
	

}
