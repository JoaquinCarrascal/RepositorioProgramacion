package main;

import java.util.Scanner;

import crud.CrudProducto;
import model.Producto;

public class Principal {

	public static void main(String[] args) 
	{

		
		Scanner keyB = new Scanner(System.in);
		Producto [] listado;
		int tam = 10;
		Producto p1 = new Producto ("1a" , "Atún" , 1.50, true);
		Producto p2 = new Producto ("2b" , "Pan de molde" , 4.50, true);
		CrudProducto cp;
		listado = new Producto [tam];
		cp = new CrudProducto(listado);
		
		cp.add(p1, 0);
		cp.add(p2, 1);
		
		keyB.close();
	}

}
