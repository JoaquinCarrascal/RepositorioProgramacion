package ejercicio6;

import java.util.Comparator;

public class OrdenarPorSueldo implements Comparator <Double>{

	@Override
	public int compare(Double sueldo1, Double sueldo2) {
		if(sueldo1 < sueldo2)
			return -1;
		if(sueldo1 > sueldo2)
			return 1;
		else
			return 0;
	}

	
	
}
