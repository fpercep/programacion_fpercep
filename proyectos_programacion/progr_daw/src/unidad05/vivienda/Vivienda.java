package unidad05.vivienda;

public abstract class Vivienda implements Hipotecable{
	private String direccion;
	private int metrosCuadrados;
//	private Propietario propietario;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
//	public String getPropietario() {
//		return propietario;
//	}
//	public void setPropietario(Propietario propietario) {
//		this.propietario = propietario;
//	}
	
	
}
