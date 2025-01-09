package examen;

import java.util.Scanner;

public class coche {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float consumo = 0;
		float cantCombus = 0;
		boolean correcto = true;
		
		System.out.println("Ingresar datos:");
		do {
			correcto = true;
			System.out.print("Consumo medio (litros/100 km): ");
			consumo = scan.nextFloat();
			if (consumo <= 0) {
				correcto = false;
				System.err.println("El valor no puede ser inferior o igual a 0");
			} 
		} while (!correcto);
		
		
		do {
			correcto = true;
			System.out.print("Combustible disponible (litros): ");
			cantCombus = scan.nextFloat();
			if (cantCombus <= 0) {
				correcto = false;
				System.err.println("El valor no puede ser inferior o igual a 0");
			} 
		} while (!correcto);

		scan.close();
		
		float rango = UtilidadesExamen.rangoEstimado(consumo, cantCombus);
		System.out.println("\n\nCálculos:");
		System.out.println("Consumo por kilómetro: " + UtilidadesExamen.ConsumoPorKilometro(consumo) + " 1 /km");
		System.out.println("Rango estimado de viaje: " + rango + " km");
		
		if (rango < 100) {
			System.out.println("El rango es muy limitado, es recomendable repostar");
		} else if (rango >= 100 && rango <= 500 ) {
			System.out.println("El rango es adecuado para viajes cortos.");
		}else if (rango > 500) {
			System.out.println("El rango es suficiente para viajes largos");

		}
		
		if ( consumo >= 5 && consumo <= 8 ) {
			System.out.println("El consumo es eficiente.");
		}else {
			System.out.println("El consumo no es eficiente. Debería estar entre 5 y 8 litros/100 km");
		}

	}

}
