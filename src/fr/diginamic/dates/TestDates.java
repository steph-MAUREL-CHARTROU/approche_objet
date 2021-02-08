package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

/**
 * 
 * @author StephanieMC
 *
 */
public class TestDates {

	public static void main(String[] args) {
		
		 //etape 1 
		
		
		//Date date = new Date();
		//SimpleDateFormat formateur = new SimpleDateFormat( " dd,MM,yyyy");
		//String chaineFormatee = formateur.format(date);
		
		
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016,4,23,59,30);
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat formateur = new SimpleDateFormat(" dd,MM,yyyy");
		String ChaineFormatee = formateur.format(date);
		
		System.out.println(ChaineFormatee);
		
		//etape 2
		
		Calendar cal1 = Calendar.getInstance();
		Date date1 = cal.getTime();
		
		SimpleDateFormat formateurComplet = new SimpleDateFormat( "dd MM yyyy HH:mm:ss");
		System.out.println(formateurComplet.format(date1));
		
		// Etape 3 
		
		SimpleDateFormat formateurAvecNoms = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.CHINA);
		System.out.println(formateurAvecNoms.format(date));
		
		formateurAvecNoms = new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("ru", "RU")); // ou Locale.CHINESE
		System.out.println(formateurAvecNoms.format(date));
		
		formateurAvecNoms = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.GERMAN);
		System.out.println(formateurAvecNoms.format(date));
	}
	
	

}
