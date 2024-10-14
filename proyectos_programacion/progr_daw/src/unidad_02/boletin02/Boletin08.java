package unidad_02.boletin02;

import java.util.Scanner;

public class Boletin08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Escribe tres numeros y te lo devolveremos de forma ordenada");
		System.out.println("Debes introducir numero distintos o dara error");
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();
		scan.close();
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.err.println("No pueden ser iguales");
		}
		else {
			int mayor = 0;
			int mediano = 0;
			int menor = 0;

			if(num1 > num2 && num1 > num3) {
				mayor = num1;
			} else if(num1 > num2 || num1 > num3) {
				mediano = num1;
			} else {
				menor = num1;
			}
			
			if(num2 > num1 && num2 > num3) {
				mayor = num2;
			} else if(num2 > num1 || num2 > num3) {
				mediano = num2;
			} else {
				menor = num2;
			}
			
			if(num3 > num1 && num3 > num2) {
				mayor = num3;
			} else if(num3 > num1 || num3 > num2) {
				mediano = num3;
			} else {
				menor = num3;
			}
			
			System.out.print(mayor + " > " + mediano + " > " + menor );
		}
		
	}

}
