package com.francisco.tareau4;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opciones [] = { "zanahoria", "mandarina", "limón", "patata", "espinaca", "fresa", "mango", "manzana" , "coliflor" };
		boolean salir = false;
		do {
			
			System.out.println("Eligue una opción:");
			System.out.println("""
					1.- Jugar
					2.- Finalizar el juego
					""");
			String menu = scan.nextLine();
			
			switch (menu) {
			case "1":
				String palabraAlt = opciones[(int) (Math.random() * 10)];
				String palabraMos = StringUtils.repeat("_", palabraAlt.length());
				boolean jugar = true;
				
				do {
					System.out.println(palabraMos + "\n");
					System.out.println("""
							L.- Jugar
							R.- Finalizar el juego
							S.- Salir 
							""");
					String subMenu = scan.nextLine();
					
					switch (subMenu) {
					case "L":
						System.out.println("Introduce un letra");
						String letra = scan.nextLine();
						if (letra.length() != 1) {
							System.err.println("Porfavor introduce solo un caracter");
						}else {
							cambiarPalabra(palabraAlt, palabraMos, letra);
						}
					case "R":

						break;
					case "S":
						jugar = false;
						break;
					default:
						System.err.println("Opción Incorrecta, vulve a intentarlo");
						break;
					}
				} while (jugar);
				break;
				
			case "2":
				System.out.println("Gracias por usar la aplicación, que tenga un buen día");
				salir = true;
				break;
				
			default:
				System.err.println("Opción Incorrecta, vulve a intentarlo");
				break;
			}
			
		} while (!salir);
	}
	
	private static String cambiarPalabra(String original, String cambiar , String letra) {
		if (original.contains(letra)) {
			int contador = 0;
//	        for (int i = 0; i < original.length(); i++) {
//	        	//Sacar letra en la posicion actual
//	        	if( letraActual == letra) {
//	        	//cambiarla en cambiar por la letra de original de la misma posición
//	        	}
//	        }
			
		} 
		return cambiar;
	}
}	
