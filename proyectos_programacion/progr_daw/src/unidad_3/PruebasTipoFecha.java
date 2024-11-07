package unidad_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PruebasTipoFecha {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Date fechaActual = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString = scan.nextLine();
		Date fechaUsuario = null;
		fechaUsuario = covierteCadenaAFecha(fechaString ,"dd/MM/yyyy");
		System.out.println(fechaUsuario);
		
		
		System.out.println(fechaActual);
		
		long milisegFechaAct = fechaActual.getTime();
		System.out.println("milisec: " + milisegFechaAct);
		long anio = (long)(1000   * 60 * 60 * 24 * 365.25);
		long anios = milisegFechaAct / anio;
		System.out.println("año = " + anios);
		
		long diexAnios = 10l * anio;
		Date fecha1970 = new Date(1l);
		fecha1970.setTime(fecha1970.getTime() + diexAnios);
		System.out.println(fecha1970);
		
		if (fechaActual.equals(fecha1970)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son diferentes");
		}
	}
	
	public static Date covierteCadenaAFecha(String cadenaFecha, String formato) { 
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Date fechaOut = null;
		
		try {
			fechaOut =  sdf.parse(cadenaFecha);
		} catch (ParseException e) {
			System.err.println("El formato de la fecha es incorrecto");
		}
		return fechaOut;
	}

}
