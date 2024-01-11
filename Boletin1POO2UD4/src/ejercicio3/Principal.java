package ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		String aux;
		Coche coc;
		Motocicleta mot;
		Furgoneta fur;
		int casoMenu,tipoEmision,cilindrada;
		double caballos;
		String nombre;
		
		System.out.println("Gestionar motocicleta(1), gestionar coche(2),gestionar furgoneta(3) ");
		aux = sc.nextLine();
		casoMenu = Integer.parseInt(aux);
		System.out.println("Diga el modelo de su vehículo.");
		nombre = sc.nextLine();
		System.out.println("Diga tipo de emision cero(0),eco(1),tipoB(2),tipoC(3).");
		aux = sc.nextLine();
		tipoEmision = Integer.parseInt(aux);
		System.out.println("Diga caballos del vehículo.");
		aux = sc.nextLine();
		caballos = Double.parseDouble(aux);
		System.out.println("Diga centimetros cubicos del vehículo");
		aux = sc.nextLine();
		cilindrada = Integer.parseInt(aux);
		
		switch(casoMenu) {
		case 1:
			mot = new Motocicleta(tipoEmision,caballos,cilindrada,nombre);
			System.out.printf("El impuesto de circulacion de su motocicleta es: %.2f €.",mot.calculoImpuestoCirc());
			break;
		case 2:
			coc = new Coche(tipoEmision,caballos,cilindrada,nombre);
			System.out.printf("El impuesto de circulacion de su coche es: %.2f €.",coc.calculoImpuestoCirc());
			break;
		case 3:
			fur = new Furgoneta(tipoEmision,caballos,cilindrada,nombre);
			System.out.printf("El impuesto de circulacion de su furgoneta es: %.2f €.",fur.calculoImpuestoCirc());
			break;
		}
		
		sc.close();
	}

}
