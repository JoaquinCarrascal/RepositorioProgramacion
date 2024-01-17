package ejercicio4;

public class Impresion {

	public static void imprimirTicket(Venta v1) {
		
		for (int i = 0; i < v1.getIndexListado(); i++) {
			System.out.println(v1.getListadoLinea()[i].imprimirLinea()); 
			//este llama a un toString diferente para que no salgan los atributos de los productos
		}
		System.out.printf("La cuantía total es: %.2f€.",v1.getPrecioTotal());
		
	}
	
	public static void imprimirLista(Venta v1) {
		for (int i = 0; i < v1.getIndexListado(); i++) {
			
			System.out.print("\n"+v1.getListadoLinea()[i].getProd());
			if(v1.getListadoLinea()[i].getProd() instanceof Alimentacion) {
				if(((Alimentacion)v1.getListadoLinea()[i].getProd()).checkCaducidad())
					System.out.println(" Fecha de caducidad próxima.");
			}
			else
				System.out.println(" ");
		}
	}
	
}
