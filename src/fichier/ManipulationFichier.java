package fichier;

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

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		Path pathFile1 = Paths.get("C:/Users/33782/Desktop/DiginamicWork/java/recensement.csv");

		try {
			List<String> lines = Files.readAllLines(pathFile1, StandardCharsets.UTF_8);
			
			lines.remove(0);

			for (int i = 0; i < lines.size(); i++) {

				System.out.println(lines.get(i));
			}

			List<String> lines2 = new ArrayList<>();

			for (int i = 0; i < lines.size(); i++) {

				String ligne = lines.get(i); // je récupère la ligne en cours et je la stocke dans une variable

				String[] tab = ligne.split(";"); // Je découpe la ligne en " index " en retirant le ";" et stockage dans
													// tableau [] tab

				int NbHab = Integer.parseInt(tab[9].trim().replace(" ", ""));
				// je transforme la case de la population en Integer // je récupère l'index en lisant le premier fichier

				if (NbHab > 25000) { // condition

					String infoVille = tab[6] + ";" + tab[2] + ";" + tab[9]; // je crée ma nouvelle ligne de type String

					lines2.add(infoVille); // j'ajoute 
				}

			}

			Path pathNew = Paths.get("C:/Users/33782/Desktop/DiginamicWork/java/recensement2.csv");

			Files.write(pathNew, lines2 ); // méthode pour écrire le fichier // 2 paramètres ( le nouveau fichier, ce qu'on copie)

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
