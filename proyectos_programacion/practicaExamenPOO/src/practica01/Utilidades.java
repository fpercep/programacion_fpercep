package practica01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utilidades {
	public static String obtenerHoraActual(Date now) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return sdf.format(now);
		}
		public static String obtenerDiaSemana(Date now) {
		String diaSemana = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		int diaInt = cal.get(Calendar.DAY_OF_WEEK);
		switch (diaInt) {
		case 1:
		diaSemana = "Domingo";
		break;
		case 2:
		diaSemana = "Lunes";
		break;
		case 3:
		diaSemana = "Martes";
		break;
		case 4:
		diaSemana = "Miércoles";
		break;
		case 5:
		diaSemana = "Jueves";
		break;
		case 6:
		diaSemana = "Viernes";
		break;
		case 7:
		diaSemana = "Sábado";
		break;
		}
		return diaSemana;
		}
		
		public static int obtenerDiaMes(Date now) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		return cal.get(Calendar.DAY_OF_MONTH);
		}
		
		public static long obtenerDiasNochevieja(Date now) {
		long diasRestantes = -1;
		int anio = (int) (1970 + now.getTime() / (1000L*60*60*24*365));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String nocheVieja = "31/12/" + anio;
		Date nocheViejaDate=null;
		try {
		nocheViejaDate = sdf.parse(nocheVieja);
		} catch (ParseException e) {
		System.out.println("La fecha no se puede parsear");
		}
		diasRestantes = (nocheViejaDate.getTime() - now.getTime()) /
		(1000L*60*60*24);
		return diasRestantes;
		}
		public static Integer sacaBola (int min, int max) {
		Integer bola = (int) (Math.random() * (max - min + 1) + min);
		return bola;
		}
}
