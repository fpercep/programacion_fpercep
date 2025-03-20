package unidad06.horchata;

public class Trabajador implements Comparable<Trabajador>{
	private int trabajo;
	private int litros;
	
	public Trabajador(int trabajo, int litros) {
		this.trabajo = trabajo;
		this.litros = litros;
	}

	public int getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(int trabajo) {
		this.trabajo = trabajo;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	@Override
	public int compareTo(Trabajador otroTrabajador) {
		int compare = 0;
		compare = this.trabajo - otroTrabajador.trabajo;
		if (compare == 0) {
			compare = otroTrabajador.litros - this.litros;
		}
		return compare;
	}
	
	
}
