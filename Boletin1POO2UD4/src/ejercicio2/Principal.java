package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);
		Carta cr1;
		//Documento d1;
		TarjetaDeVisita tdv1;
		String aux,nombreEmpresa, direccionEmpresa,nombreCEO,datosPersonaDeContacto,fecha;
		int casoMenu;
		
		System.out.println("Imprimir carta(1), imprimir tarjeta de visita(cualquier número)");
		aux = sc.nextLine();
		casoMenu = Integer.parseInt(aux);
		
		System.out.println("Diga el nombre de la empresa");
		nombreEmpresa = sc.nextLine();
		System.out.println("Diga la dirección de la empresa");
		direccionEmpresa = sc.nextLine();
		System.out.println("Diga el nombre del dueño de la empresa");
		nombreCEO = sc.nextLine();
		
		//d1 = new Documento (nombreEmpresa,direccionEmpresa,nombreCEO);
		//d1.imprimirDocumento();
		
		switch(casoMenu) {
		case 1:
			System.out.println("Diga la fecha a la que escribe la carta:");
			fecha = sc.nextLine();
			cr1 = new Carta(nombreEmpresa,direccionEmpresa,nombreCEO,fecha);
			cr1.imprimirDocumento();
			break;
		case 2:
			System.out.println("Diga los datos de la persona de contacto en la empresa");
			datosPersonaDeContacto = sc.nextLine();
			tdv1 = new TarjetaDeVisita(nombreEmpresa,direccionEmpresa,nombreCEO,datosPersonaDeContacto);
			tdv1.imprimirDocumento();
			break;
		}
		
		sc.close();
	}

}
