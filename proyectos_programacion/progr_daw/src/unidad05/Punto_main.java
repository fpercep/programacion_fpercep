package unidad05;

public class Punto_main {
	public static void main(String[] args) {
		Punto punto = new Punto(2,2);
		Punto puntoBase = new Punto();
		System.out.println(puntoBase);
		System.out.println(punto);
		punto.desplazar(3, -3);
		System.out.println(punto);
		Punto puntoInverso = punto.puntoInverso();
		System.out.println(puntoInverso);
		System.out.println("El area es de " + punto.calcularArea());
		System.out.println("El perimetro es de " + punto.calcularPerimetro());
	}
}
