package ejercicioTipoExamen;

import java.util.Comparator;

public class OrdenarInverso implements Comparator <Palabra>{

	@Override
	public int compare(Palabra o1, Palabra o2) {
		return -o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

	
	
}
