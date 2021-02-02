package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listeInt = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		System.out.println("1 - Voici la liste : " +listeInt); // afficher la liste
		System.out.println("2 - La taille de la liste est de : " +listeInt.size()); // afficher la taille de la liste

		int maxValue = Collections.max(listeInt);// afficher le nombre le plus grand
		System.out.println("3 - La valeur maximale de la liste est : " + maxValue);

		int minValue = (Collections.min(listeInt)); // afficher le nombre le plus petit et le supprimer
		listeInt.remove(listeInt.indexOf(minValue));
		System.out.println("4 - Voici la nouvelle Liste : " +listeInt);
		System.out.println("5 - La valeur minimale " + minValue + " a bien été retiré de la liste");
		
		
		for ( int i = 0; i< listeInt.size(); i++) {
			
			if (listeInt.get(i) < 0  ) {
				
				listeInt.set(i, Math.abs(listeInt.get(i)));
				
				
			}
			
		}
		
		System.out.println(" et enfin la liste finale : " + listeInt);
	}

}
