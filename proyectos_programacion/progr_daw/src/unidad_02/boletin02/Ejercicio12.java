package unidad_02.boletin02;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa calcula el número de cifras de un número introducido");
		System.out.print("Introcuce un número entero: ");
		int num = teclado.nextInt();
		teclado.close();
		
		int numActual = num;
		int numCifras = 1;
		while (numActual/10 != 0) {
			numActual = numActual/ 10 ;
			numCifras ++ ;
		}

		System.out.println("El número " + num + " tiene " + numCifras+ " de cifras" );
		}

}
