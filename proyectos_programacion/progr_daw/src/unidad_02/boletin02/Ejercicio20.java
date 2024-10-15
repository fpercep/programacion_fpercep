package unidad_02.boletin02;


public class Ejercicio20 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int nold = 0;
		for (int i = 1; i < 12; i++) {
			nold = n2;
			n2 = n2 + n1;
			n1 = nold;
			System.out.println(n1);
			System.out.println(n2);
		}
		
		
	}

}
