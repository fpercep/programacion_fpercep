package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean fin = false;
		String contrasenia = "hola";

		int intentos = 3;
		do {
			System.out.println("Introduce contraseña: ");
			String intento = scan.nextLine();
			
			if (intento.equals(contrasenia)) {
				fin = true;
				System.out.println("contraseeña correcta!!");
			} else if (intentos > 1) {
				fin = false;
				intentos --;
				System.out.println("INCORRECTO");
				System.out.println("Te quedan " + intentos);

			}  else {
				fin = true;
				System.err.println("Te quedaste sin intentos");
			}
			
		} while (!fin);
		scan.close();
		
	}

}
