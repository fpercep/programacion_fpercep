package unidad04.boletin;

public class Ej03 {

	public static void main(String[] arg) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101);
			cuadrado[i] = (int) Math.sqrt(numero[i]);
			cubo[i] = (int) Math.pow(numero[i], 2);
			System.out.println("Numero " + numero[i]);
			System.out.println("La raiz cuadrada de " + numero[i] + " es : " + cuadrado[i]);
			System.out.println("El cubo de " + numero[i] + " es : " + cubo[i] + "\n");

			
		
		}

	}
}
