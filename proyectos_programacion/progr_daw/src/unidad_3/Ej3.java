package unidad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean correcto = true;
		int resultado = 0;
		int A = 0;
		int B = 0;

		try {
			System.out.print("Introduce el primer numero: ");
			A = scan.nextInt();
			System.out.print("Introduce el primer numero:  ");
			B = scan.nextInt();
			resultado = A/B;
		}
		catch ( InputMismatchException e) {
			System.out.println("Solo se puede introducir número enteros");
			correcto = false;
		} 
		catch ( ArithmeticException e) {
			System.out.println("No se puede devidir entre cero");
			correcto = false;
		}
		
		if (correcto) {
			System.out.println(A + "/" + B + " = " + resultado);
		}
	}

}
