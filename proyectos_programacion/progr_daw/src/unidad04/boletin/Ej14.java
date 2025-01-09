package unidad04.boletin;

import java.util.Iterator;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ej14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce cordenadas del alfil");
		String input = scan.nextLine();
		char letra = input.charAt(0);
		int numero = Integer.parseInt(StringUtils.substring(input, input.length() -1));
		String[][] tablero = new String[8][8];
		System.out.print("\ta\tb\tc\td\te\tf\tg\th\t");
		for (int fila = 8; fila >= 1; fila--) {
			System.out.print(fila + "\t");
			for (char col = 'a'; col <='h' ; col++) {
				if (col == letra || fila == numero) {
					System.out.print("A" + "\t");
					tablero [fila][col] = "A";
				} 
			}
			System.out.println("\n");
		}
	}
}
