package ejercicio1;

public class GestionPapeleria implements ITriggerLibros{

	private Papeleria [] listado;
	private int indexListado;
	
	public GestionPapeleria(Papeleria[] listado) {
		this.listado = listado;
	}

	public Papeleria[] getListado() {
		return listado;
	}

	public void setListado(Papeleria[] listado) {
		this.listado = listado;
	}

	public int getIndexListado() {
		return indexListado;
	}

	public void setIndexListado(int indexListado) {
		this.indexListado = indexListado;
	}
	
	
	
	public void agregarProducto(Papeleria p) {
		if(indexListado < listado.length) {
			listado[indexListado++] = p;
		}
	}

	@Override
	public boolean contadorPrestados(Object[] o) {
		
		return false;
	}

	@Override
	public int publicacionesAnterioresA() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
