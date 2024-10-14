package unidad_02.boletin02;

import java.util.Scanner;
import java.lang.Math;


public class Boletin04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Explicación y recolección de datos
		System.out.println("Siendo la ecucación ax2 + bx + c = 0");
		System.out.println("Introduce a:");
		double a = scan.nextDouble();
		System.out.println("Introduce b:");
		double b = scan.nextDouble();
		System.out.println("Introduce c:");
		double c = scan.nextDouble();
		
		//Operaciones
		if (a == 0) {
			System.out.println("El valor a no puede ser 0");
		} else if (Math.pow(b, 2) <= (4 * a * c)) {
			System.out.println("El valor b cuadrado no sebe ser mayor a 4 * x * c");
		} else {
			double xPositivo = (-b + Math.sqrt( Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			double xNegativo = (-b - Math.sqrt( Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("La soluciones son " + xPositivo + " y " + xNegativo);
		}
		
		scan.close();
	}

}
