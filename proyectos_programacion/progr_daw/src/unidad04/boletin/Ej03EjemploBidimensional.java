package unidad04.boletin;

public class Ej03EjemploBidimensional {

	public static void main(String[] args) {
		int[][] arrayBidimensional = new int[4][4];
		arrayBidimensional[0][0] = 5;
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				int numAleatorio = (int) (Math.random() * 101);
				arrayBidimensional[i][j] = numAleatorio;
			}
		}

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				System.out.print(arrayBidimensional[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
