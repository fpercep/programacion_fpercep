package unidad04.boletin;   

import org.apache.commons.lang3.StringUtils;

public class Letras {

	public static void main(String[] args) {
		int dimension = 1 +  'Z' - 'A';
		char caracteres[] = new char[dimension];
		char caracterActual = 'A';
		for (int indice = 0; indice < dimension; indice++) {
			caracteres[indice] = caracterActual++;
		}

		System.out.println("Mostrar los caracteres del array");
		String output = StringUtils.EMPTY;
		for (int indice = 0; indice < dimension; indice++) {
			output += StringUtils.SPACE+ caracteres[indice];
		}
		System.out.println(output);
	}

}
