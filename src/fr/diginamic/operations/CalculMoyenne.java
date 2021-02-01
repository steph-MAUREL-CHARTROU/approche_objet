package fr.diginamic.operations;
/**
 * 
 * @author StephanieMC
 *
 */

public class CalculMoyenne {

	double[] tab = new double[2];
	int i = 0;

	public CalculMoyenne() { // constructeur
		super();
	}

	public void ajout(double nb) {

		if (i > tab.length - 1) {

			double[] tab1 = new double[tab.length + 1];

			for (int j = 0; j < tab.length; j++) {

				tab1[j] = tab[i];

			}

			tab = tab1;

		}

		tab[i] = nb;

		i++;

	}

	public double calcul() { 
		
		double total = 0;
		
		for( int i = 0; i < tab.length; i ++) {
			
			total += tab[i];
		}
		
		double moyenne = total / tab.length;
		
		return moyenne;

	}

}
