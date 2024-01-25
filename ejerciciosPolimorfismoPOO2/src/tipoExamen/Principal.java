package tipoExamen;

public class Principal {

	public static void main(String[] args) {
		
		int tam = 10;
		
		Habitacion [] lista = new Habitacion[tam];
		
		GestionHabitaciones gh1 = new GestionHabitaciones(lista);
		
		Habitacion h1 = new Habitacion(23, 117, true, "Reshala", 10,5);
		Habitacion h2 = new Habitacion(83, false, 18);
		Habitacion h3 = new Suite(81, 240, true, "Glukhar", 7,5, 45, 150, 10.2);
		Habitacion h4 = new Suite(210, false, 53/**/, 35, 80, 15.2);
		Habitacion h5 = new Apartamento(22, 120, true, "Knight", 2,3, 100);
		Habitacion h6 = new Apartamento(50, false, 1, 5);
		
		gh1.agregarHab(h1);
		gh1.agregarHab(h2);
		gh1.agregarHab(h3);
		gh1.agregarHab(h4);
		gh1.agregarHab(h5);
		gh1.agregarHab(h6);
		
		System.out.println(gh1.calcularConcreto(22));
		System.out.println(gh1.calcularRecaudacionTot());
		Impresion.imprimirInformacionGeneral(gh1);
		Impresion.imprimirHabNoOcupadas(gh1);
	}
	
}
