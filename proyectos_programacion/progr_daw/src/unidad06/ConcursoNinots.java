package unidad06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Avtividad de https://aceptaelreto.com/problem/statement.php?id=765
public class ConcursoNinots {
	static Scanner in;

	public static boolean casoDePrueba() {
		Map<String, Integer> concurso = new HashMap<String, Integer>();
		Map<String, Integer> ganador_adulto = new HashMap<String, Integer>();
		int numCasos = Integer.parseInt(in.next());
		if (numCasos == 0)
			return false;
		else {
			for (int i = 0; i < numCasos; i++) {
				String ninot = in.next();
				if (concurso.containsKey(ninot)) {
					concurso.put(ninot, concurso.get(ninot) + 1);
				} else {
					concurso.put(ninot, 1);
				}
			
			}
			return true;
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
