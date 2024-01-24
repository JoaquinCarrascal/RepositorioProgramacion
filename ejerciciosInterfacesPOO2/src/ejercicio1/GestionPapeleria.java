package ejercicio1;

public class GestionPapeleria implements ITriggerLibros {

	@Override
	public int contadorPrestados(Papeleria[] p) {
		int contador = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
				if (p[i] instanceof Libro || p[i] instanceof Revista) {
					if (p[i] instanceof Libro) {
						if (((Libro) p[i]).isPrestado())
							contador++;
					} else {
						if (((Revista) p[i]).isPrestado())
							contador++;
					}
				}
			}
		}
		return contador;
	}

	@Override
	public int publicacionesAnterioresA(Papeleria[] p, int anyo) {
		int contador = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
				if (p[i].getAnyoPublicacion() < anyo) {
					contador++;
				}
			}
		}
		return contador;
	}

}
