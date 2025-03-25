package pruebaSegunda;

public class pruebaHijoCuarta extends PruebaPadreHijo {

	private String primero;
	private int segunda;
	private boolean tercero;
	private static String cuarto = "cuarto";
	
	public pruebaHijoCuarta(String string, int numero, String primero, int segunda, boolean tercero) throws PruebNumeroException {
		super(string, numero);
		this.primero = primero;
		this.segunda = segunda;
		this.tercero = tercero;
	}

	@Override
	public void noCosa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cosa() {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(primero);
		sb.append(segunda);
		sb.append(tercero);
		sb.append(cuarto);
		return sb.toString();

	}
	
	public String getPrimero() {
		return primero;
	}

	public void setPrimero(String primero) {
		this.primero = primero;
	}

	public int getSegunda() {
		return segunda;
	}

	public void setSegunda(int segunda) {
		this.segunda = segunda;
	}

	public boolean isTercero() {
		return tercero;
	}

	public void setTercero(boolean tercero) {
		this.tercero = tercero;
	}

	public static String getCuarto() {
		return cuarto;
	}

	public static void setCuarto(String cuarto) {
		pruebaHijoCuarta.cuarto = cuarto;
	}
	
	

}
