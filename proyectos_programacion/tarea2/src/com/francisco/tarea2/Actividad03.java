package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int mayor = Integer.MIN_VALUE;;
		int menor = Integer.MAX_VALUE;;
		int suma = 0;
		int cantidad = 0;
		
		System.out.print("Introduce 0 para terminar: ");
		
		do {
			System.out.print("\nIntroduce un numero numero: ");
			num = scan.nextInt();
			if(num > 0){
				if(num >= mayor) { mayor = num;}
				if(num <= menor ) { menor = num;}
				suma = num + suma;
				cantidad ++;}
			else if (num != 0) {System.err.println("SOLO SE PERMITE INTRODUCIR NÚMEROS POSITIVOS");}	
		} while (num != 0);
		
		if (suma != 0) {
			float media =  (float)suma / cantidad;
			System.out.println("Has escrito " + cantidad + " números");
			System.out.println("El mayor número es: " + mayor);
			System.out.println("El menor número es: " + menor);
			System.out.println("Suma de los número es: " + suma);
			System.out.println("La media a aritmética de todos los números : " + media);
		}
		
		scan.close();
	}
}
