package unidad_02;

import java.util.Scanner;

public class MayorNumeroFor {

	public static void main(String[] args) {
		//Opción A. Indicamos el número de datos a evaluar
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el número de datos para calcular: ");
		int numDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		
		for (int index = 0; index < numDatos; index++) {
			System.out.println("Introduce el número " + (index + 1) + ":" );
			System.out.println("Recuerda vas a introducir " + numDatos + " datos" );
			int numActual = scan.nextInt();
			System.out.println("Te faltan " + (numDatos - index - 1) + " datos" );
			if (mayorNumero < numActual) 
			{mayorNumero = numActual;}
		}
		
		System.out.println("El mayor numero es " + mayorNumero);
		
	}

}
