package fr.diginamic.banques;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Credit op1 = new Credit("2/01/21", 50);
		Credit op2 = new Credit("22/01/21", 1500);
		Debit op3 = new Debit("15/01/21", 45);
		Debit op4 = new Debit("18/01/21", 540);
		
		Operation[] tabOp = { op1,op2,op3,op4};
		
		for (int i = 0; i< tabOp.length; i++) {
			
			System.out.println(tabOp[i].afficherType() + tabOp[i]);
		}
		
		

	}

}
