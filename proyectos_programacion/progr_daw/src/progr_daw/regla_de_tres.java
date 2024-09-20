package progr_daw;

import java.util.Scanner;

public class regla_de_tres {
	public static void main(String[] args) {
		System.out.println("Vamos a calcular una regla de 3");
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu a:");
		float a = scan.nextFloat();
		System.out.print("Introduce tu b:");
		float b = scan.nextFloat();
		System.out.print("Introduce tu c:");
		float c = scan.nextFloat();
		float x = (a * b /c) ;
		System.out.println("El resultado de la regla de tres es " + x);
		scan.close();

	}
	
}
