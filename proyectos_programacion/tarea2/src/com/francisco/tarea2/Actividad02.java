package com.francisco.tarea2;

import java.util.Scanner;

public class Actividad02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcion = 0;
		String operando = "";
		boolean correcto = true;
		int resultado = 0;
		boolean operacion = false;
		final String SUMA = "suma";
		final String RESTA = "resta";
		final String MULTI = "multiplicación";
		final String DIVI = "division";
		final String RAIZ = "raiz";
		final String POTEN = "potencia";
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("""
				~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
				1 - Suma
				2 - Resta
				3 - Multiplicación
				4 – División
				5 - Raíz cuadrada
				6 – Potencia
				0 - Salir del programa
				~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				""");
		do {
			System.out.print("Introduce una opción: ");
			opcion = scan.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Gracias por usar calculadora");
//				System.out.println("Introduce cualquier tecla para terminar");
		        System.out.println("Programa finalizado.");
				correcto = true;
				break;
			case 1:
				operando = SUMA;
				operacion = true;
				correcto = true;
				break;
			case 2:
				operando = RESTA;
				operacion = true;
				correcto = true;
				break;
			case 3:
				operando = MULTI;
				operacion = true;
				correcto = true;
				break;
			case 4:
				operando = DIVI;
				operacion = true;
				correcto = true;
				break;
			case 5:
				operando = RAIZ;
				operacion = true;
				correcto = true;
				break;
			case 6:
				operando = POTEN;
				operacion = true;
				correcto = true;
				break;
			default:
				System.err.println("Solo se puede poner un numero entre 0 a 6");
				correcto = false;
				break;
			}
			
		} while (!correcto);
		
		
		if (operacion) {
			System.out.print("Introduce el primer numero: ");
			num1 = scan.nextInt();
			System.out.print("\nIntroduce el segundo numero: ");
			num2 = scan.nextInt();
			
			switch (operando) {
			case SUMA:
				resultado = num1 + num2;
				break;
			case RESTA:
				resultado = num1 - num2;
				break;
			case MULTI:
				resultado = num1 * num2;
				break;
			case DIVI:
				resultado = num1 / num2;
				break;
			case POTEN:
				resultado = (int) Math.pow(num1, num2);
				break;
			default:
				 num1 = (int) Math.sqrt(num1);
				 num2 = (int) Math.sqrt(num2);
				 System.out.print("La raiz cuadradra de tu primer numero es " + num1 + " y del segundo es " + num2);
				break;
			}
		}
		if (operacion && operando != RAIZ) {
			System.out.print("El resultado de la "+ operando +" entre " + num1 + " y " + num2 + " es " + resultado);
		}
	scan.close();
	}
}