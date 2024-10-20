package unidad_02.repaso;

import java.util.Scanner;

public class NotaClase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int appr = 0;
		int susp = 0;
		
		do {
			System.out.print("Introduce una nota: ");
			num = scan.nextInt();
			
			if (num <= 10 && num >= 5) {
				suma = suma + num;
				appr ++;
			} else if (num < 5 && num >= 0) {
				suma = suma + num;
				susp ++;
			} else if (num > 10) {
				System.out.println("El numero es demasiado grande, introduzca una nota entre 0-10");
			}
			
		} while (num >= 0);
		
		scan.close();
		
		if (appr !=0 && susp != 0) {
			float media = (float)suma / (susp + appr);
			System.out.println("- Número total de calificaciones ingresadas: " + (appr + susp));
			System.out.println("- La cantidad de calificaciones aprobadas: " + appr);
			System.out.println("- La cantidad de calificaciones reprobatorias : " + suma);
			System.out.println("- La media de la clase es : " + media);	
		}

	}

}
