package cuentasDeBanco;

public class CuentasBancariasMain {

	public static void main(String[] args) throws IBANException, DNIException {

		// 1. Crear personas
		Persona p1 = new Persona("Juan", "Pérez", "77571128V");
		Persona p2 = new Persona("María", "González", "11187401V");
		Persona p3 = new Persona("Pedro", "López", "33869394P");
		Persona p4 = new Persona("Ana", "Martínez", "12783139S");
		Persona p5 = new Persona("Luis", "Sánchez", "70554766N");
		Persona p6 = new Persona("Elena", "Fernández", "68334992Z");
		Persona p7 = new Persona("Carlos", "Gómez", "16352418Q");
		Persona p8 = new Persona("Laura", "Díaz", "67786165J");
		Persona p9 = new Persona("Javier", "Ruiz", "39781294B");
		Persona p10 = new Persona("Sofía", "Hernández", "37315914R");

		// 2. Crear cuentas
		CuentaAhorro ca1 = new CuentaAhorro(p1, 1000.0, "ES2461317314353721026429");
		CuentaAhorro ca2 = new CuentaAhorro(p2, 2000.0, "ES7272971365774181295327");
		CuentaAhorro ca3 = new CuentaAhorro(p3, 1500.0, "ES9933869373210416705674");
		CuentaAhorro ca4 = new CuentaAhorro(p10, 3000.0, "ES9426368787040359372559");
		CuentaCorrientePersonal ccp1 = new CuentaCorrientePersonal(p4, 500.0, "ES4027774381389098118898",
				"EntidadA, EntidadB");
		CuentaCorrientePersonal ccp2 = new CuentaCorrientePersonal(p5, 1000.0, "ES2943761323575184008193", "EntidadC");
		CuentaCorrientePersonal ccp3 = new CuentaCorrientePersonal(p6, 2000.0, "ES6995458367101094470777",
				"EntidadD, EntidadE");
		CuentaCorrienteEmpresa cce1 = new CuentaCorrienteEmpresa(p7, 5000.0, "ES3861127044727081248083", "EntidadF",
				1000, 0.05f);
		CuentaCorrienteEmpresa cce2 = new CuentaCorrienteEmpresa(p8, 10000.0, "ES9401136668677765410524",
				"EntidadG, EntidadH", 2000, 0.03f);
		CuentaCorrienteEmpresa cce3 = new CuentaCorrienteEmpresa(p9, 15000.0, "ES6406631798101939359237", "EntidadI",
				3000, 0.04f);

		// 3. Crear banco y agregar cuentas
		Banco banco = new Banco();
		banco.abrirCuenta(ccp1);
		banco.abrirCuenta(ccp2);
		banco.abrirCuenta(ccp3);
		banco.abrirCuenta(ca1);
		banco.abrirCuenta(ca2);
		banco.abrirCuenta(ca3);
		banco.abrirCuenta(ca4);
		banco.abrirCuenta(cce1);
		banco.abrirCuenta(cce2);
		banco.abrirCuenta(cce3);

		// 4. Prueba: Listado de cuentas
		System.out.println("=== Listado de Cuentas ===");
		String[] listadoCuentas = banco.listadoCuentas();
		for (int i = 0; i < listadoCuentas.length; i++) {
			System.out.println(listadoCuentas[i]);
		}

		// 5. Prueba: Información por DNI/IBAN
		System.out.println("\n=== Listado de Cuentas por DNI/IBAN ===");
		System.out.println(banco.informacionCuenta(p1.getDni()));
		System.out.println(banco.informacionCuenta(ca1.getNumCuenta()));
		
		
		// 6. Pueba: Ingresos
        System.out.println("\n=== Ingreso a una cuenta ===");
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        banco.ingresoCuenta(p1.getDni(), 500.0);
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        banco.ingresoCuenta(p1.getDni(),  -500.0);
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));


		// 7. Pueba: Retirada 
        System.out.println("\n=== Retirada a una cuenta ===");
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        banco.retiradaCuenta(p1.getDni(), 500.0);
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        banco.retiradaCuenta(p1.getDni(),  -500.0);
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        banco.retiradaCuenta(p1.getDni(),  -1001.0);
        System.out.println("Saldo actual: " + banco.obtenerSaldo(p1.getDni()));
        
        // 8. Pruba con valores incorrectos
        System.out.println("\n=== Valores Incorrectos ===");
        System.out.println(banco.retiradaCuenta(GenerarIBAN(), 500.0));


	}

	public static String GenerarIBAN() {
		StringBuilder iBAN = new StringBuilder();
		iBAN.append("ES");
		for (int i = 0; i != 22; i++) {
			int numero = (int) (Math.random() * 10);
			iBAN.append(numero);
		}
		return iBAN.toString();
	}
}
