package unidad04.boletin;


public class Ej09 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] par = new int [20];
		int[] impar = new int [20];
		int contadorPar = 0;
		int contadorImpar = numero.length - 1;

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 101);
			if (numero[i] % 2 == 0 ) {
				par [contadorPar] = numero [i];
				contadorPar ++;
			} else {
				impar[contadorImpar] = numero [i];
			}
		}
		
		for (int i = 0; i <= contadorPar; i ++) { 
			numero [i] = par [i];
			System.out.print(numero [i] + "");
		}
		
		for (int i = 20; i > contadorPar; i--) {
			numero [i] = impar [i];
			System.out.print(numero [i] + "");
		}
	}

}
