package unidad05.producto;

public class ProductoPeso extends Producto implements IPrecio {
	
	 private double peso;
	 private double precioPorPeso;
	
	 public ProductoPeso(double peso, double precioPorPeso, String nombre, String categoria) {
		super(nombre, categoria);
	 	this.peso = peso;
	 	this.precioPorPeso = precioPorPeso;
	}

	@Override
	public double getImporteTotal() {
		return peso * precioPorPeso;
	}

	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNombre());
		sb.append(" ");
		sb.append(this.peso);
		sb.append(" * ");
		sb.append(this.precioPorPeso);
		sb.append("\t");
	    String formatoTotal = String.format("%.2f", getImporteTotal());
	    String todo = sb.toString()  + formatoTotal;
	    return todo;
		}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorPeso() {
		return precioPorPeso;
	}

	public void setPrecioPorPeso(double precioPorPeso) {
		this.precioPorPeso = precioPorPeso;
	}

	
}
