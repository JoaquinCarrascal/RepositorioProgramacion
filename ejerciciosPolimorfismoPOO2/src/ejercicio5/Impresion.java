package ejercicio5;

public class Impresion {

	public static void imprimirLista(Oficina of1){
		for (int i = 0; i < of1.getIndexListado(); i++) {
			if(of1.getListado()[i] instanceof Vendedor) {
				if(((Vendedor)of1.getListado()[i]).triggerVentas())
					System.out.print("¡Enhorabuena, has superado el tope de ventas estimadas!");
			}
			System.out.print(of1.getListado()[i]);		
			System.out.println();
		}
	}
	
}
