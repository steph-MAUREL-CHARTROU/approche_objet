package tri;

import java.util.Comparator;

import listes.Ville;

/**
 * 
 * @author StephanieMC
 *
 */

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville autreVille1, Ville autreVille2) {

		int result = autreVille1.getNom().compareTo(autreVille2.getNom());
		return result;
	}

}
