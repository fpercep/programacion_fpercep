package animales;

public class Diego extends Pez {

	public Diego(String nombre, int edad) {
		super(nombre, edad);
	}
	
	public void explotar() {
		if (isVivo()) {
			this.matar();
			System.out.println(getNombre() + " ha explotado");
		} else {
			System.out.println(getNombre() + " a muerto, posiblemente explotado");
		}

	}
	
	public void acosar() {
		if (isVivo()) {
			System.out.println(getNombre() + " te esta acosando");
		}else {
			System.out.println(getNombre() + " a muerto, posiblemente explotado");
		}
	}

	@Override
	public void moverse() {
		System.out.println(this.getNombre() + " se esta moviendo");
	}
}
