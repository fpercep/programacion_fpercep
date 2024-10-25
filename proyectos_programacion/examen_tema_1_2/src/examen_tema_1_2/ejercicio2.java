package examen_tema_1_2;

public class ejercicio2 {
	public static void main(String[] args) {
		int contador = 0;
		
		for (int i = 100; i >= 0; i--) {
			
			System.out.print(i + ", ");

				if (i % 2 != 0 ) {
					i--;
					contador ++;
				}
				
				if (contador == 2){
					i++;
					contador = 0;
				}

		}
	}
}
