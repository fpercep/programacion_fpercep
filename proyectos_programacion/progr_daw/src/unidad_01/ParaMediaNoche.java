package unidad_01;

import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (hora y minutos),
 * calcule los segundos que faltan para llegar a la medianoche
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Con enteros
		//System.out.print("Introduce la hora actual: ");
		//int hora = scan.nextInt();
		//System.out.print("Introduce los minutos actuales: ");
		//int minutos = scan.nextInt();
		
		
		System.out.print("Introduce la hora actual con formato HH:mm: ");
		String horaString = scan.nextLine();
		//23:59
		int hora = Integer.parseInt(horaString.substring(0, 2));
		int minutos = Integer.parseInt(horaString.substring(3, 5));
		
		//TODO: Controlar los datos erróneos 
		int horasParaMediaNoche = (23 - hora); 
		int minutosParaMediaNoche = (60 - minutos); 
		int segundosParaMediaNoche = horasParaMediaNoche * 3600 +  minutosParaMediaNoche * 60;
		System.out.println("\nQuedan " + segundosParaMediaNoche + " segundos para medianoche");
		scan.close();
	}

}
