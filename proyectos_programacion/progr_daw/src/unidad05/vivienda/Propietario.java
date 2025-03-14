package unidad05.vivienda;

public class Propietario {
	private String dni;
	private String nombre;
	
	public Propietario (String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nombre);
		sb.append(" ");
		sb.append(this.dni);
		return sb.toString();
	}
}
