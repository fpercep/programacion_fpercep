package unidad_02;

import java.util.Scanner;

public class EtapaVital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu año de nacimiento: ");
		int anio = scan.nextInt();
		int edad = 2024 - anio;
		if(0 > edad) {
			System.out.println("Edad incorrecta");
		} 
		else if (edad <= 2) {
			System.out.println("Eres un bebé");
		}
		else if (edad < 12) {
			System.out.println("Eres un niño");
		}
		else if (edad <= 18) {
			System.out.println("Eres un adolecente");
		}
		else if (edad <= 65) {
			System.out.println("Eres un adulto");
		}
		else {System.out.println("Eres un anciano");}
		scan.close();
	}

}