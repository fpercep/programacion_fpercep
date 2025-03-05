package cuentasDeBanco;

public abstract class CuentaBancaria {
	private Persona titular;
	private double saldo;
	private int numCuenta; //Es un IBAN y es generado
	
	public CuentaBancaria (Persona titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//TODO Hacer Generador de IBAN 
	public String GenerarIBAN(){
		return null;
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

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
}
