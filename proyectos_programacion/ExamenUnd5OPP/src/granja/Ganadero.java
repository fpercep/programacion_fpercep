package granja;

public class Ganadero extends Trabajador {
	private double numAnimales;
	
	public Ganadero(String nombre, String apellidos, Double produccionBase, Double numAnimales) throws CampoVacio, produccionBaja {
		super(nombre, apellidos, produccionBase);
		this.numAnimales = numAnimales;
	}

	@Override
	public double calcularProduccion() {
		double output = getProduccionBase()  + numAnimales * 7.5;
		return output;
	}

	@Override
	public void mostarDatos() {
		mostrarDatos();
		System.out.println(" " + calcularProduccion() + " unidades");
	}

}
