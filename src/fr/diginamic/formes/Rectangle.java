package fr.diginamic.formes;
/**
 * 
 * @author StephanieMC
 *
 */

public class Rectangle extends Forme {

	double longueur;
	double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		
		return longueur * largeur ;
	}

	@Override
	public double calculerPerimetre() {
		
		return  (longueur * 2) + ( largeur * 2) ;
	}
}

	