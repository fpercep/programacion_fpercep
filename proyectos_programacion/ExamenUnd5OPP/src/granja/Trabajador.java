package granja;

public abstract class Trabajador implements Productor {
	private String nombre;
	private String apellidos;
	protected String id;
	private double produccionBase;
	
	public Trabajador(String nombre, String apellidos, Double produccionBase) throws CampoVacio, produccionBaja {
		if (nombre.isEmpty() || apellidos.isEmpty()) {
			throw new CampoVacio("Los campos id, nombre y apellidos no pueden estar vacíos");
		}else if (produccionBase < 100) {
			throw new produccionBaja ("y la producción base no puede ser menor a 100 unidades (es el mínimo de producción que exige la empresa).");
		}
		else {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.produccionBase = produccionBase;
		}
	}
	
	public void mostrarDatos() {
		System.out.print(this.id + " - " + this.nombre + " " + this.apellidos + ": ");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getProduccionBase() {
		return produccionBase;
	}

	public void setProduccionBase(double produccionBase) {
		this.produccionBase = produccionBase;
	}
	
	
}
