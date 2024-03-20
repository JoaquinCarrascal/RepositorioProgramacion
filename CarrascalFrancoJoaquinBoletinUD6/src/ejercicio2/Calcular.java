package ejercicio2;

public class Calcular {

	public double calcularGradosFahrenheit(double temp, double tope) throws AbsoluteCeroException {
		
		if(temp < tope) {
			
			throw new AbsoluteCeroException();
			
		}else {
			
			return (temp * 9 / 5) + 32;
			
		}
		
	}
	
}
