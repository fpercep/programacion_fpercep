package unidad05.persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		System.out.println(persona1);
		
		String nombre = "juan";
		int edad = 18;
		char sexo = 'M';
		double peso = 56.6;
		double altura = 1.87;
		
		Persona persona2 = new Persona(nombre, edad, sexo, peso, altura);
		System.out.println(persona2);
		
		System.out.println(persona2.calcularImc());
		}
}
