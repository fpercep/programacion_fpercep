package com.francisco.tareau4;

import java.util.Arrays;
import java.util.Scanner;

public class MaquinaExpendedora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] productos = {
                {"Coca-Cola", "Sprite", "Fanta naranja"},
                {"Fanta limón", "Red Bull", "Monster"},
                {"Pepsi", "Schweppes tónica", "Agua mineral"},
                {"Cruzcampo", "Heineken", "Zumo de piña"}
        };
        
        int[][] unidades = new int[productos.length][productos[0].length];
        Arrays.stream(unidades).forEach(row -> Arrays.fill(row, 5)); // Llenamos con 5 todas las unidades

        boolean salir = false;
        do {
            mostrarMenu();
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    pedirBebida(scan, productos, unidades);
                    break;
                case 2:
                    mostrarExistencias(productos, unidades);
                    break;
                case 3:
                    salir = true;
                    recuentoGatos(productos, unidades);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (!salir);
    }

    private static void mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("""
                Opciones
                ---------------
                1. - Pedir bebida
                2. - Mostrar bebida
                3. - Apagar máquina
                """);
        System.out.println(sb.toString());
    }

    private static void pedirBebida(Scanner scan, String[][] productos, int[][] unidades) {
        System.out.println("Introduzca el código de la bebida: ");
        int subMenu = scan.nextInt();
        
        if (subMenu <= 0 || subMenu > 43) {
            System.out.println("Código no válido");
        } else {
            int fila = Integer.parseInt(Integer.toString(subMenu).substring(0, 1)) - 1;
            int colm = Integer.parseInt(Integer.toString(subMenu).substring(1, 2)) - 1;

            if (unidades[fila][colm] == 0) {
                System.out.println("Las unidades de " + productos[fila][colm] + " se han agotado.");
            } else {
                System.out.println("Has elegido " + productos[fila][colm]);
                unidades[fila][colm]--;
            }
        }
    }

    private static void mostrarExistencias(String[][] productos, int[][] unidades) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (unidades[i][j] > 0) {
                    sb.append("| ").append(productos[i][j]).append(" ")
                            .append((i + 1) * 10 + (j + 1)).append(" | ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void recuentoGatos(String[][] productos, int[][] unidades) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventas del día:\n");
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                int unidadesVendidas = 5 - unidades[i][j];
                if (unidadesVendidas > 0) {
                    sb.append(productos[i][j]).append(" : ").append(unidadesVendidas).append(" vendidos\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}

