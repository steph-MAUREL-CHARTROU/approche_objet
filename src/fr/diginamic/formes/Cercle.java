package fr.diginamic.formes;

public class Cercle extends Forme {

	double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		
		double resultSurf = 3.14 * (rayon * rayon);

		return resultSurf;
	}

	@Override
	public double calculerPerimetre() {

		double resultPeri = rayon * 2 * 3.14;

		return resultPeri;
	}

}
