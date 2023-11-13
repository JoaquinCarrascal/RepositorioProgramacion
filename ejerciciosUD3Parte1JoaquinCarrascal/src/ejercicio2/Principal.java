package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner keyB = new Scanner(System.in);
		double area = 0;
		String aux;
		Circulo c1;

		System.out.println("Diga el radio");
		aux = keyB.nextLine();
		area = Double.parseDouble(aux);
		c1 = new Circulo(area);
		c1.mostrarArea(c1.calcularArea());
		c1.mostrarAreaM2(c1.calcularAreaM2());

		keyB.close();
	}

}
