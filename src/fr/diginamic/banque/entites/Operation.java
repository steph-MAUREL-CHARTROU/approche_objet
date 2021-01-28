package fr.diginamic.banque.entites;

public abstract class Operation {

	String dateOperation;
	int montant;

	public Operation(String dateOperation, int montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return " Date : " + dateOperation + " Montant : " + montant + " €";
	}

	public abstract String afficherType();

	public abstract String getDateOperation();

	public abstract int getMontant();

	public abstract void setMontant();

}
