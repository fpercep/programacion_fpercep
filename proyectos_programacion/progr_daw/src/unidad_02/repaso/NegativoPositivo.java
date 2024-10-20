package unidad_02.repaso;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int positive = 0;
		int negative = 0;
		

		do {
			System.out.print("Introcude un numero: ");
			num = scan.nextInt();
			if (num > 0) { 
				positive ++;
				}
			else if (num < 0) {
				negative ++;
				}
		} while (num != 0);
		
		scan.close();
		if (negative !=0 && positive != 0) {
			System.out.println("Has introducido " + positive + " numeros positivos y " + negative + " negativos");
		} else {
            System.out.println("No has introducido ningún número positivo o negativo.");
        }
		
	}

}
