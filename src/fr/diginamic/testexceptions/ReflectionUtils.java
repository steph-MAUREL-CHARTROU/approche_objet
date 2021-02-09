package fr.diginamic.testexceptions;

import java.lang.reflect.Field;



public class ReflectionUtils {

	public static void afficherAttributs(Object obj) throws IllegalArgumentException, IllegalAccessException {
		
		
		if ( obj == null) {
			
			throw (ReflectionException)
			
		}
		

		// On commence par r�cup�rer la classe de l'objet pass�e en param�tre.
		// la classe fournit toutes les informations sur la structure d'un objet.
		Class<?> classe = obj.getClass();
		// Sur cette classe on r�cup�re le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();
		// On fait une boucle sur ce tableau
		for (Field field : fields) {
			// On force l'acc�s � l'attribut depuis une classe externe.
			// Un peu comme si je for�ais l'attribut en lisibilit� public.
			field.setAccessible(true);
			// Affichage
			System.out.println("La valeur de l'attribut " + field.getName() + " est " +

					field.get(obj).toString());
		}
	
	
		
		
	}
}
