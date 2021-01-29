package fr.geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		Cercle cercle1 = new Cercle(6);
		Rectangle rect1 = new Rectangle(10, 5);

		ObjetGeometrique[] TabObj = { cercle1, rect1 };

		for (int i = 0; i < TabObj.length; i++) {

			System.out.println(" Périmètre : " + TabObj[i].perimetre() + " Surface : " + TabObj[i].surface());

		}

	}
}
