package animales;

public class Javi extends Mamifero {
	boolean camiseta;

	public Javi(String nombre, int edad, int numeroPatas) {
		super(nombre, edad, numeroPatas);
		camiseta = true;
	}
	
	public void romperCamiseta() {
		if (this.isVivo()  && camiseta) {
			System.out.println("Ahhhhh, UNGA UNGA");
		}else if(!camiseta) {
			System.out.println(this.getNombre() + " no tiene camiseta");
		} else {
			System.out.println(this.getNombre() + " murio, no puede romper más camisetas");
		}
	}
	
	public void manipular() {
		if (this.isVivo()) {
			System.out.println(getNombre() + " te esta manipulando");
		} 
		else {
			System.out.println(this.getNombre() + " murio, no puede manipularte");
		}
	}
	
	public void moverse() {
		System.out.println(this.getNombre() + " se esta moviendo");
	}
}
