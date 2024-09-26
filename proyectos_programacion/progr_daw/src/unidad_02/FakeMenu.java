package unidad_02;

import java.util.Scanner;

public class FakeMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		System.out.println("* 1. Comprimir archivo");
		System.out.println("* 2. Eliminar archivo");
		System.out.println("* 3. Copiar archivo");
		System.out.println("* 4. Cerrar programa");
		int opcion = scan.nextInt();
		
		//Con condicional compuesto
//		if (opcion == 1) {
//			System.out.print("Comprimiendo archivo...");
//		} else if (opcion == 2) {
//			System.out.print("Eliminar arhivo...");
//		} else if (opcion == 3) {
//			System.out.print("Copiando archivo...");
//		} else if (opcion == 4) {
//			System.out.print("Cerrando programa...");
//		} else {
//			System.err.print("OPCIÓN INCORRECTA");
//		}

		switch (opcion) {
		case 1:
			System.out.print("Comprimiendo archivo...");
			break;
		case 2:
			System.out.print("Eliminar arhivo...");
			break;
		case 3:
			System.out.print("Copiando archivo...");

			break;
		case 4:
			System.out.print("Cerrando programa...");

			break;
		default:
			System.err.print("OPCIÓN INCORRECTA");
			break;
		}
	}

}
