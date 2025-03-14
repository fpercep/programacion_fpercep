package unidad05.vivienda;

public class Apartamento extends Vivienda {
	private int piso;
	private char puerta;
	
	public Apartamento(String direccion, int metrosCuadrados, Propietario propietario, int piso, char puerta) {
		super(direccion, metrosCuadrados, propietario);
		this.piso = piso;
		this.puerta = puerta;
	}

	@Override
	public double calcularCuota() {
		double cuota = getMetrosCuadrados() * 1.2;
		return cuota;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------------\n");
		sb.append("Apartamento de " + getPropietario().toString());
		sb.append("\n----------------------------------------------\n");
		sb.append("Dirección: " + getDireccion() + "\n");
		sb.append("Metros cuadrados: " + getMetrosCuadrados() + "\n");
		sb.append("Piso: " + this.piso + " | Puerta: " + this.puerta);
		sb.append("\nCon un cuota de " +  calcularCuota());
		sb.append("\n----------------------------------------------");
		return sb.toString();
	}
	
}