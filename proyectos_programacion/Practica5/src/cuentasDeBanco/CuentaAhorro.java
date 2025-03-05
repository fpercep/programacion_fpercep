package cuentasDeBanco;

public class CuentaAhorro extends CuentaBancaria {

	private static float tipoInteres =  0.5f;
	
	public CuentaAhorro(Persona titular, Double saldo) {
		super(titular, saldo);
	}

	public static float getTipoInteres() {
		return tipoInteres;
	}

	public static void setTipoInteres(float tipoInteres) {
		CuentaAhorro.tipoInteres = tipoInteres;
	}
}