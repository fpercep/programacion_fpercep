package progr_daw;

import java.util.Scanner;

public class regla_de_tres {
	public static void main(String[] args) {
		System.out.println("""
			Introduce los valores para resolver la regla de tres
			a -------> b
			c -------> x
			""");	
		
		// Declaración del objeto Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce a: ");
		double a = scan.nextDouble();
		System.out.print("Introduce b: ");
		double b = scan.nextDouble();
		System.out.print("Introduce c: ");
		double c = scan.nextDouble();
		double x = (a * b) /c ;
		
		//TODO: Controlar que no
		System.out.println("\nLa solución de la regla de tres es:");
		System.out.print(a );
		System.out.print(" -------> ");
		System.out.println(b );
		System.out.print(c );
		System.out.print(" -------> ");
		System.out.print(x );
		scan.close();

	}
	
}
