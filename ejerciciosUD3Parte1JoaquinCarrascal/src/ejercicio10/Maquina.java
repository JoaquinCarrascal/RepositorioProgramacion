package ejercicio10;

public class Maquina 
{

	public double calcPrecioBilletes(int numPersonas,double precBillete) {
		return numPersonas * precBillete;
	}
	
	public double calcularVuelta(double dinClient, double precBilltot) {
		return dinClient - precBilltot;
	}
}
