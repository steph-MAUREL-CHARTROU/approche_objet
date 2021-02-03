package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 
 * @author StephanieMC
 *
 */

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> pays = new ArrayList<>();

		Pays france = new Pays(" France", 6500000, "Europe");
		Pays allemagne = new Pays("Allemagne", 80000000, "Europe");
		Pays belgique = new Pays("Belgique", 10000000, "Europe");
		Pays russie = new Pays("Russie", 150000000, "Asie");
		Pays chine = new Pays("Chine", 1400000000, "Europe");
		Pays indonesie = new Pays("Indonésie", 220000000, "Europe");
		Pays australie = new Pays("Australie", 20000000, "Europe");

		Collections.addAll(pays, france, allemagne, belgique, russie, chine, indonesie, australie);

		System.out.println(pays.toString());

		HashMap<String, Integer> mapPays = new HashMap<String, Integer>();

	}

}
