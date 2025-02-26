package unidad05.producto;

public class ProductoUnitario extends Producto implements IPrecio {
	
	private int cantidad;
	private double precio;
	
	public ProductoUnitario(int cantidad, double precio, String nombre, String categoria) {
		super(nombre, categoria);
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public double getImporteTotal() {
		return cantidad * precio;
	}

	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNombre());
		sb.append(" (");
		sb.append(this.cantidad);
		sb.append("un.) ");
		sb.append(this.precio);
		sb.append("\t");
	    String formatoTotal = String.format("%.2f", getImporteTotal());
	    String todo = sb.toString()  + formatoTotal;
	    return todo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
