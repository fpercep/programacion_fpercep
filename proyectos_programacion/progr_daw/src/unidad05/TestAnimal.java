package unidad05;

public class TestAnimal {

	public static void main(String[] args) {
		Gato felix = new Gato("Barbate");
		felix.maulla();
		felix.mama();
		System.out.println(felix.toString());
		
		Pinguino joseCarlos = new Pinguino("Mata las cañas");
		System.out.println("\n" + joseCarlos.toString());
		joseCarlos.pesca();
		joseCarlos.ponerHuevo();

	}

}
