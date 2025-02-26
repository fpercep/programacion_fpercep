package unidad05.empleado;

public class Tecnico extends Operario {
	private String especialidad;
	
	public Tecnico() {
		super();
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public Tecnico(String nombre, String tipoMaquinaria, String espcialidad) {
		super(nombre, tipoMaquinaria);
		this.setEspecialidad(especialidad);
	}
	
	public void realizaTarea() {
		this.anadeTareaTerminada();
	}
}
