package ejercicio10;

public class Maquina 
{

	public double calcularPrecioFin(double precioUnit, int numPersonas) {
		return precioUnit * numPersonas;
	}
	public double calcularVuelta(double dineroIntr, double precioFin) {
		return precioFin - dineroIntr;
	}
	
	
}
