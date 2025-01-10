package com.francisco.tareau4;
import java.lang.StringBuilder;

public class UsoDeStringBuilder {

	public static void main(String[] args) {
		String palabra = "hola mundo";
		
		StringBuilder vocales = new StringBuilder();
		StringBuilder consonantes = new StringBuilder();
		
		for (int i = 0; i < palabra.length(); i++) {
			char c = palabra.charAt(i);
			if ("aeiouAEIOU".indexOf(c) != -1) {
				vocales.append(c);
			} else if (Character.isLetter(c)){
				consonantes.append(c);
			}
		}
		
		System.out.println("Vocales: " + vocales.toString());
        System.out.println("Consonantes: " + consonantes.toString());
	}

}
