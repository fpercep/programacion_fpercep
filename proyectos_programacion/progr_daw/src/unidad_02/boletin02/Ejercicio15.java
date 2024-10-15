package unidad_02.boletin02;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		System.out.println("Con este programa escirbiras un día de la semana (Lunes, Sabado, etc...) y te dira que te toca a primera hora");
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un día: ");
		String dia = scan.nextLine();
		switch (dia) {
		case "Lunes":
			System.out.println("Ha pimera hora tienes ENDES");
			break;
		case "Martes":
			System.out.println("Ha pimera hora tienes PROGR");
			break;
		case "Miercoles":
			System.out.println("Ha pimera hora tienes BADAT");
			break;
		case "Jueves":
			System.out.println("Ha pimera hora tienesLMSGI");
			break;
		case "Viernes":
			System.out.println("Ha pimera hora tienes PROGR");
			break;
		case "Sabado":
			System.out.println("NO TIENES CLASE!!!");
			break;
		case "Domingo":
			System.out.println("NO TIENES CLASE!!!");

			break;
		default:
			System.out.println("Eso no es un dia");
			break;
		}
	scan.close();
		
	}

}
