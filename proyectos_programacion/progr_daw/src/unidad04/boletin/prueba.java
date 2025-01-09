package unidad04.boletin;

public class prueba {

	public static void main(String[] args) {
		String abuela = "abuelaáA";
		String cadena = " HOLA ME LLAMO   JHON ";
		System.out.println(FuncionesCadenas.conteoVocales(abuela));
		System.out.println(FuncionesCadenas.invertirCadena(abuela));
		System.out.println(FuncionesCadenas.eliminarEspacios(cadena));
		System.out.println(FuncionesCadenas.eliminarEspaciosDuplicados(cadena));
		System.err.println(FuncionesCadenas.contarPalabras(cadena));
	}
}
