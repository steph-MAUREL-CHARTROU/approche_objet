package fr.diginamic.banque.entites;

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
}
