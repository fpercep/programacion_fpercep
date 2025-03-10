package cuentasDeBanco;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona(String nombre, String apellido, String dni) throws DNIException {
		this.nombre = nombre;
		this.apellido = apellido;
		if(checkDNI(dni)) {
			this.dni = dni;
		}else {
			throw new DNIException("El DNI no respeta el formatado NNNNNNNNL");
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws DNIException {
		if(checkDNI(dni)) {
			this.dni = dni;
		}else {
			throw new DNIException("El DNI no respeta el formatado NNNNNNNNL");
		}
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
		
	}
