package com.nombreAlumno.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UsoDeObjetos {

	public static void main(String[] args) throws ParseException {
		
		long numero = 20021;
		long numero2 = 5;
		double dinero = 105.01;
		String fechaString = "10/11/2005";
        String formato = ("dd/MM/yyyy");
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(2005, Calendar.DECEMBER, 6);
		
		System.out.println("Utilidades Matematicas: ");
		System.out.println("Prueba función posicionDeDigito = " + UtilidadesMatematicas.posicionDeDigito(numero, 2));
		System.out.println("Prueba función trozoDeNumero = " + UtilidadesMatematicas.trozoDeNumero(numero, 2 , 5));
		System.out.println("Prueba función juntaNumeros = " + UtilidadesMatematicas.juntaNumeros(numero,numero2));
		System.out.println("Prueba función juntaNumeros = " + UtilidadesMatematicas.factorial(numero2));
		System.out.println("Prueba funcion cambioExacto = \n" + UtilidadesMatematicas.cambioExacto(dinero));
		
		System.out.println("\nUtilidades Fechas");
		System.out.println("Prueba función calcularEdad = " + UtilidadesFechas.calcularEdad(fechaNacimiento));
		System.out.println("Prueba función obtenerMes = " + UtilidadesFechas.obtenerMes(fechaNacimiento));
		System.out.println("Prueba funcion formateaFechaDate " + UtilidadesFechas.formateaFechaDate(fechaString, formato));
	}

}
