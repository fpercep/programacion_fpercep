//package unidad06.edificio;
//
//import java.util.Objects;
//
//public class Persona implements Comparable<Persona> {
//
//	private int dni;
//	private String nombre;
//	private String apellidos;
//
//	
//	@Override
//	public int compareTo(Persona o) {
//		int compare = this.apellidos.compareTo(apellidos);
//
//	}
//
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(dni);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Persona other = (Persona) obj;
//		return dni == other.dni;
//	}
//
//
//	public int getDni() {
//		return dni;
//	}
//
//
//	public void setDni(int dni) {
//		this.dni = dni;
//	}
//
//
//	public String getNombre() {
//		return nombre;
//	}
//
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//
//	public String getApellido() {
//		return apellido;
//	}
//
//
//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}
//	
//}
