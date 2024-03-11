package ejemploFechas;

import java.time.LocalDate;

public class Ppal {

	public static void main(String[] args) {
		
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fecha1 = LocalDate.of(2002, 4, 23);
		LocalDate cadena = LocalDate.parse("2002-04-23");
		
		
		System.out.println(fechaHoy);
		System.out.println(fecha1);
		System.out.println(cadena);
		
	}
	
}
