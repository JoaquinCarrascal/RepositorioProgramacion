package ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{

	Scanner tecl = new Scanner(System.in);
	byte auxProd1 = 0;
	byte auxProd2 = 0;
	byte auxProd3 = 0;
	float precProd1 = 0f;
	float precProd2 = 0f;
	float precProd3 = 0f;
	float precTotal = 0f;
	float pagoClient = 0f;
	float vueltaClient = 0f;
	String nombre1 = "";
	String fecha1 = "";
	String auxT = "";
	String prod1 = "Patatas medianas";
	String prod2 = "Bebida mediana";
	String prod3 = "Hamburguesa Mc Royal";
	float precTot1 = 0f;
	float precTot2 = 0f;
	float precTot3 = 0f;
	String id1 = "Patatas medianas    ";
	String id2 = "Bebida mediana      ";
	String id3 = "Hamburguesa Mc Royal";
	
			
	System.out.println("Bienvenido al programa de ayuda de McDonals,\n"
			+ "vamos a gestionarle el siguiente ticket.");
	System.out.println("Introduzca su nombre e identificador:");
	nombre1 = tecl.nextLine();
	System.out.println("Introduzca la fecha de hoy con espacios entre los datos:");
	fecha1 = tecl.nextLine();
	
	System.out.printf("Introduzca por favor la cantidad de %s :",prod1);
	auxT = tecl.nextLine();
	auxProd1 = Byte.parseByte(auxT);
	System.out.printf("Introduzca el precio del %s :",prod1);
	auxT = tecl.nextLine();
	precProd1 = Float.parseFloat(auxT);
	precTot1 = precProd1 * auxProd1;
	
	System.out.printf("Introduzca por favor la cantidad de %s :",prod2);
	auxT = tecl.nextLine();
	auxProd2 = Byte.parseByte(auxT);
	System.out.printf("Introduzca el precio del %s :",prod2);
	auxT = tecl.nextLine();
	precProd2 = Float.parseFloat(auxT);
	precTot2 = precProd2 * auxProd2;
	
	System.out.printf("Introduzca por favor la cantidad de %s :",prod3);
	auxT = tecl.nextLine();
	auxProd3 = Byte.parseByte(auxT);
	System.out.printf("Introduzca el precio del %s :",prod3);
	auxT = tecl.nextLine();
	precProd3 = Float.parseFloat(auxT);
	precTot3 = precProd3 * auxProd3;
	
	precTotal = (auxProd1 * precProd1) + (auxProd2 * precProd2) + (auxProd3 * precProd3);
	System.out.printf("Serían %.2f euros.\n",precTotal);
	System.out.println("Introduzca la cantidad que ha pagado el cliente: ");
	auxT = tecl.nextLine();
	pagoClient = Float.parseFloat(auxT);
	vueltaClient = pagoClient - precTotal;
	System.out.printf("La vuelta serían %.2f euros.\n",vueltaClient); 
	
	System.out.println("");
	System.out.println("\t\tBienvenido a McDonals");
	System.out.println("Fecha de hoy: " + fecha1);
	System.out.println("Le atendió: " + nombre1);
	System.out.println("--------------------------------------------------------");
	System.out.println("Nombre prod.\t\t PVP\t cantidad\t precio");
	System.out.printf("%s\t %.2f\t\t %d\t %.2f\n",id1,precProd1,auxProd1,precTot1);
	System.out.println("");
	System.out.printf("%s\t %.2f\t\t %d\t %.2f\n",id2,precProd2,auxProd2,precTot2);
	System.out.println("");
	System.out.printf("%s\t %.2f\t\t %d\t %.2f\n",id3,precProd3,auxProd3,precTot3);
	System.out.println("");
	System.out.println("--------------------------------------------------------");
	System.out.printf("\nTotal a pagar:                                    %.2f",precTotal);
	System.out.printf("\nTotal pagado:                                     %.2f",pagoClient);
	System.out.printf("\nDevuelto:                                         %.2f",vueltaClient);
	System.out.println("\n--------------------------------------------------------");
	System.out.println("¡Disfrute de su comida!");
	System.out.println("Gracias por venir a McDonals :):");
	tecl.close();
	}

}
