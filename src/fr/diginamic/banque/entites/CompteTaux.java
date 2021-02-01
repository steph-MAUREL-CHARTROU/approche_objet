package fr.diginamic.banque.entites;
/**
 * 
 * @author StephanieMC
 *
 */

public class CompteTaux extends Compte {

	private float tauxRemun;

	public CompteTaux(long numcompte, float solde, float tauxRemun) {
		super(numcompte, solde);
		this.tauxRemun = tauxRemun;
	}

	@Override
	public String toString() {

		String compte = super.toString();

		return compte + " Taux de rémunération : " + tauxRemun + " % ";
	}

	public float getTauxRemun() {
		return tauxRemun;
	}

	public void setTauxRemun(int tauxRemun) {
		this.tauxRemun = tauxRemun;
	}

}
