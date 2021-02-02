package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> listeVille = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

		Collections.sort(listeVille, Comparator.comparing(s -> s.length())); // S = String

		System.out.println("La ville qui comprend le plus de lettres parmi tous ceux présent dans la liste est "
				+ listeVille.get(listeVille.size() - 1));

		for (int i = 0; i < listeVille.size(); i++) {

			System.out.println(listeVille.get(i).toUpperCase());
		}

		Iterator<String> iterator = listeVille.iterator();

		while (iterator.hasNext()) {

			String ville = iterator.next();

			if (ville.startsWith("N")) {

				iterator.remove();
			}

		}
		System.out.println(listeVille);
	}

}
