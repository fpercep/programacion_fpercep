package cuentasDeBanco;

public class CuentaAhorro extends CuentaBancaria implements Imprimible{

	private static float tipoInteres =  0.5f;
	
	public CuentaAhorro(Persona titular, Double saldo, String numCuenta) throws IBANException {
		super(titular, saldo, numCuenta);
	}

	public static float getTipoInteres() {
		return tipoInteres;
	}

	public static void setTipoInteres(float tipoInteres) {
		CuentaAhorro.tipoInteres = tipoInteres;
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cuenta de ahorro con el IBAN ");
		sb.append(getNumCuenta());
		sb.append(" de ");
		sb.append(getTitular().getNombre());
		sb.append(" ");
		sb.append(getTitular().getApellido());
		sb.append(" ");
		sb.append(getTitular().getDni());
		sb.append(" con un saldo de ");
		sb.append(getSaldo());
		sb.append(" con un interes del ");
		sb.append(getTipoInteres());
		return sb.toString();
	}
}