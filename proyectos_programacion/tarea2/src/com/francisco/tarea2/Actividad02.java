package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("""
				~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
				1 - Suma
				2 - Resta
				3 - Multiplicación
				4 – División
				5 - Raíz cuadrada
				6 – Potencia
				0 - Salir del programa
				~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				""");
		System.out.print("Introduce una opción: ");
		int opcion = scan.nextInt();
		
		switch (opcion) {
		case 0:
			System.out.println("Gracias por usar calculadora");
			System.out.println("Introduce cualq uier carcater par terminar");

			break;

		default:
			break;
		}
		
	scan.close();
	}
}
