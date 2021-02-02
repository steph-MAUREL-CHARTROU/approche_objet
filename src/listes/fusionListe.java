package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author StephanieMC
 *
 */

public class fusionListe {

	public static void main(String[] args) {

		List<String> liste1 = new ArrayList<String>();
		
		liste1.add("rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
			
			liste3.addAll(liste1);
			liste3.addAll(liste2);
			
			for ( int i = 0; i < liste3.size(); i ++) {
				
				
			}
			System.out.println(liste3);
		}
	}

