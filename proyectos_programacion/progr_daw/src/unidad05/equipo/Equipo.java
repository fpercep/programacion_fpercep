package unidad05.equipo;

import java.time.LocalDate;

import unidad05.util.Utilidades;

public class Equipo {
	private static int numeroEquipos = 0;
	private String nombre;
	private String cif;
//	private String direccion;
//	private String telefono;
//	private String nombrePresidente;
//	private String observaciones;
	private LocalDate fechaFundacion;
	private boolean masCienAbonos;
	private char categoria;
	
	public Equipo(String nombre, String cif, LocalDate fechaFundacion, boolean masCienAbonos, char categoria) throws EquipoCifNoValidoException {
		this.nombre = nombre;
		
		if (Utilidades.checkCif(cif)) {
			this.cif = cif;
		} else {
			throw new EquipoCifNoValidoException("El cif no es correcto");
		}		
		this.fechaFundacion = fechaFundacion;
		this.masCienAbonos = masCienAbonos;
		this.categoria = categoria;
		numeroEquipos ++;
	}
	
	
}
