package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> listeVille = new ArrayList<Ville>();

		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassone", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 97000);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 343000);

		Collections.addAll(listeVille, nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes);

		System.out.println(listeVille.toString());

		String nomVille = "";
		long hab = 0;

		// r�cup�ration de la ville la plus peupl�e

		for (int i = 0; i < listeVille.size(); i++) {

			if (listeVille.get(i).getNbrHab() > hab) {
				// Verifie si le nombre d'habitant stock� dans la liste � l'index i est
				// superieur � ma variable initialis�e
				hab = listeVille.get(i).getNbrHab();
				// � chaque tour, elle prend une nouvelle valeur si elle est plus grande que la
				// pr�c�dente.
				nomVille = listeVille.get(i).getNom();
				// je stocke le nom de la ville correspondant la nouvelle valeur
			}
		}

		System.out.println(" La ville la plus peupl�e est " + nomVille + " avec " + hab + " habitants.");

		// SUPPRESSION Ville la moins peupl�e

		Ville villeOut = null;

		for (int i = 0; i < listeVille.size(); i++) { // pareil que pr�cedemment mais dans le sens inverse.

			if (listeVille.get(i).getNbrHab() < hab) {
				hab = listeVille.get(i).getNbrHab();
				nomVille = listeVille.get(i).getNom();
				villeOut = listeVille.get(i);

			}
		}

		listeVille.remove(villeOut);

		System.out.println("La ville la moins peupl�e est " + nomVille + " avec " + hab + " habitants \n");

		System.out.println(" Voici la nouvelle liste : \n" + listeVille.toString());

		// MODIFICATION des ville de plus de 100 000 habitants + Majuscules

		Iterator<Ville> iterator = listeVille.iterator();

		while (iterator.hasNext()) {

			Ville element = iterator.next();

			if (element.getNbrHab() > 100000) {

				element.setNom(element.getNom().toUpperCase());
			}
		}
		System.out.println(listeVille);
	}

}
