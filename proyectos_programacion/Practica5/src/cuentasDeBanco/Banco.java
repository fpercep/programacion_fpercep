package cuentasDeBanco;

public class Banco {
	private Imprimible[] Banco = new Imprimible[100];

	public Imprimible[] getBanco() {
		return Banco;
	}

	public void setBanco(Imprimible[] banco) {
		Banco = banco;
	}

	public boolean abrirCuenta(Imprimible Cuenta) {
		boolean exito = false;
		for (int i = 0; i < Banco.length; i++) {
			if (Banco[i] == null && exito != true) {
				Banco[i] = Cuenta;
				exito = true;
			}
		}
		return exito;
	}

	public String[] listadoCuentas() {
		int listaSize = 0;
		for (Imprimible cuenta : Banco) {
			if (cuenta != null) {
				listaSize++;
			}
		}
		String[] listadoCuentas = new String[listaSize];
		for (int i = 0; i < listadoCuentas.length; i++) {
			if (Banco[i] != null) {
				listadoCuentas[i] = i + 1 + ". " + Banco[i].imprimir();
			}
		}
		return listadoCuentas;
	}

	public String informacionCuenta(String input) {
		StringBuilder sb = new StringBuilder();
		if (checkDNI(input)) {
			boolean exito = false;
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (!exito) {
					sb = null;
				}
			}
		} else if (checkIBAN(input)) {
			boolean exito = false;
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						sb.append(cuenta.imprimir());
						exito = true;
					}
				} else if (!exito) {
					sb = null;
				}
			}
		} else {
			sb = null;
		}
		return sb.toString();
	}

	public static boolean checkDNI(String dni) {
		final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
		boolean dniCorrecto = false;
		String dniPattern = "[0-9]{8}[" + LETRAS + LETRAS.toLowerCase() + "]";
		if (dni.matches(dniPattern)) {
			String numStr = dni.substring(0, 8);
			Integer num = Integer.parseInt(numStr);
			Character letraCorrecta = LETRAS.charAt(num % 23);
			Character letra = dni.toUpperCase().charAt(8);
			if (letraCorrecta == letra) {
				dniCorrecto = true;
			}
		}
		return dniCorrecto;
	}

	public static boolean checkIBAN(String numCuenta) {
		final String PATRON_IBAN = "ES[0-9]{22}";
		return numCuenta.toUpperCase().matches(PATRON_IBAN);
	}

	public boolean ingresoCuenta(String input, Double dinero) {
		boolean correcto = false;
		if(dinero > 0) {
			if (checkDNI(input)) {
				correcto = false;
				for (int i = 0; i < this.Banco.length; i++) {
					if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
						CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
						Persona titular = cuenta.getTitular();
						if (titular.getDni().equals(input)) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}
					} else if (this.Banco[i] instanceof CuentaAhorro) {
						CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
						Persona titular = cuenta.getTitular();
						if (titular.getDni().equals(input)) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}
					} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
						CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
						Persona titular = cuenta.getTitular();
						if (titular.getDni().equals(input)) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}
					}
				}
			} else if (checkIBAN(input)) {
				for (int i = 0; i < this.Banco.length; i++) {
					if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
						CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
						if (cuenta.getNumCuenta() == input) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}
					} else if (this.Banco[i] instanceof CuentaAhorro) {
						CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
						if (cuenta.getNumCuenta() == input) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}
					} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
						CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
						if (cuenta.getNumCuenta() == input) {
							cuenta.setSaldo(cuenta.getSaldo() + dinero);
							correcto = true;
						}

					}
				}
			}
		}
		return correcto;
	}
	
	public boolean retiradaCuenta(String input, Double dinero) {
		boolean correcto = false;
		if(dinero < 0) {
			dinero = dinero * -1;
		}
		if (checkDNI(input)) {
			correcto = false;
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}
				}
			}
		} else if (checkIBAN(input)) {
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						cuenta.setSaldo(cuenta.getSaldo() - dinero);
						correcto = true;
					}

				}
			}
		}
		return correcto;
	}
	
	public Double obtenerSaldo(String input) {
		Double saldo = null;
		if (checkDNI(input)) {
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						saldo = cuenta.getSaldo();
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						saldo = cuenta.getSaldo();
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					Persona titular = cuenta.getTitular();
					if (titular.getDni().equals(input)) {
						saldo = cuenta.getSaldo();
					}
				}
			}
		} else if (checkIBAN(input)) {
			for (int i = 0; i < this.Banco.length; i++) {
				if (this.Banco[i] instanceof CuentaCorrienteEmpresa) {
					CuentaCorrienteEmpresa cuenta = (CuentaCorrienteEmpresa) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						saldo = cuenta.getSaldo();
					}
				} else if (this.Banco[i] instanceof CuentaAhorro) {
					CuentaAhorro cuenta = (CuentaAhorro) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						saldo = cuenta.getSaldo();
					}
				} else if (this.Banco[i] instanceof CuentaCorrientePersonal) {
					CuentaCorrientePersonal cuenta = (CuentaCorrientePersonal) Banco[i];
					if (cuenta.getNumCuenta() == input) {
						saldo = cuenta.getSaldo();
					}

				}
			}
		}
		return saldo;
	}
}
