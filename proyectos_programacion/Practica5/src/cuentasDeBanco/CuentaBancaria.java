package cuentasDeBanco;

public abstract class CuentaBancaria {
	private Persona titular;
	private double saldo;
	private String numCuenta;
	
	public CuentaBancaria (Persona titular, Double saldo, String numCuenta) throws IBANException {
		this.titular = titular;
		this.saldo = saldo;
		if(checkIBAN(numCuenta)) {
			this.numCuenta = numCuenta;
		} else {
			throw new IBANException("EL IBAN no respeta el formato ESNNNNNNNNNNNNNNNNNNNN");
		}
	}
	
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public static boolean checkIBAN (String numCuenta) {
		final String PATRON_IBAN = "ES[0-9]{22}";
		return numCuenta.toUpperCase().matches(PATRON_IBAN);
	}
}
