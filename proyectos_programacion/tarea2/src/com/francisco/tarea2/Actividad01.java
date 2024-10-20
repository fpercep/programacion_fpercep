package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean finish = false;
		final String PASSWORD = "hola";
		int intentos = 3;
		
		do {
			System.out.println("Introduce contraseña: ");
			String input = scan.nextLine();
			
			if (PASSWORD.equals(input)) {
				finish = true;
				System.out.println("Contraseeña Correcta!!");
			} else if (intentos > 1) {
				finish = false;
				intentos --;
				System.out.println("INCORRECTO");
				System.out.println("Te quedan " + intentos + " intentos");
			}  else {
				finish = true;
				System.err.println("Te quedaste sin intentos");
			}
			
		} while (!finish);
		scan.close();
		
	}

}
