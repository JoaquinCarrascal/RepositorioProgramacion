package ejercicioExamen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String matricula;
		int tam = 10, casoMenu = 0, casoSalida = 0;
		double cantFija = 0, plusLongitud = 0, plusNavidenyo = 0;

		VehiculoGenerico[] lista = new VehiculoGenerico[tam];
		Parking pk1 = new Parking(lista, "c/ Ave del Paraíso nº22");

		VehiculoGenerico v1 = new VehiculoGenerico("SE4519G", 10);// matricula , tiempo estacionado
		VehiculoGenerico v2 = new VehiculoGenerico("SE2418A", 15);
		VehiculoGenerico v3 = new Furgoneta("3381AN", 120, 10);// matricula , tiempo estacionado,longitud
		VehiculoGenerico v4 = new Furgoneta("8301KL", 80, 3);
		VehiculoGenerico v5 = new Moto("1234AEG", 221, 650);// matricula , tiempo estacionado,cilindrada
		VehiculoGenerico v6 = new Moto("4321GEA", 25, 49);

		pk1.agregarVehiculo(v1);
		pk1.agregarVehiculo(v2);
		pk1.agregarVehiculo(v3);
		pk1.agregarVehiculo(v4);
		pk1.agregarVehiculo(v5);
		pk1.agregarVehiculo(v6);

		System.out.println("Bienvenido al programa");
		System.out.println("Seleccione lo que desee hacer:");
		
		do {
			System.out.println("\n1.- Calcular el precio del estacionamiento de un vehículo.\n"
					+ "2.- Mostrar los datos de todos los vehículos.\n" + "3.- Calcular la recaudación de las motos.\n"
					+ "4.- Calcular precio en Navidad.\n" + "0.- Salir.");
			
			casoMenu = Integer.parseInt(sc.nextLine());
			switch (casoMenu) {

			case 1:
				do {
					System.out.println("Introduzca la matrícula del vehículo:");
					matricula = sc.nextLine();
					
					if (!pk1.estaEnLista(matricula))
						System.out.println("Vaya, parece que no tenemos registrada dicha matrícula, inténtelo de nuevo.");
				} while (!pk1.estaEnLista(matricula));
				
				System.out.println("Introduzca el precio por minuto del parking:");
				cantFija = Double.parseDouble(sc.nextLine());
				
				System.out.println("Introduzca el plus de longitud:");
				plusLongitud = Double.parseDouble(sc.nextLine());
				
				System.out.printf("El precio por estacionar dicho vehículo será de: %.2f€.\n",
						pk1.calcularPrecioConcreto(matricula, cantFija, plusLongitud));
				break;

			case 2:
				Impresion.imprimirListaParking(pk1);
				break;

			case 3:
				System.out.println("Introduzca el precio por minuto del parking:");
				cantFija = Double.parseDouble(sc.nextLine());// le asigno 0 porque las motos no tienen plus de
				plusLongitud = 0; 							// longitud y así no es necesario pedírselo al usuario
				
				System.out.printf("El total recaudado por las motos son: %.2f€.\n",
						pk1.recaudadoEnMotos(cantFija, plusLongitud));
				break;

			case 4:
				do {
					System.out.println("Introduzca la matrícula del vehículo:");
					matricula = sc.nextLine();
					
					if (!pk1.estaEnLista(matricula))
						System.out.println("Vaya, parece que no tenemos registrada dicha matrícula, inténtelo de nuevo.");
				} while (!pk1.estaEnLista(matricula));
				
				System.out.println("Introduzca el precio por minuto del parking:");
				cantFija = Double.parseDouble(sc.nextLine());
				
				System.out.println("Introduzca el plus de longitud:");
				plusLongitud = Double.parseDouble(sc.nextLine());
				
				System.out.println("Introduzca el plus Navideño:");
				plusNavidenyo = Double.parseDouble(sc.nextLine());
				
				System.out.printf("El precio por estacionar dicho vehículo en Navidad será de: %.2f€.\n",
						pk1.calcularEnNavidad(matricula, cantFija, plusLongitud, plusNavidenyo));
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("El número introducido no esta contemplado entre las opciones, inténtelo de nuevo.");
			}

		} while (casoMenu != casoSalida);

		System.out.println("¡Hasta pronto!");

		sc.close();

	}

}
