package com.nombreAlumno.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesFechas {

	public static int calcularEdad(Calendar anioNac) {
		int edad = 0;
		Calendar anioActual = Calendar.getInstance();
		edad = anioActual.get(Calendar.YEAR) - anioNac.get(Calendar.YEAR);
		
        if (anioActual.get(Calendar.MONTH) < anioNac.get(Calendar.MONTH) ||
                (anioActual.get(Calendar.MONTH) == anioNac.get(Calendar.MONTH) &&
                 anioActual.get(Calendar.DAY_OF_MONTH) < anioNac.get(Calendar.DAY_OF_MONTH))) {
                edad--;
            }
        
		return edad;
	}
	
	public static String obtenerMes(Calendar anio) {
	    String mes = "";
	    switch (anio.get(Calendar.MONTH)) {
	        case Calendar.JANUARY: mes = "Enero"; break;
	        case Calendar.FEBRUARY: mes = "Febrero"; break;
	        case Calendar.MARCH: mes = "Marzo"; break;
	        case Calendar.APRIL: mes = "Abril"; break;
	        case Calendar.MAY: mes = "Mayo"; break;
	        case Calendar.JUNE: mes = "Junio"; break;
	        case Calendar.JULY: mes = "Julio"; break;
	        case Calendar.AUGUST: mes = "Agosto"; break;
	        case Calendar.SEPTEMBER: mes = "Septiembre"; break;
	        case Calendar.OCTOBER: mes = "Octubre"; break;
	        case Calendar.NOVEMBER: mes = "Noviembre"; break;
	        case Calendar.DECEMBER: mes = "Diciembre"; break;
	    }	
	    return mes;
	}
	
	public static Date formateaFechaDate(String fechaTexto, String formato) throws ParseException 	 {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date date = sdf.parse(fechaTexto);
		return date;

	}
}
