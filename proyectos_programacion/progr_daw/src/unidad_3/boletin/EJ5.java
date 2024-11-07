package unidad_3.boletin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu fecha de nacimiento con formato \" dd-mm-aaaa \":  ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String input = scan.nextLine();
		if (input.length() != 10) {
			System.err.println("El formato introducido no es correcto, debes introducir la fecha completa");
		} else {
			try {
				Date fechaNacDate = sdf.parse(input);
				Calendar fechaAct = Calendar.getInstance();
				
				Calendar fechaNac = Calendar.getInstance();
				fechaNac.setTime(fechaNacDate);
				
				Calendar fechaCumple = fechaNac;
				fechaCumple.set(Calendar.YEAR, fechaAct.get(Calendar.YEAR));
				if(fechaCumple.before(fechaAct)) {
					fechaCumple.add(Calendar.YEAR, 1);
				} 
				
				long milis = fechaCumple.getTimeInMillis() -fechaAct.getTimeInMillis();
				int dias = (int) (1+ milis / (1000l  * 60 * 60 * 24));
				System.out.printf("Quedan %d dias para tú próximo cumpleaños.",  dias);
				String diaCumple = sdf.format(fechaCumple.getTime());
				System.out.printf("\nTu próximo cumpleaños es de día %s", diaCumple);

				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		scan.close();

	}
	

}
