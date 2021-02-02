package listes;

import java.util.ArrayList;

/**
 * 
 * @author StephanieMC
 *
 */

public class CreationListe {

	public static void main(String[] args) {

		ArrayList<Integer> listInt = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {

			listInt.add(i);

		}

		System.out.println(listInt.size());

	}

}
