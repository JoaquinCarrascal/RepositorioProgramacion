package explicacionColecciones;

import java.util.ArrayList;
import java.util.List;

public class ejemploList {

	public static void main(String[] args) {

		List <String> listado = new ArrayList <String> ();
		listado.add("Joaquín");
		listado.add("Ángel");
		listado.add("Luis Miguel");
		System.out.println(listado);
		
		System.out.println(listado.contains("Joaquín"));
		
		listado.remove(2);
		System.out.println(listado);
		
		System.out.println(listado.size());
		
	}

}
