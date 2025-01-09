package unidad04.boletin;

public class Ej11 {

	public static void main(String[] args) {
		int filas = 4;
		int columnas = 5;
		
		int[][] arrayBidimensional = new int[filas][columnas];
		arrayBidimensional[0][0] = 5;

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				int numAleatorio = (int) (Math.random() * 10);
				arrayBidimensional[i][j] = numAleatorio;
			}
		}    
		
		int sumaFilas = 0;
		int sumaTotal = 0;
		int [] sumaCol = new int [columnas];
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				System.out.print(arrayBidimensional[i][j] + "\t");
				sumaFilas += arrayBidimensional[i][j];
				sumaTotal += arrayBidimensional[i][j];
				sumaCol[j] += arrayBidimensional[i][j];
			}
			System.out.println(sumaFilas);
			System.out.println("\n");
			sumaFilas = 0;
		}
		
		for (int num : sumaCol) {
			System.out.print(num + "\t");
		}
		
		System.out.print(sumaTotal);
	}

}
