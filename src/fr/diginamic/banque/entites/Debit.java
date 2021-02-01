package fr.diginamic.banque.entites;
/**
 * 
 * @author StephanieMC
 *
 */

public class Debit extends Operation{

	public Debit(String dateOperation, int montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return " Débit // ";
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
