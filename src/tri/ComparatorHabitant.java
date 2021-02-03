package tri;

import java.util.Comparator;

import listes.Ville;
/**
 * 
 * @author StephanieMC
 *
 */

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville autreVille1, Ville autreVille2) {
		
		if (autreVille1.getNbrHab() > autreVille2.getNbrHab()) {

			return 1;

		}
		if (autreVille1.getNbrHab()< autreVille2.getNbrHab()) {

			return -1;
		}

		return 0;
	}
	}




