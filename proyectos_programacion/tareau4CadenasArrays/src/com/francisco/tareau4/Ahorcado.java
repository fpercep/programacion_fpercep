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
				int intentos = 5;
				do {

					System.out.println(palabraMos);
					System.out.println("Te quedan " + intentos + " intentos");
					System.out.println("""
							L.- Jugar
							R.- Resolver palabra
							S.- Salir 
							""");
					String subMenu = scan.nextLine().toUpperCase();
					switch (subMenu) {
					case "L":
						System.out.println("Introduce un letra:");
						String letra = scan.nextLine().toLowerCase();
						if (letra.length() != 1) {
							System.err.println("Porfavor introduce solo un caracter");
						}else {
							palabraMos = cambiarPalabra(palabraAlt, palabraMos, letra);
							intentos --;
						}
						break;
					case "R":
						System.out.println("Introduce una palabra:");
						String intento = scan.nextLine().toLowerCase();
						if (intento.equals(palabraAlt)){
							System.out.println("\nEs correcto, lo conseguiste");
							jugar = false;
						} else {
							System.out.println("No es correcto \n");
							intentos --;
						}
						break;
					case "S":
						jugar = false;
						break;
					default:
						System.err.println("\nOpción Incorrecta, vulve a intentarlo");
						break;
					}
					if (intentos == 0) {
						System.out.println("\nLa palabra era " + palabraAlt);
						System.out.println("Perdiste lo siento, ¿Quizas a la proxima?\n");
						jugar = false;
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
		String resultado = cambiar;
		if (original.contains(letra)) {
        	char letraChar =  letra.charAt(0);
	        for (int i = 0; i < original.length(); i++) {
	        	char letraActual = original.charAt(i);
	        	if( letraActual == letraChar) {
	        		resultado = resultado.substring(0, i) + letra + resultado.substring(i + 1);
	        	}
	        }		
		} 
		return resultado;
	}
}	
