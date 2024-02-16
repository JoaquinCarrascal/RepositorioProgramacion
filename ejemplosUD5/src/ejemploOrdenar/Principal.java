package ejemploOrdenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Corredor> listado = new ArrayList<>();
		
		listado.add(new Corredor(3, 1.43,"Jesse Owens"));
		listado.add(new Corredor(1, 1.11,"Angel Naranjo"));
		listado.add(new Corredor(4, 1.65,"Luis Miguel"));
		listado.add(new Corredor(6, 2.13,"Emil Zatopek"));
		listado.add(new Corredor(9, 1.13,"Carl Lewis"));
		
		for (Corredor corredor : listado) {
			System.out.println(corredor);
		}
		
		Collections.sort(listado);
		
		for (Corredor corredor : listado) {
			System.out.println(corredor);
		}

	}

}
