package examenTema4_2;

import java.util.Scanner;

public class Isograma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce una texto para ver si es un Isogrma: ");
		try {
			String texto = scan.nextLine();
			scan.close();
			if (texto.matches("[a-zA-Z0-9ñÑ ]+")) {
				StringBuilder textoLimpio = limpiarTexto(texto);
				System.out.println(textoLimpio.toString());
				boolean esIsograma = esIsograma(textoLimpio);
				if (esIsograma) {
					System.out.println("Usted a escrito un Isograma");
				} else {
					System.out.println("Usted no a escrito un Isograma");
					mostrarLetrasRepetidas(textoLimpio);
				}
			}
			else {
				throw new IllegalArgumentException("Carácter no permitido encontrado");
			}
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

	private static StringBuilder limpiarTexto(String texto) {
		String abc = "qwertyuiopasdfghjklñzxcvbnm 0123456789";
		StringBuilder textoLimpio = new StringBuilder();
		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char letraP = texto.charAt(i);
			for (int j = 0; j < abc.length(); j++) {
				char letraABC = abc.charAt(j);
				if (letraP == letraABC) {
					textoLimpio.append(letraP);
				}
			}
		}
		return textoLimpio;
	}

	private static boolean esIsograma(StringBuilder textoSB) {
		boolean esIsograma = true;
		String letrasrepes = LetrasRepes(textoSB);
		if (letrasrepes.toString().length() > 0) {
			esIsograma = false;
		}
		return esIsograma;
	}

	private static void mostrarLetrasRepetidas(StringBuilder textoSB) {
		boolean esIsograma = esIsograma(textoSB);
		if (esIsograma) {
			System.out.println("No hay letras repetidas");
		} else {
			String letrasrepes = LetrasRepes(textoSB);
			System.out.println("Letras repetidas: ");
			StringBuilder letras = new StringBuilder();
			StringBuilder veces = new StringBuilder();
			for (int i = 0; i < letrasrepes.length(); i++) {
				char letra = letrasrepes.charAt(i);
				if ("qwertyuiopasdfghjklñzxcvbnm".indexOf(letra) != -1) {
					letras.append(letra);
				}else {
					veces.append(letra);
				}
			}
			for (int i = 0; i < letras.length(); i++) {
				System.out.println("    - " + letras.charAt(i) + " : " + veces.charAt(i) + " veces ");
			}
		}
	}

	private static String LetrasRepes(StringBuilder textoSB) {
		String abc = "qwertyuiopasdfghjklñzxcvbnm";
		StringBuilder letrasrepes = new StringBuilder();
		String texto = textoSB.toString();
		texto = texto.replace(" ", "");
		for (int i = 0; i < abc.length(); i++) {
			int veces = 0;
			char letraABC = abc.charAt(i);
			for (int j = 0; j < texto.length(); j++) {
				char letraP = texto.charAt(j);
				if (letraABC == letraP) {
					veces++;
				}
			}
			if (veces > 1) {
				letrasrepes.append(letraABC);
				letrasrepes.append(veces);
			}
		}
		return letrasrepes.toString();

	}

}
