package unidad_02;

import java.util.Scanner;

public class NumeroVeces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("""
				Opciones: + , * , $ y Ç
				Repeticiones 3 - 10
				""");
		System.out.print("Introduzca caracter especial: ");
		String caracter = scan.nextLine();
		System.out.print("Introduzca caracter repeticiones: ");
		int numero = scan.nextInt();
		
		for (int index = 0; index < numero; index++) {
			System.out.println(caracter + numero);
		}
	}
}
