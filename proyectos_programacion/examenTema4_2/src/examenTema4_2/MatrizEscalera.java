package examenTema4_2;

import java.util.Iterator;

public class MatrizEscalera {
	public static void main(String[] args) {
		
	}
	
	
	private static boolean esTipoEscalera(int [][] matriz) {
		boolean esEscalera = matriz.length == matriz[0].length;
		if (esEscalera) {
			int dim = matriz.length;
			int escalonAnterior = Integer.MIN_VALUE;
			int sumaAnterior = Integer.MIN_VALUE;
			int i = 0;
			int j = 0;
			while (esEscalera && i  < matriz.length) {
				j = dim -i;
				if (matriz[i][j] < escalonAnterior) {
					esEscalera = false;
				}
				int sumaActual = 0;
				while (esEscalera  && i < dim) {
					sumaActual = matriz[i][j];
					j++;
				}
				if (sumaActual < sumaAnterior) {
					esEscalera = false;
				}
				i++;
			}
		}
		return esEscalera;
	}
	
	private static void mostraEscalera(int[][] matriz) {
		int dim = matriz.length;
		if(esTipoEscalera(matriz)) {
			for (int i = 0; i < dim; i++) {
				for (int j = dim - i; j < dim; j++) {
					System.out.print(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			throw new IllegalArgumentException();
		}

	}
}
