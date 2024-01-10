package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		Sobremesa sm1;
		Portatil pt1;
		int casoMenu,seguroPant;
		boolean comprobadorSeguro=false;
		double capacidadHDD,frecProcesador,precioBaseProd=0,porcentGanan=0,precSeguroPant=0
			,precioMontaje=0;
		String aux,marcaProd;
		
		System.out.println("¿Portátil(1) o Sobremesa(2)?");
		aux = sc.nextLine();
		casoMenu = Integer.parseInt(aux);
		switch(casoMenu) {
		case 1:
			System.out.println("¿Quiere seguro de pantalla? 1 para sí.");
			aux = sc.nextLine();
			seguroPant = Integer.parseInt(aux);
			if(seguroPant==1) {
				comprobadorSeguro = true;
				System.out.println("Precio del seguro");
				aux = sc.nextLine();
				precSeguroPant = Double.parseDouble(aux);
			}
			else
				System.out.println("De acuerdo.");
			break;
		case 2:
			System.out.println("Precio de montaje del ordenador");
			aux = sc.nextLine();
			precioMontaje = Double.parseDouble(aux);
			break;
		}
		System.out.println("Introduzca capacidad HDD");
		aux = sc.nextLine();
		capacidadHDD = Double.parseDouble(aux);
		System.out.println("Introduzca frecuencia del procesador");
		aux = sc.nextLine();
		frecProcesador = Double.parseDouble(aux);
		System.out.println("Introduzca precio base del producto");
		aux = sc.nextLine();
		precioBaseProd = Double.parseDouble(aux);
		System.out.println("Introduzca marca del producto.");
		marcaProd = sc.nextLine();
		System.out.println("Introduzca porcentaje de ganancia que quiere obtener");
		aux = sc.nextLine();
		porcentGanan = Double.parseDouble(aux);
		
		if(casoMenu == 1) {
			pt1 = new Portatil(capacidadHDD,frecProcesador,
					precioBaseProd,marcaProd,comprobadorSeguro,precSeguroPant);
		System.out.println(pt1);
		System.out.printf("El P.V.P del portátil es: %.2f€.",pt1.calcularPVP(porcentGanan));
		}
		else {
			sm1 = new Sobremesa(capacidadHDD,frecProcesador,
					precioBaseProd,marcaProd,precioMontaje);
			System.out.println(sm1);
			System.out.printf("El P.V.P del ordenador es: %.2f€.",sm1.calcularPVP(porcentGanan));
		}
		
	sc.close();
	}

}
