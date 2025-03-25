package pruebaSegunda;

public class PruebaHijoSegundo extends PruebaPadre implements PruebaInterfazHijo {
	
	private String hola;

	public PruebaHijoSegundo(String string, int numero, String hola) throws PruebNumeroException, HolaException {
		super(string, numero);
		if (hola.equals("hola")) {
			this.hola = hola;
		}else {
			throw new HolaException("Cosa que no me saludas");
		}
	}

	@Override
	public void cosa() {
		System.out.println("cosa");		
		
	}

	@Override
	public void noCosa() {
		System.out.println("no cosa");		
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
	
	

}
