package unidad05.persona;

import java.util.Random;

public class Persona {
	
	private String nombre;
	private int edad ;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Persona () {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = this.generarDNI();
		this.sexo = 'N';
		this.peso = 0d;
		this.altura = 0d;
	}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.dni = this.generarDNI();
		this.peso = 0d;
		this.altura = 0d;

	}
	
	public Persona (String nombre, int edad, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.dni = this.generarDNI();

	}
	
	private char comprobarSexo(char sexo) {
		char SexoFinal = 'N';
		sexo =  Character.toUpperCase(sexo);
		if (sexo == 'M' || sexo == 'H') {
			SexoFinal = sexo;
		}
		return SexoFinal;
	}
	
	private String generarDNI() {
		Random random = new Random();
		int numeroDNI = random.nextInt(99999999) + 1;
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letrasDni.charAt((int) (numeroDNI % 23));
		String dni = "" + numeroDNI + letra;
		while (dni.length() < 9) {
			dni = "0" + dni;
		}
		return dni;
	}
	
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona:\n");
		if (nombre != null && !nombre.isBlank()) {
			builder.append(nombre);
			builder.append(", ");
		}
		if (dni != null) {
			builder.append("D.N.I.: ");
			builder.append(dni);
			builder.append(". ");
		}
		builder.append(edad);
		builder.append(" años");
		builder.append(". Sexo: ");
		if (sexo == 'H') {
			builder.append("hombre");
		} else if (sexo == 'M') {
			builder.append("mujer");
		} else {
			builder.append("no especificado");
		}
		builder.append(". Peso: ");
		builder.append(peso);
		builder.append(" kg., altura: ");
		builder.append(altura * 100);
		builder.append(" cm.");
		return builder.toString();
	}

	
	public int calcularImc() {
		float imc = (float) (this.peso / (this.altura * this.altura));
		int pesoIdeal = 0;
		if (imc < 20) {
			pesoIdeal = -1;
		} else if (imc > 25) {
			pesoIdeal = 1;
		}
		return pesoIdeal;
	}
}
