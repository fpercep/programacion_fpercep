package animales;

public abstract class Mamifero extends Animal {
	
	private int numeroPatas;

	public Mamifero(String nombre, int edad, int numeroPatas) {
		super(nombre, edad);
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	
}
