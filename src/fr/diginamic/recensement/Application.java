package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

		for (Ville montpellier : nouvelleListe) {

			if (montpellier.getNomCommune().equals("Montpellier")) {

				System.out.println(" MONTPELLIER \n" + montpellier);
				System.out.println("----------------------------------------------------");

			}

		}
		for (Ville vh : nouvelleListe) {

			if (vh.getCodeDepartement().equals("34")) {

				villesHerault.add(vh);

			}

		}
		int sommePop = 0;

		for (Ville v : villesHerault) {

			sommePop += v.populationTotale;

		}

		System.out.println(sommePop);

	}

}
