package unidad_02.boletin02;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero inicial");
		int inicio = scan.nextInt();
		System.out.println("Introduce el numero final");
		int fin = scan.nextInt();
		System.out.println("Introduce el incremento");
		int incremento = scan.nextInt();
		
		if (inicio >= fin) {
			for (int i = inicio; i >= fin; i-=incremento) {
				System.out.println(i);
			}} else {
			for (int i = inicio; i >= fin; i+=incremento) {
				System.out.println(i);
			}}

	scan.close();
	}
}
