package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Set <String> listado = new HashSet <>();
		Set <Persona> listaP = new HashSet <>();
		CRUDPersona cdp1 = new CRUDPersona(listaP);
		
		Persona p1 = new Persona("Joaquin","45886467E",21);
		Persona p2 = new Persona("Paco","45886467O",27);
		Persona p3 = new Persona("Roberto","45886467U",25);
		Persona p4 = new Persona("Alfonso","45886467R",26);
		
		listaP.add(p1);
		listaP.add(p2);
		listaP.add(p3);
		listaP.add(p4);
		
		listado.add("¿Qué llevas en el maletín?");
		listado.add("test01");
		listado.add("test01");
		listado.add("test02");
		
		System.out.println(listado);
		
		listado.remove("test01");

		System.out.println(listado);
		
		System.out.println(listado.contains("test02"));
		
		System.out.println(listaP);
		
		System.out.println(cdp1.buscarMasViejo());

	}

}
