package unidad04.boletin;

import java.util.Scanner;

public class SombrasCamping207 {

	static Scanner in;
	
	public static boolean casaDePrueba() {
		int c = in.nextInt();
		int f = in.nextInt();
		int a = in.nextInt();
		final int ARBOL = 2;
		final int SOMBRA = 1;
		final int SOL = 0;
		
		if (c == 0 && f == 0 && a == 0) {
			return false;
		} else {
			int [][] camping = new int [c][f];
			for (int i = 0; i > a; i ++) {
				camping[in.nextInt()-1][in.nextInt()-1] = ARBOL;
			}
			for (int i = 0; i > c; i ++) {
				for (int j = 0; i > f; j ++) {
					if (camping [i][j] == ARBOL) { 

					}
				}
				}
			return true;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
