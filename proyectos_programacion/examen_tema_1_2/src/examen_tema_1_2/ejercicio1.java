package examen_tema_1_2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcion = 0;
		float leng = 0;
		float prog = 0;
		String noev = "NOEV";
		boolean leng_corr = false;
		boolean prog_corr = false;

		
		do {
			System.out.println("""
					----------------| Grado D. CFGS DAW |--------------
					| 1 – Módulo de Lenguaje de Marcas 		  |
					| 2 – Módulo de Programación 			  |
					| 0 – Resumen y salir 				  |
					---------------------------------------------------
					""");
			opcion = scan.nextInt();
					
			if (opcion == 1) {
					do {
						System.out.println("Introduce la nota del módulo de Lenguajes de Marcas:");
						leng = scan.nextFloat();
						leng_corr = true;
					} while (leng > 10 || leng < 0 );
				};
			if (opcion == 2) {
					do {
						System.out.println("Introduce la nota del módulo de Programación:");
						prog = scan.nextFloat();
						prog_corr = true;
					} while (leng > 10 || leng < 0 );
				};
		} while (opcion != 0);
		scan.close();
		
		if (!leng_corr && !prog_corr) {
			System.out.println("Módulo de Programación: " + noev + "\nMódulo de Lenguaje de Marcas: " + noev);			
		} else if (leng_corr && !prog_corr) {
			System.out.println("Módulo de Programación: " + noev + "\nMódulo de Lenguaje de Marcas: " + leng);			
		} else if (prog_corr  && !leng_corr) {
			System.out.println("Módulo de Programación: " + prog + "\nMódulo de Lenguaje de Marcas: " + noev);			
		} else {
			System.out.println("Módulo de Programación: " + prog + "\nMódulo de Lenguaje de Marcas:  " + leng);			
		}
			
	}

}
