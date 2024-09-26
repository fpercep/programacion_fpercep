package unidad_02;

import java.util.Scanner;

/** 
 * Clase para mi primer programa java 
 */
public class HolaMundoPro {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		
//		 Versión con operador ternario
//		 nombre = "".equals(nombre) ? "amigo" : nombre;
		
//		 Versión con if
//		if ("".equals(nombre)) {
//			nombre = "amigo";
//		}
//		System.out.println("Hola " + nombre + "!");
		
//		Versión con if compuesto
		if ("".equals(nombre)) {
			System.out.println("Hola amigo!");
		} else {
			System.out.println("Hola " + nombre + "!");
		}
		scan.close();
	}
}
