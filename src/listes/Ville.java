package listes;

/**
 * 
 * @author StephanieMC
 *
 */

public class Ville implements Comparable<Ville> {

	String nom;
	long nbrHab;

	public Ville(String nom, long nbrHab) {
		super();
		this.nom = nom;
		this.nbrHab = nbrHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbrHab() {
		return nbrHab;
	}

	public void setNbrHab(long nbrHab) {
		this.nbrHab = nbrHab;
	}

	@Override
	public String toString() {
		return "Ville : " + nom + " // Nombres d'habitants : " + nbrHab + "\n";
	}

	@Override
	public int compareTo(Ville autreVille) {
		//
		if (this.nbrHab > autreVille.getNbrHab()) {

			return 1;

		}
		if (this.nbrHab < autreVille.getNbrHab()) {

			return -1;
		}

		return 0;
	}
}
