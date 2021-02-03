package maps;

import java.util.HashMap;
import java.util.Iterator;
/**
 * 
 * @author StephanieMC
 *
 */

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();

		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		// ajout des infos pour ces 3 villes

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Boucle pour afficher les clés + afficher

		Iterator<Integer> iter1 = mapVilles.keySet().iterator();

		while (iter1.hasNext()) { // je demande à ce qu'il aille jusqu'au bout

			Integer key1 = iter1.next();	
			
			System.out.println( key1);
			
		}
		
		Iterator<String> iter2 = mapVilles.values().iterator();

		while (iter2.hasNext()) { // je demande à ce qu'il aille jusqu'au bout

			String key2 = iter2.next();	
			
			System.out.println(key2);
			
		}
		
		System.out.println( "La taille de la map est de " + mapVilles.size());

	}

}
