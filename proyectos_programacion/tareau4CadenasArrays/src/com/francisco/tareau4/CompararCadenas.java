package com.francisco.tareau4;

import org.apache.commons.lang3.StringUtils;

public class CompararCadenas {
	public static void main(String[] arg) {
		
		/*
         * countMatches
         * Cuenta cuántas veces aparece la subcadena (cadena menor) en la cadena mayor.
         * No considera coincidencias solapadas.
         * Si alguna de las cadenas es nula o vacía, devuelve 0.
         */
		
		String cadenaMa = "abcd";
		String cadenaMe = "bc";
		
        // Devuelve 1 porque "bc" aparece una sola vez en "abcd"
		System.out.println(StringUtils.countMatches(cadenaMa, cadenaMe));
		
        // Devuelve 0 porque "abcd" no aparece dentro de "bc"
		System.out.println(StringUtils.countMatches(cadenaMe, cadenaMa));

		

        /*
         * difference
         * Compara dos cadenas y devuelve la porción de la segunda cadena
         * (cadena2) que es diferente de la primera cadena (cadena1).
         */
		
		String cadena1 = "i am a machine";
		String cadena2 = "i am a robot";
		
        // Encuentra la diferencia entre las cadenas
		System.out.println(StringUtils.difference(cadena1, cadena2));
		// Devuelve "robot"	
		
		String cadena3 = "Mama,la programción no es lo mío";
		String cadena4 = "Papa,la programción no es lo mío";
		
        // Encuentra la diferencia desde donde cambia el texto
		System.out.println(StringUtils.difference(cadena3, cadena4));
		// Devuelve "Papa,la programción no es lo mío"

		
		
		/*endsWithAny
         * Busca la subcadena (cadena menor) en el final de la cadena mayor.
         * Devuelve True/False
		 */
		
		// Busca "mío" al final de la cadena "Mama,la programción no es lo mío"
		System.out.println(StringUtils.endsWith(cadena3, "mío"));
		// Devuelve true
	}
}