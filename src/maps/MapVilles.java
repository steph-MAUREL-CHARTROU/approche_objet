package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassone", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 97000);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 343000);

		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put("Nice", nice);
		mapVilles.put("Carcassonne", carcassonne);
		mapVilles.put("Narbonne", narbonne);
		mapVilles.put("Lyon", lyon);
		mapVilles.put("Foix", foix);
		mapVilles.put("Pau", pau);
		mapVilles.put("Marseille", marseille);
		mapVilles.put("Tarbes", tarbes);

		// Rechercher er supprimer la ville qui a le moins d'habitant

		long min = Integer.MAX_VALUE;
		String villeOut = null;

		Iterator<String> iter = mapVilles.keySet().iterator();

		while (iter.hasNext()) {

			String key = iter.next();
			Ville ville = mapVilles.get(key);

			if (ville.getNbrHab() < min) {
				
				min = ville.getNbrHab();
				villeOut = key;

			}
		}
		
		mapVilles.remove(villeOut);
		System.out.println(" La ville avec le moins d'habitant est " + villeOut);
		System.out.println( " Voici la liste MAJ :\n " +mapVilles);

	}

}
