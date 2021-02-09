package fr.diginamic.testexceptions;

import listes.Ville;

public class TestRefectionUtils {

	public static void main(String[] args) {
		
		Ville nouvelleVille = new Ville("Figeac", 9826);
		
		ReflectionUtils reflection = new ReflectionUtils();
		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch ( IllegalAccessException e) {
			
			e.printStackTrace();
		}catch ( IllegalArgumentException e) {
			
			e.printStackTrace();
		}catch ( ReflectionException e) {
			e.printStackTrace();
		}
	}

}
