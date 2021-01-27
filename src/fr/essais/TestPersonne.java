package fr.essais;

import fr.entites.AdressePostale;
import fr.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		
		AdressePostale a1 = new AdressePostale();
		
		a1.numRue = 35;
		a1.rue = "avenue de Genève";
		a1.codePostal="74140";
		a1.ville ="Douvaine";


		Personne durand = new Personne();
		
		durand.nom = "Jacques";
		durand.prenom = "Durand";
		durand.adressePostale = a1;
	}

}
