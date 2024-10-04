package unidad_02;

import java.util.Scanner;

public class EscribirSimbolo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("""
				Opciones: + , * , $ y €
				Repeticiones 3 - 10
				""");
		
		boolean correcto = true;
		String caracter = "";
		int numero = 0;
		int opcion = 0;
		
		System.out.print("Introduzca caracter especial: ");
		do {
			caracter = scan.nextLine();
			if ("+".equals(caracter) || "*".equals(caracter) || "$".equals(caracter) || "€".equals(caracter)) {
				correcto = true;
			} else {
				correcto = false;
				System.out.print("Solo se puede introducir + , * , $ o ç: ");
			}
		} while (!correcto);
		
		System.out.print("Introduzca numero de repeticiones: ");
		do {
			numero = scan.nextInt();
			if (numero <= 10 && numero >= 3 ) {
				correcto = true;
			} else {
				correcto = false;
				System.out.print("Introduce un numero entre 3 y 10: ");
			}
		} while (!correcto);
		
		System.out.print("""
				Eligue opción:
				1. Vertical
				2. Horizontal
				""");
		do {
			opcion = scan.nextInt();
			switch (opcion){
			case 1:
				for (int index = 0; index < numero; index++) {
					System.out.println(caracter);
				}
				break;
			case 2:
				for (int index = 0; index < numero; index++) {
					System.out.print(caracter + " ");
				}
				break;
			default:
				correcto = false;
				System.out.print("Porfavor introduzca 1 o 2: ");
				break;
			}
		} while (!correcto);
		
	scan.close();
	}
}