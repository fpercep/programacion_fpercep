package unidad05;

public abstract class Ave extends Animal {
	private boolean volador;
	
	public Ave(String lugarNacimiento, Integer numPatas, boolean volador, boolean ponerHuevos) {
		super(lugarNacimiento, 2);
		this.setVolador(volador);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un Ave.\n").append(super.toString());
		return sb.toString();
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	public void ponerHuevo() {
		System.out.println("El animal está poniendo un huevo");
	}
}
