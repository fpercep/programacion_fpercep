package unidad04.boletin;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numeros = new int[10];
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = scan.nextInt();
		}
		
		for (int i = numeros.length -1; i >= 0; i--) {
			if (numeros [i] >= mayor ) {
				mayor = numeros [i];
			} 
			if (numeros [i] <= menor) {
				menor = numeros [i];
			}
		}
		
		System.out.println("/nEl numero menor es: " + menor);
		System.out.println("El numero mayor es: " + mayor);
		scan.close();
	}

}
