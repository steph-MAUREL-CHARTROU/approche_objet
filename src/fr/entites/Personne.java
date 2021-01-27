package fr.entites;

public class Personne {
	
	
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
    
	 

	@Override
	public String toString() {
		return  nom.toUpperCase() + " " + prenom + " // Adresse Postale : " + adressePostale.toString();
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public AdressePostale getAdressePostale() {
		return adressePostale;
	}




	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}


}