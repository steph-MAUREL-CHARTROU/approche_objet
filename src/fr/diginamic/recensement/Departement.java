package fr.diginamic.recensement;


public class Departement implements Comparable<Departement> {

	private String codeDepartement;
	private int populationTotale;

	public Departement(String codeDepartement, int populationTotale) {
		super();

		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "département " +codeDepartement + " | Population totale : " + populationTotale + " nombres d'habitants";
	}

	@Override
	public int compareTo(Departement o) {

		if (this.populationTotale > o.populationTotale) {

			return -1;
		} else if (this.populationTotale < o.populationTotale) {

			return 1;

		} else
			return 0;
	}

}
