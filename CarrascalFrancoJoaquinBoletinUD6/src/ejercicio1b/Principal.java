package ejercicio1b;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculadora c = new Calculadora();
		int num1, num2;
		boolean repetir;
		
		do {
		repetir = true;
		try {
		
		System.out.println("numero 1");
		num1 = Integer.parseInt(sc.nextLine());

		System.out.println("numero 2");
		num2 = Integer.parseInt(sc.nextLine());
		
		c.dividirPorCero(num1 , num2);
		repetir = false;
		
		}catch(ArithmeticException a) {
			
			System.err.println("Por cero no se puede crack"); 
			
		}catch(Exception e) {
			
			System.err.println("Error inesperado");
			
		}
		
		}while(repetir);
		
		System.out.println("Fin");
		
		sc.close();
		
	}

}
