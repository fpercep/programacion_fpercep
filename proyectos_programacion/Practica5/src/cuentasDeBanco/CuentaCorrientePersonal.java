package cuentasDeBanco;

public class CuentaCorrientePersonal extends CuentaCorriente implements Imprimible{
	
	private static float comsionMan = 0.5f;

	public CuentaCorrientePersonal(Persona titular, Double saldo, String numCuenta, String entAutorizadas)
			throws IBANException {
		super(titular, saldo, numCuenta, entAutorizadas);
	}

	public static float getComsionMan() {
		return comsionMan;
	}

	public static void setComsionMan(float comsionMan) {
		CuentaCorrientePersonal.comsionMan = comsionMan;
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cuenta personal con el IBAN ");
		sb.append(getNumCuenta());
		sb.append(" de ");
		sb.append(getTitular().getNombre());
		sb.append(" ");
		sb.append(getTitular().getApellido());
		sb.append(" ");
		sb.append(getTitular().getDni());
		sb.append(" con un saldo de ");
		sb.append(getSaldo());
		sb.append(" con una comisión de matenimiento del ");
		sb.append(getComsionMan());
		return sb.toString();
	}
}
