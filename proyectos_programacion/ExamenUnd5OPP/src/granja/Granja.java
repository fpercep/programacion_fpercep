package granja;

public class Granja implements Productor{
	
	private String nombre;
	private Trabajador [] trabajadores = new Trabajador [10];

	public Granja( String nombre) {
		this.setNombre(nombre);
	}
	
	public void contratarTrabajador(Trabajador posibleT) {
		boolean contratado = false;
		
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] == null && !contratado) {
				trabajadores[i] = posibleT;
				contratado = true;
			}
		}
	}
	
	public Ganadero[] getGanderos() {
		Ganadero [] ganaderos = new Ganadero [10];
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] instanceof Ganadero) {
				Ganadero ganadero = (Ganadero) trabajadores[i];
				ganaderos [i] = ganadero;
			}
		}
		return ganaderos;
	}
	
	public Agricultor[] getAgricultores() {
		Agricultor [] agricultores = new Agricultor [10];
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] instanceof Agricultor) {
				Agricultor agricultor = (Agricultor) trabajadores[i];
				agricultores [i] = agricultor;
			}
		}
		return agricultores;
	}

	@Override
	public void mostarDatos() {
		for (int i = 0; i < trabajadores.length; i++) {
		if (trabajadores[i] instanceof Agricultor) {
			Agricultor agricultor = (Agricultor) trabajadores[i];
			agricultor.mostarDatos();
		}
		else if (trabajadores[i] instanceof Ganadero) {
			Ganadero ganadero = (Ganadero) trabajadores[i];
			ganadero.mostarDatos();
		}}
	}
	
	public double calcularProduccion() {
		double output = 0;
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] instanceof Agricultor) {
				Agricultor agricultor = (Agricultor) trabajadores[i];
				output += agricultor.calcularProduccion();
			}
			else if (trabajadores[i] instanceof Ganadero) {
				Ganadero ganadero = (Ganadero) trabajadores[i];
				output += ganadero.calcularProduccion();
			}}
		return output;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
