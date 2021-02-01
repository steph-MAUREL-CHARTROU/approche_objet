package fr.diginamic.entites;
/**
 * 
 * @author StephanieMC
 *
 */

public class  Cercle {

	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	 public double calculPerimetre() {

		double resultPeri = rayon * 2 * 3.14;

		return resultPeri;

	}

	 public double calculSurface() {

		double resultSurf = 3.14 * (rayon * rayon);

		return resultSurf;
	}
}
