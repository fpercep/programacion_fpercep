package granja;

public class Pruebas {

	public static void main(String[] args) throws CampoVacio, produccionBaja {
		Ganadero g1 = new Ganadero("Juan", "Pérez", 400d, 10d);
		Agricultor a1 = new Agricultor("Juan", "Pérez", 100d, 10d);
		Granja prueba = new Granja("barbate");
		prueba.contratarTrabajador(g1);
		prueba.contratarTrabajador(a1);
		Ganadero [] ganaderos = prueba.getGanderos();
		Agricultor [] agricultores = prueba.getAgricultores();
		prueba.mostarDatos();
		System.out.println(prueba.calcularProduccion());

	}

}
