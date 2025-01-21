package unidad04.repaso;

public class carton {

	public static void main(String[] args) {
		int [][] carton = new int [3][9];
		int contador = carton.length - 1;
		do {
		    int contadorPosc = 0;
		    while (contadorPosc < 4) {
		        int posicionAlt = (int) (Math.random() * 9);
		        if (carton[contador][posicionAlt] != -1) { 
		            carton[contador][posicionAlt] = -1;
		            contadorPosc++;
		        }
		    }
		    contador--;
		} while (contador >= 0);
		
		System.out.println("Cartón de bingo: \n");
		System.out.println("------------------------------------------------------------------------------");
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[0].length; j++) {
				if (carton[i][j] != -1) {
					boolean repe = false;
					do {			
						repe = false;
						if (j == 0) {
						    carton[i][j] = (int) (Math.random() * 9 + 1);
						} else if (j == 8) {
						    carton[i][j] = (int) (Math.random() * 11 + 80);
						} else {
						    carton[i][j] = (int) (Math.random() * 10 + j * 10);
						}
	                    for (int h = 0; h < i; h++) {
	                        if (carton[i][j] == carton[h][j]) {
	                            repe = true;
	                        }
	                    }
					} while (repe);
				}else {
					carton[i][j] = 0;
				}
				System.out.print(carton [i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------\n");
	
	System.out.println("Lista de numeros: ");
	for (int i = 0; i < carton.length; i++) {
		for (int j = 0; j < carton[0].length; j++) {
			if (carton [i][j] != 0) {
				System.out.print(carton [i][j] + ",");
			}
		}
	}
	}
}
