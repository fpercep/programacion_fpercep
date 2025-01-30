package unidad05;

public class Punto {
	private double x;
	private double y;
	
	public Punto() {
		this.x = 0d;
		this.y = 0d;
	}
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplazar(double dispX, double dispY) {
		this.x = dispX;
		this.y = dispY;
	}
	
	public Punto puntoInverso() {
		Punto puntoInverso = new Punto(this.x * -1,this.x * -1);
		return puntoInverso;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double calcularArea() {
		double area = (this.x * this.y);
		return Math.abs(area);		
	}
	
	public double calcularPerimetro() {
		return (Math.abs(this.x) + Math.abs(this.y))* 2 * 4;
	}
	
	public String toString() {
		String punto = "Punto: (" + this.x + " , " + this.y + ") ";
		return punto;
	}
}
