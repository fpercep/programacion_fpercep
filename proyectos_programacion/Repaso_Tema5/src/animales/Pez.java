package animales;

public abstract class Pez extends Animal { 

	public Pez(String nombre, int edad) {
		super(nombre, edad);
	}

	public void nadar() {
		System.out.println("I´m under the water, Goop Goop Goop");
	}
}
