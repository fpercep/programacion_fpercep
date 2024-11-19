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
	    int posicion = -1;
	    int numCifras = numCifras(numero);
	    int exp = numCifras - 1;

	    for (int i = 1; exp >= 0 && posicion == -1; exp--, i++) {
	        int numActual = (int)((numero / Math.pow(10, exp)) % 10);
	        if (numActual == digito) {
	            posicion = i;
	        }
	    }

	    return posicion;
	}
	
	public static String trozoDeNumero(long numero, int primera, int ultima) {
	    String numeroString = String.valueOf(numero);
	    String cadena = numeroString.substring(primera - 1,ultima);		
		return cadena; 
	}
	
	public static int juntaNumeros(long num1, long num2) {
		String fusionString = "" + num1 + num2;
		int fusion = Integer.parseInt(fusionString) ;
		return fusion;
	}
	
	public static int factorial(long num) {
		int resultado = (int) num;
		for (int i = (int) (num -1); i >= 1 ; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
	public static String cambioExacto(double num) {
	    double pendiente = num;
	    int billete500 = 0;
	    int billete200= 0;
	    int billete100 = 0;
	    int billete50 = 0;
	    int billete20 = 0;
	    int billete10 = 0;
	    int billete5 = 0;
	    int moneda2 = 0;
	    int moneda1 = 0;
	    int moneda50 = 0;
	    int moneda20 = 0;
	    int moneda10 = 0;
	    int moneda05 = 0;
	    int moneda02 = 0;
	    int moneda01 = 0;
	    
	    double tolerancia = 0.01;
	    
	    while (pendiente >= tolerancia) { 
	        if (pendiente >= 500) {
	            pendiente -= 500;
	            billete500++;
	        } else if (pendiente >= 200) {
	            pendiente -= 200;
	            billete200++;
	        } else if (pendiente >= 100) {
	            pendiente -= 100;
	            billete100++;
	        } else if (pendiente >= 50) {
	            pendiente -= 50;
	            billete50++;
	        } else if (pendiente >= 20) {
	            pendiente -= 20;
	            billete20++;
	        } else if (pendiente >= 10) {
	            pendiente -= 10;
	            billete10++;
	        } else if (pendiente >= 5) {
	            pendiente -= 5;
	            billete5++;
	        } else if (pendiente >= 2) {
	            pendiente -= 2;
	            moneda2++;
	        } else if (pendiente >= 1) {
	            pendiente -= 1;
	            moneda1++;
	        } else if (pendiente >= 0.5) {
	            pendiente -= 0.5;
	            moneda50++;
	        } else if (pendiente >= 0.2) {
	            pendiente -= 0.2;
	            moneda20++;
	        } else if (pendiente >= 0.1) {
	            pendiente -= 0.1;
	            moneda10++;
	        } else if (pendiente >= 0.05) {
	            pendiente -= 0.05;
	            moneda05++;
	        } else if (pendiente >= 0.02) {
	            pendiente -= 0.02;
	            moneda02++;
	        } else if (pendiente >= 0.01) {
	            pendiente -= 0.01;
	            moneda01++;
	        }
	    }
	    
	    String cambio = "Billetes de 500 = " + billete500 + "\n" +
	                    "Billetes de 200 = " + billete200 + "\n" +
	                    "Billetes de 100 = " + billete100 + "\n" +
	                    "Billetes de 50 = " + billete50 + "\n" +
	                    "Billetes de 20 = " + billete20 + "\n" +
	                    "Billetes de 10 = " + billete10 + "\n" +
	                    "Billetes de 5 = " + billete5 + "\n" +
	                    "Monedas de 2 = " + moneda2 + "\n" +
	                    "Monedas de 1 = " + moneda1 + "\n" +
	                    "Monedas de 0.5 = " + moneda50 + "\n" +
	                    "Monedas de 0.2 = " + moneda20 + "\n" +
	                    "Monedas de 0.1 = " + moneda10 + "\n" +
	                    "Monedas de 0.05 = " + moneda05 + "\n" +
	                    "Monedas de 0.02 = " + moneda02 + "\n" +
	                    "Monedas de 0.01 = " + moneda01;
	    
	    return cambio;
	}

}