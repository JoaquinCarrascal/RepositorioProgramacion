package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double temp1 = 0, temp2,tope = 273.15;
		
		do {
			
			try {
				
				System.out.println("Introduzca los grados celsius"); 
				
				temp1 = Double.parseDouble(sc.nextLine());
				
				if(temp1 < tope) {
					
					throw new Exception();
					
				}else {
					
					temp2 = (temp1 * 9 / 5) + 32;
				
					System.out.printf("Son: %.2f Fahrenheit.",temp2);
					
				}
				
			}catch(Exception e) {
				System.out.println("Parece que has intentado calcular por debajo del cero absoluto.");
			}
			
		}while(temp1 < tope);

	}

}
