package unidad05.vivienda;

public class Casa extends Vivienda {
	private boolean piscina;
	private boolean jardin;
	
	public Casa(String direccion, int metrosCuadrados, Propietario propietario, boolean piscina, boolean jardin) {
		super(direccion, metrosCuadrados, propietario);
		this.jardin = jardin;
		this.piscina = piscina;
	}

	public double calcularCuota() {
		double cuota = getMetrosCuadrados() * 1.5;
		if(this.piscina && this.jardin) {
			cuota += 45;
		}else if (this.piscina || this.jardin){
			cuota += 30;
		}
		return cuota;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------------\n");
		sb.append("Apartamento de " + getPropietario().toString());
		sb.append("\n----------------------------------------------\n");
		sb.append("Dirección: " + getDireccion() + "\n");
		sb.append("Metros cuadrados: " + getMetrosCuadrados() + "\n");
		sb.append("Picina: ");
		if(this.piscina) {
			sb.append("si |");
		}else {
			sb.append("no |");
		}
		sb.append( " Jardin: ");
		if (this.jardin) {
			sb.append("si");
		}else {
			sb.append("no");
		}
		sb.append("\nCon un cuota de " +  calcularCuota());
		sb.append("\n----------------------------------------------");
		return sb.toString();

	}

}
