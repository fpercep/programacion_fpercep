package unidad05.vivienda;

public class ViviendaMain {

	public static void main(String[] args) {
		// Crear propietarios con DNI
        Propietario propietario1 = new Propietario("Juan Pérez", "12345678A");
        Propietario propietario2 = new Propietario("Ana Gómez", "87654321B");
        Propietario propietario3 = new Propietario("Carlos Ruiz", "56781234C");
        Propietario propietario4 = new Propietario("María López", "98765432B");


        // Crear dos casas
        Casa casa1 = new Casa("Calle Falsa 123", 150, propietario1, true, false);
        Casa casa2 = new Casa("Avenida Siempre Viva 456", 200, propietario2, true, true);
        Casa casa3 = new Casa("Calle Principal 123", 120, propietario4, false, false);


        // Crear un apartamento
        Apartamento apartamento1 = new Apartamento("Calle Real 789", 80, propietario3, 3, 'A');
        
        System.out.println(casa1.toString( ) + "\n");
        System.out.println(casa2.toString() + "\n");
        System.out.println(casa3.toString() + "\n");
        System.out.println(apartamento1.toString() + "\n");

	}

}
