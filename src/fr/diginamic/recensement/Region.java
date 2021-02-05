package fr.diginamic.recensement;

public class Region implements Comparable<Region> {

	private String codeRegion;
	private String nomRegion;
	private int popTotRegion;
	
	@Override
	public int compareTo(Region o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Region(String codeRegion, String nomRegion, int popTotRegion) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.popTotRegion = popTotRegion;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotRegion() {
		return popTotRegion;
	}

	@Override
	public String toString() {
		return  codeRegion + "| Région : " + nomRegion + " | Population Totale : " + popTotRegion + " nombres d'habitants";
	}

	public void setPopTotRegion(int popTotRegion) {
		this.popTotRegion = popTotRegion;
	}
	


}
