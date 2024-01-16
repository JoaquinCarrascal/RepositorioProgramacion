package ejemploPolimorfismo;

public class Cuadrado extends Figura{

	public double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}
	
	

	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}



	public void mostrarLados (){
		System.out.println("Solo estoy en la clase Cuadrado porque los demás no tienen lados, en concreto tengo 4 lados ");
		}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	
}
