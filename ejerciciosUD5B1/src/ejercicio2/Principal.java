package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	List <Socio> listado = new ArrayList<Socio>();
	CRUDSocio crS1 = new CRUDSocio(listado);
	Scanner sc = new Scanner(System.in);
	
	Socio sc1 = new Socio("Joaquín Carrascal", 21, "45996465Y");
	Socio sc2 = new Socio("Pepe Botika", 56, "45996434D");
	Socio sc3 = new Socio("Jesús de la Rosa", 34, "45996413U");
	Socio sc4 = new Socio("Migue Benitez", 22, "459964610L");
	Socio sc5 = new Socio("Andrea Bocelli", 50, "45996498P");

	crS1.agregarSocio(sc1);
	crS1.agregarSocio(sc2);
	crS1.agregarSocio(sc3);
	crS1.agregarSocio(sc4);
	crS1.agregarSocio(sc5);
	
	System.out.println("Introduzca un dni para buscar");
	System.out.println(crS1.buscarXDni(sc.nextLine()));
	
	sc.close();
	}

}
