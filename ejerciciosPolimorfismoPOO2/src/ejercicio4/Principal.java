package ejercicio4;

public class Principal {

	public static void main(String[] args) 
	{
		int tam = 100;
		LineaDeVenta [] linDeLista = new LineaDeVenta[tam];//instancio una lista de ve 
														//lineas de venta
		
		Venta venta1 = new Venta(linDeLista);//instancio una venta vacía
		
		Producto prod1 = new Alimentacion(5,"lechuga","A23",true,20.0);
		Producto prod2 = new Alimentacion(7.4,"Fuet","B21",false,12.0);//instancio articulos tipo producto
																		//que se comportan diferente
		Producto prod3 = new Electronica(50,"Monitor 24 pulgadas","C12",35);
		Producto prod4 = new Electronica(10,"Alfombrilla gaming","D62",12.4);
		 
		LineaDeVenta linDeVen1 = new LineaDeVenta(prod1, 1);
		LineaDeVenta linDeVen2 = new LineaDeVenta(prod2, 2);//creo las lineas de venta para los 
															//productos de ejemplo
		LineaDeVenta linDeVen3 = new LineaDeVenta(prod3, 2);
		LineaDeVenta linDeVen4 = new LineaDeVenta(prod4, 3);
		
		venta1.agregarALaLista(linDeVen1);
		venta1.agregarALaLista(linDeVen2);//agrego esas lineas a la lista
										//a partir de aqui operaremos
		venta1.agregarALaLista(linDeVen3);
		venta1.agregarALaLista(linDeVen4);
		
		System.out.println(venta1.calcularPrecTotal());//a partir de este se llaman entre si 3 metodos
		//este es el total de la venta				   //se setean los precios por línea y el precio 
													   //total de venta.
		
		Impresion.imprimirTicket(venta1);
		
		System.out.println(" ");
		
		Impresion.imprimirLista(venta1);//además muestra fecha de caducidad próxima
		
	}

}
