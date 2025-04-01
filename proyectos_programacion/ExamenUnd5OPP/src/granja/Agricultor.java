package granja;

public class Agricultor extends Trabajador {
	
	private double cosechaRecolectada;

	public Agricultor(String nombre, String apellidos, Double produccionBase, double cosechaRecolectada) throws CampoVacio, produccionBaja {
		super(nombre, apellidos, produccionBase);
		this.cosechaRecolectada =  cosechaRecolectada;
	}

	@Override
	public double calcularProduccion() {
		double output = (getProduccionBase()  + (this.cosechaRecolectada * 0.5));
		return output;
	}

	@Override
	public void mostarDatos() {
		mostrarDatos();
		System.out.println(" " + calcularProduccion() + " unidades");			
	}

}
