package ejemploabstracto;

public class Principal {

	public static void main(String[] args) 
	{
		
		// Figura fig = new Figura(2,3); no se pueden instanciar objetos abstractos.
		Figura/*<-- tipo de la clase*/ cd1 = new Cuadrado(1,2,2);
		Cuadrado cd2 = new Cuadrado(2,3,1);
		Rectangulo rc1 = new Rectangulo(2,3,1,2);
		
		System.out.println(cd1.calcularArea());
		
	}

}
