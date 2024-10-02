package unidad_02;

import java.util.Scanner;

public class MayorNumeroWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor número introducido ");
		System.out.println("Introduce \"STOP\" cuando quieras para de introducir númerod ");
		int mayorNumero = Integer.MIN_VALUE;
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce un entero:" );
			dato = scan.nextLine();
			salir = !"STOP".equalsIgnoreCase(dato) ? true : false;
		} while (!salir);
		
		System.out.println("El mayor numero es " + mayorNumero);
		
	}

}
