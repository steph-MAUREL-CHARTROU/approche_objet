package fr.diginamic.maison;
/**
 * 
 * @author StephanieMC
 *
 */

public class Maison {

	private Piece[] tabMaison;

	public Maison( Piece[] tabMaison) {

		this.tabMaison = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {

		Piece[] nvTab = new Piece[tabMaison.length + 1];
		for (int i = 0; i < tabMaison.length; i++) {
			nvTab[i] = tabMaison[i];
		}
		tabMaison = nvTab;

	}

	public double superficieTotale() {

		double superficie = 0;

		for (int i = 0; i < tabMaison.length; i++) {

			superficie += tabMaison[i].getSuperficie();

		}
		return superficie;
	}

	public double superficieEtage() {

		double superficieEtage = 0;
		for (int i = 0; i < tabMaison.length; i++) {

			int etage = 0;
			if (tabMaison[i].getNumEtage() == etage) {
				superficieEtage += tabMaison[i].getSuperficie();
			}
		}
		return superficieEtage;

	}
}
