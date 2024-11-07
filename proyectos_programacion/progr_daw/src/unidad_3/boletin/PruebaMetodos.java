package unidad_3.boletin;

import java.util.Date;
import java.util.Scanner;

public class PruebaMetodos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		long numero = scan.nextLong();
		long sigPrimo = FuncionesMatematicas.siguientePrimo(numero);
		
		boolean esCapicua = FuncionesMatematicas.esCapicua(numero);
		System.out.printf("El siguiente primo a %d es %d", numero, sigPrimo);
		if (esCapicua) {
			System.out.printf("\nEl numero %d es capicua", numero);
		}else {
			System.out.printf("\nEl numero %d no es capicua", numero);

		}
		
		Date ahora = new Date();
		String dia = FuncionesFechas.obtenerDiaSemana(ahora);
		System.out.printf("\nHoy es %s", dia);
	}

}
