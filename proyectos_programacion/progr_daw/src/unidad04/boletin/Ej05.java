package unidad04.boletin;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numeros = new int[3];
		int ultimo = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = scan.nextInt();
		}
		
		ultimo = numeros [numeros.length -1];
		
		for (int i = numeros.length -1; i > 0; i--) {
			numeros[i] = numeros[i -1];
		}
		numeros[0] = ultimo;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\t");
			
		}
	}
}
