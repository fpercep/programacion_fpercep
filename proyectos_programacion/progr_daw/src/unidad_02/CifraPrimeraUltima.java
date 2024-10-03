package unidad_02;
import java.util.Scanner;

public class CifraPrimeraUltima {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
		System.out.print("""
				Introduce introduce 1 o 2:
				1. Mostrar primera cifra
				2. Mostrar ultima cifra
				""");
		boolean correcto = true;
		do {
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				int dividendo = num;
				int primeraCifra = 0;
				while (dividendo != 0) {
					primeraCifra = dividendo;
					dividendo /= 10;
				}
				System.out.print("La primera cifra de " + num + " es " + primeraCifra);
				break;
			case 2:
				int ultimaCifra = num % 10;
				System.out.print("La ultima cifra de " + num + " es " + ultimaCifra);
				break;
			default:
				correcto = false;
				System.out.println("OPCIÓN INCORRECTA!! Debes eleguir 1 o 2");
				break;
			}
		}while(!correcto);
		scan.close();
	}
}
