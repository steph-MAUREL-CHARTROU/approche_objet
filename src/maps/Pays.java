package maps;
/**
 * 
 * @author StephanieMC
 *
 */

public class Pays {

	String nom;
	long nbrHab;
	String continent;

	public Pays(String nom, long nbrHab, String continent) {
		super();
		this.nom = nom;
		this.nbrHab = nbrHab;
		this.continent = continent;

	}

	@Override
	public String toString() {
		return nom + " : " + nbrHab + " nombre d'habitants / " + continent + "\n";
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
