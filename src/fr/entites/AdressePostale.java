package fr.entites;
/**
 * 
 * @author StephanieMC
 *
 */

public class AdressePostale {
	
	
	public int numRue;
	public String rue;
	public String codePostal;
	public String ville;
	
	
	public AdressePostale(int numRue, String rue, String codePostal, String ville) {
		
		this.numRue = numRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	@Override
	public String toString() {
		return numRue + " , " + rue + " " + codePostal + " " + ville;
	}


	public int getNumRue() {
		return numRue;
	}


	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


}
