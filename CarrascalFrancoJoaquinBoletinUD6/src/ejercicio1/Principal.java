package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int num1, num2,casoMenu = 0,casoSalida = 0 ;
		Scanner sc = new Scanner(System.in);
		double res = 0;
		
		do {
		
			try {
				
				System.out.println("\nIntroduzca el primer número");
				
				num1 = Integer.parseInt(sc.nextLine());
				
				System.out.println("""
						1.- Suma
						2.- Resta
						3.- Multiplicación
						4.- División
						5.- Raíz Cuadrada
									""");
				
				casoMenu = Integer.parseInt(sc.nextLine());
				
				switch(casoMenu) {
				
				case 1:
					
					System.out.println("Introduzca el segundo numero");
					
					num2 = Integer.parseInt(sc.nextLine());
					
					res = num1 + num2;
					
					break;
					
				case 2:
					
					System.out.println("Introduzca el segundo numero");
					
					num2 = Integer.parseInt(sc.nextLine());
					
					res = num1 - num2;

					break;
					
				case 3:
					
					System.out.println("Introduzca el segundo numero");
					
					num2 = Integer.parseInt(sc.nextLine());
					
					res = num1 * num2;

					break;
	
				case 4:
					
					System.out.println("Introduzca el segundo numero");
					
					num2 = Integer.parseInt(sc.nextLine());
					
					res = num1 / num2;

					break;
					
				case 5:
					
					res = Math.sqrt(num1);
					
					break;
				
				}	
				
			}catch(Exception e){
				
				System.out.println("Vaya parece que ese cálculo no está soportado");
				
			}
			
			System.out.printf("El resultado es: %.2f \n",res);
		
		}while(casoMenu != casoSalida);
		
		System.out.println("Hasta pronto");
		
		sc.close();
		
	}

}
