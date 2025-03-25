package pruebaSegunda;

public abstract class PruebaPadreHijo extends PruebaPadre implements PruebaInterfazHijo{

	public PruebaPadreHijo(String string, int numero) throws PruebNumeroException {
		super(string, numero);
	}

}
