package examen;
import java.util.Date;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date now = new Date();
		boolean end = false;
		
		do {
			System.out.println(
					"""
					------------------| MENÚ FECHAS |--------------------------------
					| 1 – Qué hora es? |
					| 2 – Qué día de la semana es? |
					| 3 – Cuántos días quedan para para las vacaciones de Navidad? |
					| 0 – Cerrar el programa |
					-----------------------------------------------------------------
					"""
					);
			

			int	opcion = scan.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Son las " + UtilidadesExamen.horaActual(now));
				break;
			case 2:
				System.out.println("Hoy es " + UtilidadesExamen.DiaSemana(now));

				break;
			case 3:
				System.out.println("Quedan " + UtilidadesExamen.DiasNavidad(now) + " dias para navidad");

				break;
			case 0:
				System.out.println("Gracias por usar el programa, que tenga un buen día");
				end = false;
				break;
			default:
				System.err.println("Opción incorrecta");
				break;
			}	
		} while (!end);
	scan.close();
	}

	
}
