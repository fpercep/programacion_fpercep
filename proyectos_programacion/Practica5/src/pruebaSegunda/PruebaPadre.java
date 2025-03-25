package pruebaSegunda;

public abstract class PruebaPadre implements PruebaInterfaz {
	private String string;
	private int numero;
	private static String fijo = "fijo";
	public PruebaPadre (String string , int numero) throws PruebNumeroException {
		this.string = string;
		if (numero < 100) {
			this.numero = numero;

		}else { 
			throw new PruebNumeroException("numero muy bajo");
		}
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static String getFijo() {
		return fijo;
	}
	public static void setFijo(String fijo) {
		PruebaPadre.fijo = fijo;
	}
	
}
