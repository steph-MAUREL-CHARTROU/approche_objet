package fr.diginamic.banque.entites;

public class Compte {
	
	 private long numcompte;
	 private float solde;
	
	
	public Compte( long numcompte, float solde) {
	
		this.numcompte = numcompte;
		this.solde = solde;
	}


	@Override
	public String toString() {
		return "Compte N° " + numcompte + ", solde :" + solde + " €";
	}


	public long getNumcompte() {
		return numcompte;
	}


	public void setNumcompte(long numcompte) {
		this.numcompte = numcompte;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


}
