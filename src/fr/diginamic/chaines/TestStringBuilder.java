package fr.diginamic.chaines;
/**
 * 
 * @author StephanieMC
 *
 */

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis()
;
		
	StringBuilder sb =  new StringBuilder();
	for ( int i = 0; i < 100_000; i++) {
		sb.append(i);
		
	}
	
	String chaine = sb.toString();
	System.out.println(chaine);
	
	long fin = System.currentTimeMillis();
	
	System.out.println(" temps ecoulé en milliseconde : " + ( fin - debut));
	
	}

}
