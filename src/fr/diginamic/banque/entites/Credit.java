package fr.diginamic.banque.entites;
/**
 * 
 * @author StephanieMC
 *
 */

public class Credit extends Operation {

	public Credit(String dateOperation, int montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
		

	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return " Crédit // ";
	}

	@Override
	public String getDateOperation() {
		// TODO Auto-generated method stub
		return dateOperation;
	}

	@Override
	public int getMontant() {
		// TODO Auto-generated method stub
		return montant;
	}

	@Override
	public void setMontant() {
		// TODO Auto-generated method stub
		
	}
}
