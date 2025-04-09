import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean salir = false;
		boolean correcto = false;
		int opcion;

		Concesionario concesionario = new Concesionario();
		Vehiculo v;
		String marca, matricula, descripcion, nombreProp, DNIProp;
		int kms = 0, dia, mes, anio;
		double precio = 0;
		LocalDate fechaMatriculacion = null;

		while (!salir) {

			System.out.println("1. Nuevo vehiculo");
			System.out.println("2. Listar vehiculos");
			System.out.println("3. Buscar vehiculo");
			System.out.println("4. Modificar kms vehiculo");
			System.out.println("5. Salir");
			System.out.println("Elige una opcion");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Introduce la marca");
				marca = scan.next();

				do {
					System.out.println("Introduce la matricula");
					matricula = scan.next();
				} while (!Validacion.validarMatricula(matricula));

				do {
					correcto = true;

					try {
						System.out.println("Introduce el numero de km");
						kms = scan.nextInt();
					} catch (InputMismatchException e) {
						correcto = false;
						scan.next();
					}

				} while (!correcto);

				do {
					correcto = true;

					try {
						System.out.println("Introduce el dia de la fecha de matriculacion");
						dia = scan.nextInt();

						System.out.println("Introduce el mes de la fecha de matriculacion");
						mes = scan.nextInt();

						System.out.println("Introduce el año de la fecha de matriculacion");
						anio = scan.nextInt();

						fechaMatriculacion = LocalDate.of(anio, mes, dia);
					} catch (InputMismatchException e) {
						correcto = false;
						scan.next();
					} catch (DateTimeException e) {
						correcto = false;
					}

				} while (!correcto);

				System.out.println("Introduce la descripcion");
				descripcion = scan.next();

				do {
					System.out.println("Introduce el nombre del propietario");
					nombreProp = scan.next();
				} while (!Validacion.validarNombre(nombreProp));

				do {
					System.out.println("Introduce el dni del propietario");
					DNIProp = scan.next();
				} while (!Validacion.validarDNI(DNIProp));

				do {
					correcto = true;

					try {
						System.out.println("Introduce el precio");
						precio = scan.nextDouble();
					} catch (InputMismatchException e) {
						correcto = false;
						scan.next();
					}

				} while (!correcto);

				v = new Vehiculo(marca, matricula, kms, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);

				switch (concesionario.insertarVehiculo(v)) {
				case -2:
					System.out.println("El vehiculo existe");
					break;
				case -1:
					System.out.println("El concesionario esta lleno");
					break;
				case 0:
					System.out.println("Vehiculo insertado correctamente");
					break;
				}

				break;
			case 2:
				concesionario.listarVehiculos();
				break;
			case 3:

				System.out.println("Inserta la matricula");
				matricula = scan.next();

				v = concesionario.buscaVehiculo(matricula);

				if (v != null) {
					System.out.println(v.getMarca());
					System.out.println(v.getMatricula());
					System.out.println(v.getPrecio());
				} else {
					System.out.println("No existe el vehiculo con la matricula introducida");
				}

				break;
			case 4:
				System.out.println("Inserta la matricula");
				matricula = scan.next();

				System.out.println("Inserta los nuevos kms");
				kms = scan.nextInt();

				if (concesionario.actualizaKms(matricula, kms)) {
					System.out.println("Los kms se ha actualizado correctamente");
				} else {
					System.out.println("No existe el vehiculo con la matricula introducida");
				}

				break;
			case 5:
				salir = true;
				break;
			}

		}
		scan.close();
	}

}
