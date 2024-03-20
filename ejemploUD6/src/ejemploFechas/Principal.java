package ejemploFechas;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		GestionReserva gr = new GestionReserva();
		LocalDate diaReserva;
		
		try {
			
			diaReserva = LocalDate.parse("2024-03");
			
			if(gr.agregarReserva(diaReserva)) {
				
				System.out.println("Reserva realizada con éxito");
				
			}
			
		} catch (FechaInalcanzable f) {

			System.out.println("No se puede reservar para antes de hoy.");
			
		} catch (RuntimeException r) {
			
			System.out.println("Introduce una fecha válida.");
			
		} catch (Exception e) {

			System.out.println("Error inesperado.");
			
		}
		
	}

}
