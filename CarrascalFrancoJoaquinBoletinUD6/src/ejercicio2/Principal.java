package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Calcular c = new Calcular();
		double temp1 = 0, tope = -273.15;
		boolean salida;
		
		do {
			
			salida = true;
			
			try {
				
				System.out.println("Introduzca los grados celsius"); 
				
				temp1 = Double.parseDouble(sc.nextLine());
				
				System.out.printf("Son: %.2f grados Fahrenheit.",c.calcularGradosFahrenheit(temp1, tope));
				
				salida = false;
				
			}catch(AbsoluteCeroException a) {
				
				System.out.println("Parece que has intentado calcular por debajo del cero absoluto.");
				
			}catch(NumberFormatException n) {
				
				System.out.println("Introduce un número porfavor");
				
			}catch(Exception e) {
				
				System.out.println("Error inesperado ):");
				
			}
			
		}while(salida);
	
		sc.close();
	}

}
