package cuentasDeBanco;

public class CuentaCorrienteEmpresa extends CuentaCorriente implements Imprimible{
	
	private static float inteDescubrimiento = 0.5f;
	private int maxDescubrimiento;
	private float comDescubrimiento;

	public CuentaCorrienteEmpresa(Persona titular, Double saldo, String numCuenta, String entAutorizadas, int maxDescubrimiento, float comDescubrimiento)
			throws IBANException {
		super(titular, saldo, numCuenta, entAutorizadas);
		this.maxDescubrimiento = maxDescubrimiento;
		this.comDescubrimiento = comDescubrimiento;
	}

	public static float getInteDescubrimiento() {
		return inteDescubrimiento;
	}

	public static void setInteDescubrimiento(float inteDescubrimiento) {
		CuentaCorrienteEmpresa.inteDescubrimiento = inteDescubrimiento;
	}

	public int getMaxDescubrimiento() {
		return maxDescubrimiento;
	}

	public void setMaxDescubrimiento(int maxDescubrimiento) {
		this.maxDescubrimiento = maxDescubrimiento;
	}

	public float getComDescubrimiento() {
		return comDescubrimiento;
	}

	public void setComDescubrimiento(float comDescubrimiento) {
		this.comDescubrimiento = comDescubrimiento;
	}

	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cuenta de empresa con el IBAN ");
		sb.append(getNumCuenta());
		sb.append(" de ");
		sb.append(getTitular().getNombre());
		sb.append(" ");
		sb.append(getTitular().getApellido());
		sb.append(" ");
		sb.append(getTitular().getDni());
		sb.append(" con un saldo de ");
		sb.append(getSaldo());
		sb.append(" con una comisión de descubrimiento del ");
		sb.append(this.comDescubrimiento);
		sb.append(" con una interes de descubrimiento del ");
		sb.append(getInteDescubrimiento());
		sb.append(" y un maximo de ");
		sb.append(this.maxDescubrimiento);
		return sb.toString();
	}
}
