package ejemploarrayobjetos;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) 
	{

		int nVs = 0,seguir, tam=100;//Contador de objetos Vehículo, variable para salir del bucle y tamaño
		String modelo;
		double potencia;
		
		//Creamos un array de objetos Vehiculo para almacenar 100 Vehículos
		Vehiculo lista[] = new Vehiculo[tam];
		Concesionario c = new Concesionario(lista,0);
		String aux;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Introduce el modelo del vehículo: ");
		modelo = sc.nextLine();
		System.out.print("Introduce la potencia: ");
		aux = sc.nextLine();
		potencia= Double.parseDouble(aux);
		c.agregar(new Vehiculo(modelo,potencia));
		System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
		aux = sc.nextLine();
		seguir = Integer.parseInt(aux);
		} while(seguir !=0 && nVs<lista.length);
		//Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, sino hasta donde hay vehículos con datos
		for (int i=0; i<nVs; i++){
		System.out.println (lista[i]);
		}
		System.out.println("Fin del programa");
		
		sc.close();
		
	}

}
