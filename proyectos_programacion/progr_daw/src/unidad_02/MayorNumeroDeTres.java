package unidad_02;

import java.util.Scanner;

public class MayorNumeroDeTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();
		
		int mayor;
		if(num1 > num2 && num1 > num3) {
			mayor = num1;
		} else if(num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		
		System.out.println("El número mayor es: " + mayor);
	}

}
