package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = 0;
		double mayor = Integer.MIN_VALUE;;
		double menor = Integer.MAX_VALUE;;
		double suma = 0;
		int cantidad = 0;
		
		System.out.println("Introduce 0 para terminar");
		
		do {
			System.out.println("Introduce un numero numero");
			num = scan.nextDouble();
			if(num >= 0){
				if(num >= mayor) { mayor = num;}
				if(num <= menor && num != 0) { menor = num;}
				suma = num + suma;
				cantidad ++;
			} else {System.err.println("SOLO SE PUEDE INTRODUCIR NÚMEROS POSITIVOS");}
		} while (num != 0);
		
		if (suma != 0) {
			cantidad --;
			double media = suma / cantidad;
			System.out.println("Has escrito " + cantidad + " números");
			System.out.println("El mayor número es: " + mayor);
			System.out.println("El menor número es: " + menor);
			System.out.println("Suma de los número es: " + suma);
			System.out.println("La media a aritmética de todos los números : " + media);
		}
		
		scan.close();
	}
}
