package fr.geometrie;

public class Rectangle implements ObjetGeometrique {
	
	int longueur;
	
	int largeur;
	
	
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	

	public int getLongueur() {
		return longueur;
	}

	

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		
		return  (longueur * 2) + ( largeur * 2) ;
	}

	@Override
	public double surface() {
		
		return longueur * largeur ;
	}

}
