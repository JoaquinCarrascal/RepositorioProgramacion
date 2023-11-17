package ejercicio2;

import java.util.Scanner;

/* 2. Realizar un programa que calcule el espacio recorrido por un objeto que se mueve a velocidad constante. El
objeto, por ejemplo, zapatilla de una madre hacia el hijo, ha recorrido un espacio inicial de 5.5 m y se mueve
a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor al tiempo que el objeto está en movimiento.
La ecuación usada es:
espacio= espacioInicial + velocidad*tiempo */

public class Principal {

	public static void main(String[] args) 
	{

		Scanner tecl = new Scanner(System.in);
		float tiempo = 0f;
		float espacioI = 5.5f;
		float espacioFin = 0f;
		float veloConst = 3.2f;
		String aux = "";
		
		System.out.println("Buenas, este pequeño programa calcula el espacio \nrecorrido por un objeto que se mueve a velocidad constante.");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Introduzca el tiempo que estara el objeto en movimiento:");
		aux = tecl.nextLine();
		tiempo = Float.parseFloat(aux);
		System.out.println("\n----------------------------------------------------------------------");
		System.out.printf("El objeto esta en movimiento durante %.2f segundos.",tiempo);
		System.out.println("\n----------------------------------------------------------------------");
		System.out.printf("Podemos afirmar que como se mueve a una velocidad constante de %.2f ms: ",veloConst);
		espacioFin = espacioI + (veloConst*tiempo);
		System.out.printf("\nEl objeto recorrerá %.2f metros, en esos %.2f segundos.",espacioFin,tiempo);
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("Gracias por usar el programa :):");
		tecl.close();
	}

}
