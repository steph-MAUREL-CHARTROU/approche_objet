package fr.diginamic.recensement;

import java.util.Comparator;

public class Comparator10Moins implements Comparator<Ville>{

	@Override
	public int compare(Ville a, Ville b) {
	

		if (a.getPopulationTotale() < b.getPopulationTotale()) {

			return 1;

		}
		if (a.getPopulationTotale()>b.getPopulationTotale() ) {

			return -1;
		}

		return 0;
	}
		
}
