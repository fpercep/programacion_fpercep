package unidad04.boletin;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float temperaturas[] = new float[12];
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura de cada mes empezando por enero:");
			temperaturas[i] = scan.nextFloat();
		}
		for (int i = 0; i < temperaturas.length; i++) {  
			System.out.print("\n" + meses[i] + ": ");
			for (int j = 0; j < temperaturas[i]; j++) {
				System.out.print("#");
			}

		}

		scan.close();  
	}

}
