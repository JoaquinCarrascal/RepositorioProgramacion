package ejercicioExamen;

public class Impresion {

	public static void imprimirListaParking(Parking p) {
		for (int i = 0; i < p.getIndexLista(); i++) {
			if(p.getLista()[i] instanceof Furgoneta) {
				if(((Furgoneta)p.getLista()[i]).avisoTrigger())
					System.out.print("¡AVISO! Zona especial ");
			}
			System.out.println(p.getLista()[i]);
		}
	}
	
}
