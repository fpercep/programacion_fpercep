package practica01;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date ahora = new Date();
		int input = -1;

		
		do {
			System.out.println("""
					------------------| MENÚ FECHAS |------------------
					| 1 – Qué hora es? |
					| 2 – Qué día de la semana es? |
					| 3 – Qué día del mes es? |
					| 4 – Cuántos días quedan para Nochevieja? |
					| 0 – Cerrar el programa |
					---------------------------------------------------
					""");
			input  = scan.nextInt();
			
			switch (input) {
			case 1: {
				System.out.println("Son las " + Utilidades.obtenerHoraActual(ahora) + "\n");
				break;
			}
			case 2: {
				System.out.println("Hoy es " + Utilidades.obtenerDiaSemana(ahora));
				break;
			}
			case 3: {
				System.out.println("Hoy es " + Utilidades.obtenerDiaMes(ahora));
				break;
			}
			case 4: {
				System.out.println("Quedan "  + Utilidades.obtenerDiasNochevieja(ahora) + " días para noche vieja");
				break;
			}
			case 0: {
				System.out.println("Gracias por usar la aplicación, que tenga un buen día");
				break;
			}
			default:
				System.err.println("Opción incorrecta");
				break;
			}
		} while (input != 0);

	}

}
