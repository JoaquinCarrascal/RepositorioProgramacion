package tipoExamen;

public class Impresion {

	public static void imprimirInformacionGeneral(GestionHabitaciones gh1) {
		System.out.println("Éstas son todas las habitaciones.");
		for (int i = 0; i < gh1.getIndexListado(); i++) {
			System.out.println(gh1.getListado()[i]);
		}
		System.out.println("Éstas son las habitaciones ocupadas.");
		for (int i = 0; i < gh1.getIndexListado(); i++) {
			if(gh1.getListado()[i].isOcupada())
				System.out.println(gh1.getListado()[i]);
		}
		System.out.printf("\nÉste es el total generado: %.2f\n",gh1.calcularRecaudacionTot());
	}
	
	public static void imprimirHabNoOcupadas(GestionHabitaciones gh1) {
		System.out.println("Éstas son todas las habitaciones no ocupadas.");
		for (int i = 0; i < gh1.getIndexListado(); i++) {
			if(!gh1.getListado()[i].isOcupada())
				System.out.println(gh1.getListado()[i]);
		}
	}
}
