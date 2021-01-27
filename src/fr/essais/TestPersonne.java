package fr.essais;

import fr.entites.AdressePostale;
import fr.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale a1 = new AdressePostale(65, "avenue des prés d'arènes", "34070", "Montpellier");

		Personne durand = new Personne("Jacques", "Durand", a1);

	}

}
