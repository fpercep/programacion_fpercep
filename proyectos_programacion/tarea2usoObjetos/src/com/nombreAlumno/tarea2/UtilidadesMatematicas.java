package com.nombreAlumno.tarea2;

public class UtilidadesMatematicas {

	public static int numCifras(long numero) {
		int numCifras = 1;
		while (numero / 10 != 0) {
			numCifras++;
			numero = numero / 10;
		}
		return numCifras;
	}
	
	public static int posicionDeDigito(long numero, int digito) {
		boolean fin = false;
		int numCifra = numCifras(numero);
		int numActual = 0;
		int exp = numCifra - 1;
		
		while (!false) {
			numActual =(int) ((numero/Math.pow(10, exp)) % 10);
		}
		
		return numCifra;
	}
}