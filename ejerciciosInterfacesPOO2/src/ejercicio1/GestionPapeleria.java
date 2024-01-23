package ejercicio1;

public class GestionPapeleria implements ITriggerLibros{

	@Override
	public int contadorPrestados(Object[] o) {
		int contador = 0;
		for (int i = 0; i < o.length; i++) {
			if(o[i] instanceof Libro || o[i] instanceof Revista) {
				if(o[i] instanceof Libro) {
					if(((Libro)o[i]).isPrestado())
						contador++;
				}
				else {
					if(((Revista)o[i]).isPrestado())
						contador++;
				}
			}
		}
		return contador;
	}

	@Override
	public int publicacionesAnterioresA(Papeleria [] p, int anyo) {
		int contador = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i].getAnyoPublicacion() < anyo) {
				contador++;
			}
		}
		return contador;
	}
	
	
	
}
