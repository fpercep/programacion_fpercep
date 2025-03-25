package animales;

public class Ruy extends Pez {
	
	private int masculino;

	public Ruy(String nombre, int edad) {
		super(nombre, edad);
		masculino = 100;
	}
	
	public void hormorse() {
		if (masculino != 0) {
			System.out.println(getNombre() + " se esta hormonando");
			masculino --;
		}
		else {
			System.out.println(getNombre() + " ya es una mujer");

		}
	}

	public int getMasculino() {
		return masculino;
	}

	public void setMasculino(int masculino) {
		this.masculino = masculino;
	}
	
	public void moverse() {
		System.out.println(this.getNombre() + " se esta moviendo");
	}
	
}
