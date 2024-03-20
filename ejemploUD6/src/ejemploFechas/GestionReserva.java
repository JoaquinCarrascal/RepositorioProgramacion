package ejemploFechas;

import java.time.LocalDate;

public class GestionReserva {

	public boolean agregarReserva(LocalDate d) throws FechaInalcanzable{
		
		if(d.isBefore(LocalDate.now())) {
			
			throw new FechaInalcanzable();
			
		}else {
			
			return true;
			
		}
		
	}
	
}
