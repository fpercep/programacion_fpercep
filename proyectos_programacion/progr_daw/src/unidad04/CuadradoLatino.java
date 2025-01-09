package unidad04;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Crear un cuadrado latino en Java
 * 
 * Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
 * en la que su primera fila contiene los N primeros números naturales y cada
 * una de las filas siguientes contiene la rotación de la fila anterior un lugar
 * a la derecha.
 * 
 * Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4
 * x 4 con el siguiente contenido:
 *
 * 
 * 1 2 3 4
 * 4 1 2 3
 * 3 4 1 2
 * 2 3 4 1
 */

public class CuadradoLatino {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Vamos a crear una cuadrada latina, introduce las dimesiones);");
		int n = scan.nextInt();
		int cuadradoLatino[][] = new int[n][n];
		
		for (int i = 0; i < n; i ++) {
			System.out.println("Introduce el siguiente número de la primera fila: ");
			int numActual = scan.nextInt();
			cuadradoLatino[0][i] = numActual;
		}
		
		for (int j = 1; j < n-1; j++) {
			int numAux = cuadradoLatino[j - 1][n-1];
			for (int i = n-2; i > 0; i--) {
				cuadradoLatino[j][i] = cuadradoLatino[j - 1][i - 1];
			}
			cuadradoLatino[j][0] = numAux;
		}
		
		 System.out.println("\nEl cuadrado latino generado es:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(cuadradoLatino[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
