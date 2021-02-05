package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import tri.ComparatorHabitant;

/**
 * 
 * @author StephanieMC
 *
 */

public class Application {

	public static void main(String[] args) throws IOException {

		Path pathFile1 = Paths.get("C:/Users/33782/Desktop/DiginamicWork/java/recensement.csv");

		List<String> listeOriginale = Files.readAllLines(pathFile1, StandardCharsets.UTF_8);

		listeOriginale.remove(0);

		List<Ville> nouvelleListe = new ArrayList<>();
		List<Ville> villesHerault = new ArrayList<>();

		for (String line : listeOriginale) {

			String[] morceaux = line.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[9];

			int populationTotale = Integer.parseInt(population.replace(" ", ""));

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
			nouvelleListe.add(ville);

		}
		// Etape 3
		// Je récupère la ville de Montpellier avec une boucle objet

		for (Ville montpellier : nouvelleListe) {

			if (montpellier.getNomCommune().equals("Montpellier")) {

				System.out.println(" MONTPELLIER \n" + montpellier);
				System.out.println("----------------------------------------------------");

			}

		}
		// Etape 4
		// Je récupère toutes les villes de l'hérault que j'ajoute à mon arrayList
		// déclarée en haut villeHérault

		for (Ville vh : nouvelleListe) {

			if (vh.getCodeDepartement().equals("34")) {

				villesHerault.add(vh);

			}

		}

		// Et enfin, je travaille sur la liste des villes de l'Hérault pour récupérer la
		// somme de toutes les populationTotale des villes.
		int sommePop = 0;

		for (Ville v : villesHerault) {

			sommePop += v.populationTotale;

		}

		System.out.println(sommePop);

		// Etape 5
		// Afficher la plus petite ville du département de l"hérault

		int min = Integer.MAX_VALUE;

		Ville villeMin = null;

		for (int i = 0; i < villesHerault.size(); i++) {

			Ville ligneEnCours = villesHerault.get(i); // récupération de la ligne en cours que je vais pouvoir comparer

			if (ligneEnCours.populationTotale < min) {

				min = ligneEnCours.populationTotale;

				villeMin = ligneEnCours;

			}

		}
		System.out.println(villeMin);

	}

}
