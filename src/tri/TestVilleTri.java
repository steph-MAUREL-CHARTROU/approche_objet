package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;
/**
 * 
 * @author StephanieMC
 *
 */


public class TestVilleTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> villeTri = new ArrayList<>();
		
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassone", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 97000);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 343000);

		Collections.addAll(villeTri, nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes);
		
		Collections.sort(villeTri, new ComparatorHabitant());
		
		System.out.println(villeTri);
	}

}
