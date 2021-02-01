package fr.diginamic.banques;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestBanque {

	public static void main(String[] args) {
	
	Compte paypal = new Compte(1235589316, 25);
	CompteTaux taux = new CompteTaux(56987456, 652.54f, 2.3f);

		
		Compte[] tabCompte =  {paypal, taux };
		
		for( int i = 0; i < tabCompte.length; i++) {
			
			System.out.println(tabCompte[i]);
			
		}

}
}