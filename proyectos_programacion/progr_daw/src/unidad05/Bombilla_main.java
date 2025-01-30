package unidad05;

import java.util.Scanner;

public class Bombilla_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		bombilla bombillaOsRam = new bombilla("Osram", 60f, 4.75f);
		bombilla bombillaPorDefecto = new bombilla();
		bombillaOsRam.encender();
		System.out.println(bombillaOsRam);
		System.out.println("----------------------- ");
		System.out.println(bombillaPorDefecto);
		if (bombillaOsRam.equals(bombillaPorDefecto)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son iguales");

		}
	}

}
