package ejemploPolimorfismo;

public class OperacionesFiguras {
	
	public double calcularAreaFigura(Figura f) {
		return f.calcularArea();
	}
	
	public double calcularListaCompleta(Figura[]listado) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado += calcularAreaFigura(listado[i]);
		}
		return resultado;
	}
	
	public double calcularConAviso(Figura [] listado) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado += calcularAreaFigura(listado[i]);
			if(listado[i] instanceof Circulo)
				((Circulo)listado[i]).mostrarRadianes();
		}
		return resultado;
		
	}
	
}
