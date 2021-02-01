package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("Lagaffe", "Gaston", "CDI", 1921.66);
		Pigiste pigiste1 = new Pigiste("Squirell", "Colin", 4, 180);

		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());
		
		System.out.println("-------------------------");
		
		System.out.println(salarie1.afficherDonnees());
		System.out.println(pigiste1.afficherDonnees());

	}
}