package animales;

public abstract class Animal implements IAnimales{
	private int edad;
	private String nombre;
	private boolean vivo;

	public Animal (String nombre, int edad) {
		this.vivo = true;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void matar() {
		if (!vivo) {
			System.out.println(nombre + " ya estaba muerto");
		}else {
			vivo = false;
			System.out.println(nombre + " murio");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void reproducirse(Animal segundoAnimal) {
	    System.out.println(this.getNombre() + " está intentando reproducirse con " + segundoAnimal.getNombre());
	    
	    if (this.getClass().equals(segundoAnimal.getClass()) && this.isVivo() && segundoAnimal.isVivo()) {
	        System.out.println("Reproducción exitosa con " + segundoAnimal.getNombre());
	    } else {
	        System.out.println("Reproducción fallida con " + segundoAnimal.getNombre());
	        if (this.isVivo()) {
	        	System.out.println(getNombre() + " lo intento :(");
	        }
	    }
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
}
