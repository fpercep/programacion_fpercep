package pruebaSegunda;

public class PruebaHijo extends PruebaPadre {

	public PruebaHijo(String string, int numero) throws PruebNumeroException {
		super(string, numero);
	}

	@Override
	public void cosa() {
		System.out.println("cosas");
	}

}
