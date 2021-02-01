package fr.diginamic.salaire;

/**
 * 
 * @author StephanieMC
 *
 */

public class Pigiste extends Intervenant {

	double nbrJoursMensuel;

	double paieMontantJournalier;

	public Pigiste(String nom, String prenom, double nbrJoursMensuel, double paieMontantJournalier) {
		super(nom, prenom);
		this.nbrJoursMensuel = nbrJoursMensuel;
		this.paieMontantJournalier = paieMontantJournalier;
	}

	public double getNbrJoursMensuel() {
		return nbrJoursMensuel;
	}

	public void setNbrJoursMensuel(double nbrJoursMensuel) {
		this.nbrJoursMensuel = nbrJoursMensuel;
	}

	// public double getPaieMontantJournalier() {
	// return paieMontantJournalier;
	// }

	public void setPaieMontantJournalier(double paieMontantJournalier) {
		this.paieMontantJournalier = paieMontantJournalier;
	}

	@Override
	public double getSalaire() {

		return paieMontantJournalier * nbrJoursMensuel;

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Pigiste : ";
	}

	

}
