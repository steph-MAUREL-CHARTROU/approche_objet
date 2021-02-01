package fr.geometrie;

/**
 * 
 * @author StephanieMC
 *
 */

public class Cercle implements ObjetGeometrique {
	
	double rayon;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	


	@Override
	public double perimetre() {
		
		 double resultPeri =  rayon * 2 * 3.14;
		
		return resultPeri ;
	}

	@Override
	public double surface() {
		
		 double resultSurf = 3.14 * (rayon * rayon);
		
		return resultSurf;
	}
	
	
}


