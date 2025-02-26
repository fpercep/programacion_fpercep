package unidad05.producto;

import java.util.Scanner;

public class ProductoTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce su nombre: ");
		String cliente = scan.nextLine();
		scan.close();
		IPrecio[] carrito = new IPrecio[5];
		System.out.print("\n");
		carrito[0] = new ProductoPeso(2.5, 1.5, "Manzanas", "Frutas");
		carrito[1] = new ProductoUnitario(1, 2.0, "Leche", "Lácteos");
		carrito[2] = new ProductoPeso(1.8, 1.2, "Plátanos", "Frutas");
		carrito[3] = new ProductoUnitario(2, 1.0, "Pan", "Panadería");
		carrito[4] = new ProductoUnitario(12, 0.3, "Huevos", "Lácteos");
		
		System.out.println("TICKET DE LA COMPRA Cliente: " + cliente + "\n");
		double preCarrito = 0;
		for (IPrecio producto : carrito) {
			System.out.println(producto.imprimir());
			preCarrito = producto.getImporteTotal() + preCarrito;
		}
		System.out.println("\nIMPORTE TOTL \t\t" + preCarrito);
	}

}
