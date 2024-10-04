package unidad_02;

import java.util.Scanner;

public class NumeroVeces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("""
				Opciones: + , * , $ y ç
				Repeticiones 3 - 10
				""");
		
		boolean correcto = true;
		String caracter = "";
		int numero = 0;
		int opcion = 0;
		
		System.out.print("Introduzca caracter especial: ");
		do {
			caracter = scan.nextLine();
			switch (caracter) {
			case "+" :
				correcto = true;
				break;
			case "*" :
				correcto = true;
				break;
			case "$" :
				correcto = true;
				break;
			case "ç" :
				correcto = true;
				break;
			default :
				correcto = false;
				System.out.print("Solo se puede introducir + , * , $ o ç: ");
				break;
			}
		} while (!correcto);
		
		System.out.print("Introduzca numero repeticiones: ");
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
				1. Horizontal
				2. Vertical
				""");
	
		do {
			opcion = scan.nextInt();
			switch (opcion){
			case 1:
				for (int index = 0; index < numero; index++) {
					System.out.println(caracter + numero);
				}
				break;
			case 2:
				for (int index = 0; index < numero; index++) {
					System.out.print(caracter + numero + " ");
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
