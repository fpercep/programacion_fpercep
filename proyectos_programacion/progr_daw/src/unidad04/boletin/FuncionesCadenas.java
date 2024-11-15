package unidad04.boletin;

import org.apache.commons.lang3.StringUtils;

public class FuncionesCadenas {

	public static boolean esPalindrom(String cadena){		
		return StringUtils.equals(cadena, StringUtils.reverse(cadena));
	}

	public static int conteoVocales(String cadena) {
		int vocales = 0;
		String vocalesRegex = "[aeiouAEIOUÁÉÍÓÚáéíóú]";
		for (int posicion = 0; posicion < cadena.length(); posicion++) {
			 if (Character.toString(cadena.charAt(posicion)).matches(vocalesRegex)) {
				 vocales ++;
			 }
		}
		return vocales;
	}
}
