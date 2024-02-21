package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Principal {


	public static void main(String[] args) {
		
		Map <Contacto,String>lista = new HashMap<>();
		CRUDContacto c = new CRUDContacto(lista);


		c.agregar(new Contacto("Pepe Botika"), "655727434");
		c.agregar(new Contacto("Roberto Iniesta"), "655727433");
		c.agregar(new Contacto("Roberto Iniesta"), "655727433");
		c.agregar(new Contacto("Franco Battiato"), "655727432");
		c.agregar(new Contacto("Rob Swire"), "655727431");

		c.borrar("Pepe Botika");
		
		c.imprimirAgenda();

		c.modificarNombre("Rob Swire", "Serj Tankien");
		
		c.modificarTlf("Serj Tankien", "122727421");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		c.imprimirAgenda();
		
		System.out.println(c.findByNombreV2("Roberto Iniesta"));//este devuelve list

		


	}

}
