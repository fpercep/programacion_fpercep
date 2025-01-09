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
	
	public static String invertirCadena( String cadena) {
		return StringUtils.reverse(cadena);
	}
	
	public static String eliminarEspacios(String cadenaEspacios) {
		return StringUtils.trim(cadenaEspacios);
	}
	
	public static String eliminarEspaciosDuplicados(String cadenaConEspaciosDup) {
//		String cadenaSinEspaciosDup = StringUtils.trim(cadenaConEspaciosDup);
		String result = StringUtils.normalizeSpace(cadenaConEspaciosDup);
//		boolean hayEspacio = false;
//		for (int index = 0; index < cadenaSinEspaciosDup.length(); index++) {
//			char caracterActual = cadenaSinEspaciosDup.charAt(index);
//			if (' ' == caracterActual && !hayEspacio) {
//				result+=caracterActual;
//				hayEspacio = true;
//			} else if (' ' == caracterActual && hayEspacio) {
//				result += caracterActual;
//				if (hayEspacio) {
//					hayEspacio = false;
//				}
//			}
//		}
		return result;
	}
	
	public static int contarPalabras(String cadena) {
		String [] palabrasArray = StringUtils.split(cadena, " ");
		return palabrasArray.length;
	}
}
