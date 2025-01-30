package unidad05;

public class bombilla {
	private float potencia;
	private float precio;
	private String marca;
	private  String estado;
	
	public bombilla() {
		this.marca = "";
		this.potencia = 0f;
		this.precio = 0f;
		this.estado = "apagada";
	}
	
	public bombilla(String marca, float potencia, float precio) {
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.estado = "apagada";
	}
	
	public float getPotencia() {
		return this.potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getPrecio() {
		return this.precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEstado() {
		return this.estado;
	}
	public void encender() {
		this.estado = "encendido";
	}
	
	public void apagar() {
		this.estado = "apagado";
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bombilla ").append("marca: ").append(this.marca)
		.append("\n").append("precio: ").append(this.precio).append(" €")
		.append("\n").append("potencia: ").append(this.potencia).append(" W")
		.append("\n").append("estado: ").append(this.estado);
		return sb.toString();
	}
	
	public boolean equals(bombilla otrBombilla) {
		boolean marcasIguales =  this.marca.equalsIgnoreCase(otrBombilla.getMarca());
		boolean potenciaIguales =  this.potencia == (otrBombilla.getPotencia());

		return marcasIguales && potenciaIguales;
			
	}
}
