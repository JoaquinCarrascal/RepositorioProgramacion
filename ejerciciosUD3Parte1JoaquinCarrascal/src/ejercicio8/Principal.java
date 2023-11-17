package ejercicio8;

import java.util.Scanner;

public class Principal {

	  /*Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por
		su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
		• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime
		de nuevo el saldo, pero sí lo actualiza.
		• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una
		determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero
		sí lo actualiza.
		• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el
		valor del saldo en dólares.
		• Consultar el saldo. Solo imprime el saldo.
		Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente
		las funcionalidades descritas y un main con un menú para probarlas.*/
	
	public static void main(String[] args) 
	{
	
		Scanner keyB = new Scanner(System.in);
		String aux, accountHolder,currenName = "dólares",
		menuMsg1="Ingresar dinero.",menuMsg2="Retirar dinero",menuMsg3="Hacer cambio de divisa a dólar americano.",menuMsg4="Consultar saldo";
		double currency, equivalence, quantity;
		Gestor ges;
		int exitCase = 0, menuCase;
		
		System.out.println("Bienvenido a la terminal de gestión bancaria.");
		System.out.println("---------------------------------------------");
		System.out.println("Introduzca su nombre porfavor.");
		accountHolder = keyB.nextLine();
		System.out.println("Introduzca el saldo inicial de su cuenta.");
		aux = keyB.nextLine();
		currency = Double.parseDouble(aux);
		ges = new Gestor(accountHolder,currency);

		do {
			System.out.printf("""
					1.- %s
					2.- %s
					3.- %s
					4.- %s
					0.- Salir del menú.
				  """,menuMsg1,menuMsg2,menuMsg3,menuMsg4);
			aux = keyB.nextLine();
			menuCase = Integer.parseInt(aux);
						
			switch(menuCase) {
			
			case 1:
				System.out.println(menuMsg1);
				System.out.println("¿Cuánto dinero desea ingresar?");
				aux = keyB.nextLine();
				currency = Double.parseDouble(aux);
				ges.depositCurrency(currency);
				break;
				
			case 2:
				do {
				System.out.println(menuMsg2);
				System.out.println("¿Cuánto dinero desea retirar?");
				aux = keyB.nextLine();
				currency = Double.parseDouble(aux);
				
				if(ges.getreservoir()>currency)
					ges.withdrawCurrency(currency);
				else
					System.out.println("No se dispone de tal capital, inténtelo de nuevo.");
				
				System.out.println("Si desea continuar pulse cualquier número, si desea salir pulse 0.");
				aux = keyB.nextLine();
				menuCase = Integer.parseInt(aux);
				}while(menuCase != exitCase);
				break;
				
			case 3:
				System.out.println(menuMsg3);
				System.out.println("Introduzca la equivalencia a la moneda que desea:");
				aux = keyB.nextLine();
				equivalence = Double.parseDouble(aux);
				System.out.println("Introduzca la cantidad que desea cambiar:");
				aux = keyB.nextLine();
				quantity = Double.parseDouble(aux);
				System.out.printf("Al cambio serían unos %.2f %s.",ges.calculateCurrency(equivalence, quantity),currenName);
				System.out.println("\n");
				break;
				
			case 4:
				System.out.println(menuMsg4);
				ges.printReservoir();
				System.out.println("\n");
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("¡Vaya! parece que el número introducido no corresponde con una opción válida.");
			}
		
		}while(menuCase != exitCase);
		
		
		
		keyB.close();
	}

}
