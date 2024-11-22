package practica01;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean correcto = true;
        float peso = 0;
        float altura = 0;

        
        do {
            try {
                System.out.print("Introduzca su altura: ");
            	altura = scan.nextFloat();
            	correcto = true;
    		} catch (Exception e) {
    			scan.nextLine();
    			System.err.println("Formato incorrecto, vuelve a intentarlo");
    			correcto = false;
    		}
            if (altura < 0 || altura > 3) {
            	System.err.println("Introduzca un altura realista");
    			correcto = false;
            };
		} while (!correcto);
        
        
        do {
			try {
		        System.out.print("Introduzca su peso: ");
		        peso = scan.nextFloat();
            	correcto = true;

			} catch (Exception e) {
    			System.err.println("Formato incorrecto, vuelve a intentarlo");
    			correcto = false;
			}
			if (peso < 0 || peso > 300) {
            	System.err.println("Introduzca un peso realista");
    			correcto = false;
			}
		} while (!correcto);
        


        float imc = IMC(peso, altura);
        
        System.out.print("Estatura: " + altura);
        System.out.println("    Peso: " + peso);
        if (imc < 18.5) {
            System.out.println("Su IMC es: " + imc + ", no me das ni para un puchero");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Su IMC es: " + imc + ", estas perfecto");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Su IMC es: " + imc + ", estas muy fuerte o tienes que dejar los bollicados");
        } else if (imc >= 30) {
            System.out.println("Su IMC es: " + imc + ", a ti te persiguen con arpones");
        }
        

        scan.close();
    }

    public static float IMC(float peso, float altura) {
       float imc = peso / (altura * altura);
       return imc;
    }
}