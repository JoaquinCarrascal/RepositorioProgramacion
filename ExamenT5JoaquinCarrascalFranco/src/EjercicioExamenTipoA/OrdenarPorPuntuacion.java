package EjercicioExamenTipoA;

import java.util.Comparator;

public class OrdenarPorPuntuacion implements Comparator <Carta>{

	@Override
	public int compare(Carta o1, Carta o2) {
		if(o1.valorCarta()<o2.valorCarta())
			return 1;
		if(o1.valorCarta()>o2.valorCarta())
			return -1;
		else
			return 0;
	}

	
	
}
