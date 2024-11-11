package unidad_3.boletin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesFechas {

	public static String obtenerDiaSemana(Calendar fecha) {
		String dia = "";
		switch (fecha.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "lunes";
			break;
		case 3:
			dia = "martes";
			break;
		case 4:
			dia = "miércoles";
			break;
		case 5:
			dia = "jueves";
			break;
		case 6:
			dia = "viernes";
			break;
		default:
			dia = "sabado";
			break;
		}
		
		return dia;
	}
	
	public static String obtenerDiaSemana(Date fecha) {
		Calendar fechaCal = Calendar.getInstance();
		fechaCal.setTime(fecha);
		String dia = obtenerDiaSemana(fechaCal);
		return dia;
	}
	
	public static boolean esFechaPasada(Date fecha, Date fechaReferencia) {
		return fecha.before(fechaReferencia);
	}
	
	public static boolean esFechaPasada(Calendar fecha, Calendar fechaReferencia) {
		return fecha.before(fechaReferencia);
	}
	
	public static boolean esBisisto (int anio) {
		boolean esBisiesto = false;
		if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
			esBisiesto = true;
		}
		return esBisiesto;
	}
	
	public static String formatearFecha (Date fecha, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String fechaFormateada = sdf.format(fecha);
		return fechaFormateada;
	}
	public static String formatearFecha (Calendar fecha, String formato) {
		return formatearFecha (fecha.getTime(), formato);
	}
}
