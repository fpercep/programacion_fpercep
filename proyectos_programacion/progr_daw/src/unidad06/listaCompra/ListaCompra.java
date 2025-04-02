package unidad06.listaCompra;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class ListaCompra {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<String, Double>();
		productos.put("avena", 2.21d);
		productos.put("garbazo", 2.39d);
		productos.put("tomate", 1.59d);
		productos.put("jengibre", 3.13d);
		productos.put("quinoa", 4.50d);
		productos.put("guisantes", 1.60d);
		mostrarProductos(productos);
		afectuaCompra();

		
	}
	
	private static void afectuaCompra() {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> cesta = new LinkedHashMap<String, Integer>();
		boolean salir = false;
		do {
			System.out.print("Producto: ");
			String producto = scan.nextLine();
			if (producto == "salir") {
				salir = true;
			}
			else {
				System.out.print("Cantidad: ");
				int cantidad =scan.nextInt();
				if(cesta.containsKey(producto)){
					//TODO Hacer sumar praducto/cantidad nuevos a el anterior
					cesta.put(producto, cantidad);					
				}else {
					cesta.put(producto, cantidad);					
				}
				
			}
		} while (!salir);
		mostrarFactura(cesta);
	}
	
	
	private static void mostrarFactura(Map<String, Integer> cesta) {

	}

	private static void mostrarProductos(Map<String, Double> productos) {
		for (String nombreProd : productos.keySet()) {
			Double precioProd = productos.get(nombreProd);
			System.out.println(nombreProd + " --> " + precioProd + "€");
		}
	}

}
