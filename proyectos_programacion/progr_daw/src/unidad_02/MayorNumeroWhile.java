package unidad_02;

import java.util.Scanner;

public class MayorNumeroWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor número introducido ");
		System.out.println("Introduce \"STOP\" cuando quieras para de introducir números ");
		int mayorNumero = Integer.MIN_VALUE;
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce un entero:" );
			dato = scan.nextLine();
			if("STOP".equalsIgnoreCase(dato)) {
				salir = true;
			} else {
				int datoEntero = Integer.parseInt(dato);
				//asignación de valor a mayorNumero con operador ternario
				//mayorNumero = datoEntero > mayorNumero ? datoEntero : mayorNumero;
				if (datoEntero > mayorNumero) {
					mayorNumero = datoEntero;
				}
				System.out.println("El mayor numero hasta el momento es el " + mayorNumero);
			}
		} while (!salir);
		scan.close();
		System.out.println("El mayor numero al final es el" + mayorNumero);
		
	}

}
