package unidad06.producto_coleccion;

import java.util.List;
import java.util.Scanner;

public class TestLista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Coleccion coleccion = new Coleccion();
		boolean seguir  = true;
		while(seguir) {
			int codigo = Integer.parseInt(scan.next()) ;
			if(codigo != 0) {
				String nombre = scan.next();
				String tipo = scan.next();
				double precio = Double.parseDouble(scan.next());
				int existencias = Integer.parseInt(scan.next());
				Producto prod = new Producto(codigo, nombre, tipo, precio, existencias);
				coleccion.aniadir(prod);
				coleccion.mostrarTodo();
			} else {
				seguir = false;
			}
		}
		Producto prod0 = coleccion.obtener(0);
		System.out.println(prod0);
		Producto prod1 = coleccion.buscar(1);
		System.out.println(prod0);
		coleccion.eliminar(1);
		coleccion.mostrarTodo();

		
	}

}
