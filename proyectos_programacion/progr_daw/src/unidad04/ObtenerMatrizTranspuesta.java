package unidad04;

import java.util.Scanner;

public class ObtenerMatrizTranspuesta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce filas");
		int filas = scanner.nextInt();
		
		System.out.println("Introduce columnas");
		int cols = scanner.nextInt();
		int[][] matriz = new int [filas][cols];
		
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce un numero: ");
				matriz [i][j] = scanner.nextInt();
			}
		}		
		System.out.println("\nMatriz incicial");
		mostrarMatriz(matriz);
		int [][] matrizT = obtenerMatrizTranspuesta(matriz);
		
		System.out.println("\nMatriz Transpuesta");
		mostrarMatriz(matrizT);
	}
	
	private static int[][] obtenerMatrizTranspuesta(int [][] matriz) {
		int [][] matrizT = new int [matriz[0].length][matriz.length];
		for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
            	matrizT [i][j] = matriz [j][i];
			}
		}
		return matrizT;
		
	}
	
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
