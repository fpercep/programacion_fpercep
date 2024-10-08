package unidad_02;

import java.util.Scanner;

public class Boletin09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el carácter para formar la pirámide");
		String input = sc.nextLine();
		char caracter = input.charAt(0);
		System.out.println("Introduce direción de la pirámide");
		System.out.println("Introduce 1 para vertical");
		System.out.println("Introduce 2 para abajo");
		System.out.println("Introduce 3 para derecha");
		System.out.println("Introduce 4 para izquierda");
		int piramide = sc.nextInt();
		boolean correcto = false;
		
		if (input.length() == 1) {
			if (caracter >= 'A' && caracter <= 'Z'){correcto = true;}
			else if (caracter >= 'a' && caracter <= 'z'){correcto = true;}
			else if (caracter >= '1' && caracter <= '9'){correcto = true;}
			else if (caracter == '$' ||  caracter == '€' ||  caracter == '+' ||  caracter == '-'){correcto = true;}
		} else {
			System.err.println("Solo puedes introducir un caracter");
		}
		if (correcto == true) {
			
		}

	}

}
