 package unidad05.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Utilidades {
	public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static Scanner scan = new Scanner(System.in);

	/**
	 * Devuelve verdadero si el dni pasado por parámetro es un dni válido
	 * 
	 * @param dni
	 * @return dniCorrecto
	 */
	public static boolean checkDni(String dni) {
		boolean dniCorrecto = false;
		// 00000100F == 100F
		String dniPattern = "[0-9]{8}[" + LETRAS + LETRAS.toLowerCase() + "]";
		if (dni.matches(dniPattern)) {
			String numStr = dni.substring(0, 8);
			Integer num = Integer.parseInt(numStr);
			Character letraCorrecta = LETRAS.charAt(num % 23);
			Character letra = dni.toUpperCase().charAt(8);
			// otra opción -> Character letra = Character.toUpperCase(dni.charAt(8));
			if (letraCorrecta == letra) {
				dniCorrecto = true;
			}
		}
		return dniCorrecto;
	}
	
	public static boolean checkCif(String cif) {
		final String PATRON_CIF = "[A-NP-SU-Wa-np-su-w][0-9]{7}[A-Ja-j0-9]";
		return cif.matches(PATRON_CIF);
	}
	 
	public static int dameEntero() throws UtilidadesParametroTipoIncorrectoException{
		try {
			return scan.nextInt();
		}catch (InputMismatchException e) {
			throw new UtilidadesParametroTipoIncorrectoException("Debe introducir un valor entero");
		}
	}
	
	public static boolean dameSiNO() throws UtilidadesParametroTipoIncorrectoException{
		try {
			String respuesta = scan.nextLine();
			if (StringUtils.equalsIgnoreCase(respuesta, "Sí") || StringUtils.equalsIgnoreCase(respuesta, "Si")) {
				return true;
			} else if (StringUtils.equalsIgnoreCase(respuesta, "No")) {
				return false;
			} else {
				throw new UtilidadesParametroTipoIncorrectoException("Debe introducir un valor entero");
			}
		}catch (InputMismatchException e) {
			throw new UtilidadesParametroTipoIncorrectoException("Debe introducir un valor entero");
		}
	}	
	
	public static String dameCadena() throws UtilidadesParametroTipoIncorrectoException{
		final String PATTERN = "a-zA-ZñÑáÁéÉúÚóÓíÍ";
		try {
			String respuesta = scan.nextLine();
			if (!StringUtils.isBlank(respuesta) && respuesta.matches(PATTERN)) {
			return respuesta;
			}
			else {
				throw new UtilidadesParametroTipoIncorrectoException("Debe introducir una cadena valida");
			}
		}catch (InputMismatchException e) {
			throw new UtilidadesParametroTipoIncorrectoException("Debe introducir una cadena valida");
		}
	}
}
