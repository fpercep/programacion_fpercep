package examen_u4;

import java.util.Scanner;

public class Panagrama {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzco la palabra: ");
		String palabra = scan.nextLine().toLowerCase();
		scan.close();
		String[] letras = {
			    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
			    "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "ñ"
			};
		int [] letrasCheck = new int [letras.length];
		palabra = palabra.replace(".", "");
		palabra = palabra.replace(",", "");
		palabra = palabra.replace(" ", "");
		
		for (int i = 0; i < palabra.length(); i++) {
			String letraPalabra = palabra.substring(i , i + 1);
			boolean letraPerm = false;
			for (int j = 0; j < letras.length; j++) {
				if (letras[j].equals(letraPalabra)) {
					letrasCheck[j] = 1;
					letraPerm = true;
				}
			}
			if (!letraPerm) {
                throw new IllegalArgumentException("Carácter no permitido encontrado: " + letraPalabra);
			}
		}
			boolean pangrama = true;
			for (int i = 0; i < letrasCheck.length; i++) {
				if (letrasCheck[i] == 0) {
					pangrama = false;
				}
			}
			
			if (pangrama) {
				System.out.println("Usted a escrito un pangrama");
			}else {
				System.out.println("No es un pangrama, faltaron las siguientes letras:");
				for (int i = 0; i < letrasCheck.length; i++) {
					if (letrasCheck[i] == 0) {
						System.out.println(" - " + letras[i]);
					}
				}
			}	
	}
	
}
