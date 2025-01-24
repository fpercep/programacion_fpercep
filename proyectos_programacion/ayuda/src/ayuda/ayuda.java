package ayuda;

public class ayuda {

	public static void main(String[] args) {
		int menorNPosible = Integer.MIN_VALUE;
		int mayorNPosible = Integer.MAX_VALUE;
		System.out.println("Mayor Num: " + mayorNPosible);
		System.out.println("Menor Num: " + menorNPosible + "\n");
		String texto = "delegado dimision";
		boolean cumplePatron_a_ZConEspacioYEnie = texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
		System.out.println(texto);
		if (cumplePatron_a_ZConEspacioYEnie) {
			texto = texto.replace("delegado", "Delegado");
			texto = texto.replace("dimision", "dimisión");
		}
		System.out.println(texto + "\n");
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		mostraMatrizH(matriz);
		System.out.println("\n");
		mostraMatrizV(matriz);
		System.out.println("\n");
		Vocales_Consonantes(texto);
	}

	private static void Vocales_Consonantes(String texto) {
		StringBuilder vocales = new StringBuilder();
		StringBuilder consonantes = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if ("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) != -1) {
				vocales.append(c);
			} else if (Character.isLetter(c)) {
				consonantes.append(c);
			}
		}

		System.out.println("Vocales: " + vocales.toString());
		System.out.println("Consonates: " + consonantes.toString());
	}

	private static void mostraMatrizH(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void mostraMatrizV(int[][] matriz) {
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println();
		}
	}

}