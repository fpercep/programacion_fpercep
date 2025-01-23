package examen_u4;

import java.util.Scanner;

public class MatrizFecha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz33 = crearMatrizDimMN(3, 3);
		System.out.println("Introduzca el tamaño de la matriz");
//		int [][] matriz = { {1, 0, 0},{2, 5, 0},{3, 4,5}};
		int[][] matriz = { { -3, 0, 0, 1 }, { 4, -2, 0, 0 }, { -5, 6, 8, 0 }, { 7, -4, 10, 15 } };
//		int [][] matriz = { {0, 0, 0},{0, 0, 0},{3, 4,5}};
		boolean flecha = esTipoFleca(matriz);
		mostraMatriz(matriz);
		System.out.println(flecha);

	}

	private static void mostraMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int[][] crearMatrizDimMN(int filas, int columnas) {
		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 201 - 100);
			}
		}
		return matriz;
	}

	private static boolean esTipoFleca(int[][] matriz) {
		int[] puntas = new int[matriz.length];
		boolean correcto = false;
		if (matriz[0].length == matriz.length) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < i; j++) {
					puntas[i] = matriz[i][j] + matriz[j][i];
				}
				puntas[i] = puntas[i] + matriz[i][i];
			}

			int anterior = Integer.MIN_VALUE;

			int contador = 0;
			for (int i = 0; i < puntas.length; i++) {
				if (puntas[i] > anterior) {
					contador++;
				}
				anterior = puntas[i];
			}
			if (contador == puntas.length) {
				correcto = true;
			}
		}
		return correcto;
	}
}
