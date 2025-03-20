package unidad06.horchata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProblemaHorchata {

	static Scanner in;

	public static boolean casoDePrueba() {
		int litrosHorchata = in.nextInt();
		int numTrabajadores = in.nextInt();
		if (litrosHorchata == 0 && numTrabajadores == 0) {
			return false;
		} else {
			List<Trabajador> trabajadores = new ArrayList<Trabajador>();
			for (int i = 0; i < numTrabajadores; i++) {
				int horasTrabajadas = in.nextInt();
				int litrosSolicitados = in.nextInt();
				Trabajador trab = new Trabajador(horasTrabajadas, litrosSolicitados);
				trabajadores.add(trab);
			}
			Collections.sort(trabajadores);
			Iterator<Trabajador> itTrabajador = trabajadores.iterator();
			int trabajadoresSatisfechos = 0;
			boolean quedaHorchata = true;
			while (itTrabajador.hasNext() && quedaHorchata) {
				Trabajador trabajador = itTrabajador.next();
				if (litrosHorchata > trabajador.getLitros()) {
					litrosHorchata -= trabajador.getLitros();
					trabajadoresSatisfechos++;
				} else {
					quedaHorchata = false;
				}
			}
			System.out.println(trabajadoresSatisfechos + "  " + litrosHorchata);
			return true;
		}

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}

}
