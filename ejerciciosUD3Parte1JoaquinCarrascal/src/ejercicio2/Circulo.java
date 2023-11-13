package ejercicio2;

public class Circulo {

	private double radio;

	public Circulo(double radio) {

		this.radio = radio;
	}

	public double calcularArea() {

		double area, dos = 2;
		area = Math.PI * Math.pow(radio, dos);
		return area;

	}

	public void mostrarArea(double area) {

		System.out.printf("El área de su circulo es de %.2f cm2 \n", area);

	}
	
	//no se imprime en los metodos que calculan

	public double calcularAreaM2() {

		double conver = 10000;
		return calcularArea() / conver;

	}

	public void mostrarAreaM2(double areaM2) {

		System.out.printf("El area en m2 es de %.2f \n ", areaM2);

	}

}
