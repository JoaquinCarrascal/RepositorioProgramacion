package ejemploListObjeto;

import java.util.List;

public class Impresion {

	public static void imprimirLista(List <Figura> listado) {
		
		for (Figura f : listado) {
			System.out.println(f);
		}
		
	}
	
}
