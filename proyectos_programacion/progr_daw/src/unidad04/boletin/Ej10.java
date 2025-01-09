package unidad04.boletin;

public class Ej10 {

	public static void main(String[] args) {
		int[][] num = new int [3][6];
		num [0][1] = 30;
		num [0][2] = 2;
		num [0][5] = 5;
		num [1][0] = 75;
		num [2][2] = -2;
		num [2][3] = -9;
		num [2][5] = 11;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				int numActual = num [i][j];
				if (numActual == 0) {
					System.out.print("\t");
				} else {
					System.out.print(numActual + "\t");
				}
			}
			System.out.println("\n");
		}
 	}

}
