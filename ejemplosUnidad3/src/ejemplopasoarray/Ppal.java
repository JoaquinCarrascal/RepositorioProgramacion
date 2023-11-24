package ejemplopasoarray;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) 
	{

		Listas l1 = new Listas();
		Scanner sc = new Scanner(System.in);
		String aux;
		int hasta, desde,tam;
		int[] miArray;
		
		System.out.println("Desde");
		aux = sc.nextLine();
		desde = Integer.parseInt(aux);
		System.out.println("Hasta");
		aux = sc.nextLine();
		hasta = Integer.parseInt(aux);
		System.out.println("tam");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		miArray = new int[tam];
		l1.rellenarArray(miArray, desde, hasta);
		l1.mostrarArray(miArray);
		sc.close();
	}

}
