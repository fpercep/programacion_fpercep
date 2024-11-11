package unidad_3.boletin;

public class FuncionesMatematicas {
	
	/**
	 * Devuelve true si el número pasado por parámetro es primo
	 * @param numero
	 * @return esPrimo
	 */
	public static boolean esPrimo (long numero) {
		boolean esPrimo = true;

		int divisor = 2;
		while (esPrimo && divisor < numero / 2) {
			if (numero % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		return esPrimo;
	}
	
	/**
	 * Devuelve el siguiente número primo a partir del parámetro de entrada
	 */
	public static long siguientePrimo(long numero) {
		long siguientePrimo = numero + 1;
		boolean encontrado = false;
		while (!encontrado) {
			if (esPrimo(siguientePrimo)) {
				encontrado = true;
			} else {
				siguientePrimo ++;
			}
		}
		return siguientePrimo;
	}
	
	/**
	*Devuelve la cantidad de cifras que tiene un numero
	*/
	
	public static int numCifras(long numero) {
		int numCifras = 1;
		while (numero / 10 != 0) {
			numCifras++;
			numero = numero / 10;
		}
		return numCifras;
	}
	
	/**
	*Devuelve True si es capicua y False si no
	*/
	
	public static boolean esCapicua(long numero) {
		boolean esCapicua = true;
		for (int i = 0; i < numCifras(0) / 2; i++) {
			long numDiv = (long) Math.pow(10, numCifras(0) - i - 1);
			long numMod = (long) Math.pow(10, i);
			double numDelante = (numero / numDiv) % 10;
			double numDetras = (numero / numMod) % 10;
			if (numDelante != numDetras) {
				esCapicua = false;
			}
		}
		return esCapicua;
	}
	
//	public static String letraNif(long nifSinLetra) {
//	    long input = nifSinLetra % 23;
//	    String letra = "";
//	    String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
//                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
//                "C", "K", "E"};
//	    if (input <= 20 || input >= 0) {
//	    	letra = letras[(int) input];
//	    } else {
//	    	letra = "DNI incorrecto";
//	    }
//	    return letra;
//	}	
	
	public static char letraNif(long dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = (int) dni % 23;
		char letra = letras.charAt(resto);
		return letra;
	}
	
	public static boolean nifCorrecto(String dni) {
		if(dni.length()<9) {
			int faltan = 9 - dni.length();
			for (int i = 0; i < faltan ; i++) {
				dni = "0" + dni;
			}
		}
		char letra = dni.substring(8).charAt(0);
		long numero = Long.parseLong(dni.substring(0,8));
		boolean correcto = letraNif(numero) == letra;
		return correcto;
	}

	
}