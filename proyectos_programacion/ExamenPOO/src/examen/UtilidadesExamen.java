package examen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesExamen {

	public static String horaActual(Date now){
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	String hora = sdf.format(now);
	return hora;
	}
	
	
	public static String DiaSemana(Date now){
		Calendar nowCal = Calendar.getInstance();
		nowCal.setTime(now);
		return null;
	}

	public static Calendar DiasNavidad(Date now) {
		Calendar diasRestantes = null;
		return diasRestantes;
	
	}
	
	public static float ConsumoPorKilometro(float consumo) {
		float cosumoPorKm = consumo / 100;
		return cosumoPorKm;
	}
	
	public static float rangoEstimado(float consumo, float cantCombus) {
		float porKm = ConsumoPorKilometro(consumo);
		float rango = cantCombus / porKm;
		return rango;
	}
}