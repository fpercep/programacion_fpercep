package cuentasDeBanco;

public abstract class CuentaCorriente extends CuentaBancaria {
	
	private String entAutorizadas;

	public CuentaCorriente(Persona titular, Double saldo, String numCuenta, String entAutorizadas) throws IBANException {
		super(titular, saldo, numCuenta);
		this.entAutorizadas = entAutorizadas;
	}

	public String getEntAutorizadas() {
		return entAutorizadas;
	}

	public void setEntAutorizadas(String entAutorizadas) {
		this.entAutorizadas = entAutorizadas;
	}	
	
}
