package unidad06.producto_coleccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coleccion {
	private List<Producto> lista;
	public Coleccion(){
		lista = new ArrayList<Producto>();
	}

	public int tamanio() {
		return lista.size();
	}

	public void aniadir(Producto e) {
		lista.add(e);
	}

	public void eliminar(int pos) {
		lista.remove(pos);
	}

	public Producto obtener(int pos) {
		Producto output = lista.get(pos);
		return output;
	}

	public Producto buscar(int cod) {		
		Iterator<Producto> itProd = this.lista.iterator();
		boolean encontrado = false;
		Producto prod = null;
		while (itProd.hasNext() && !encontrado) {
			prod = itProd.next();
			if(prod.getCodigo() == cod) {
				encontrado = true;
			}
		}
		return prod;
	}

//Más tarde se añadirán los métodos
	public void mostrarTodo() {
		for (Producto producto : lista) {
			System.out.println(producto);
		}
	}
public void aumentoPrecio(double porcentaje) {
	for (int i = 0; i < this.lista.size() - 1; i++) {
		
	}
}
	
	
}
