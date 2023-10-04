package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		/*5. ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta pago de mantenimiento un 1 %
	del saldo con la que la abrí inicialmente al año y tengo unos intereses del 3 % del saldo inicial? Hacer
	un programa que calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el que
	se quiere abrir la cuenta.*/
		
		Scanner tecl = new Scanner(System.in);
		float saldoFinAno = 0f;
		float saldoIntrodIni = 0f;
		float mante = 1f;
		float cien = 100f;
		float interIni = 3f;
		String aux = "";
		float auxInter = 0f;
		
		System.out.println("Buenas consumidor, este pequeño programa calcula el saldo "
					   + "\ndel que dispondrá en su cuenta a final de año siendo aplicados "
					   + "\nlos intereses y gastos de mantenimiento pertinentes.");
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("\nPorfavor introduzca el saldo inicial de su cuenta "
						 + "\ncon un punto para separar los decimales: ");
		aux = tecl.nextLine();
		saldoIntrodIni = Float.parseFloat(aux);
		auxInter = saldoIntrodIni*interIni/100;
		saldoIntrodIni = saldoIntrodIni + auxInter;
		saldoFinAno = saldoIntrodIni - (saldoIntrodIni*mante/cien);
		
		System.out.println("\n---------------------------------------------------------------");
		System.out.printf("\nUsted tendrá %.2f euros a final de año en su cuenta.\n",saldoFinAno);
		System.out.println("\n\tGracias por usar el programa :):");
		
		
	}

}
