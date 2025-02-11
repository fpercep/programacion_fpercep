package unidad05;

public class Pinguino extends Ave{

	public Pinguino (String lugarNacimiento) {
		super(lugarNacimiento, 2, Boolean.FALSE, Boolean.TRUE);
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String volador = this.isVolador() ? "volador" : "no volador";
		sb.append("El animal es un pinguino. Que es un animal ").append(volador).append(" y ").append("\n").append(super.toString());
		return sb.toString();
	}
	
	public void pesca() {
		System.out.println("Esta pescando");
	}

}
