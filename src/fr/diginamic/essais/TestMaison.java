package fr.diginamic.essais;



import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

/**
 * 
 * @author StephanieMC
 *
 */

public class TestMaison {

	public static void main(String[] args) {

		Piece[] tabMaison = { new Cuisine(14, 0), new Wc(3, 0), new Salon(22, 0), new Chambre(12, 0),
				new SalleDeBain(8, 1), new Chambre(10, 1), new Chambre(14, 1), new Wc(3, 1)

		};

		Maison premiereMaison = new Maison(tabMaison);
		
		premiereMaison.ajouterPiece(new Chambre(11,0));
		
		
	}

}
