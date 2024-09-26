package unidad_01;

import java.util.Scanner;

/** 
 * Clase para mi primer programa java 
 */
public class HolaMundoPro {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		if ("".equals(nombre)) {
			nombre = "amigo";
		}
		System.out.println("Hola " + nombre + "!");
		
		
		scan.close();
	}
}
