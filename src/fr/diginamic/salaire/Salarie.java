package fr.diginamic.salaire;

/**
 * 
 * @author StephanieMC
 *
 */

public class Salarie extends Intervenant {

	String typeContrat;
	Double salaireMensuel;

	public Salarie(String nom, String prenom, String typeContrat, Double salaireMensuel) {
		super(nom, prenom);
		this.typeContrat = typeContrat;
		this.salaireMensuel = salaireMensuel;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	// public Double getSalaireMensuel() {
	// return salaireMensuel;
	// }

	public void setSalaireMensuel(Double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {

		return salaireMensuel;

	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Salarié : ";
	}

	
}
