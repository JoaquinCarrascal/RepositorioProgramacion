package ejercicio2;

import java.util.List;

public class CRUDCadena {

	private List <String> listado;
	
	public CRUDCadena(List<String> listado) {
		this.listado = listado;
	}

	public List<String> getListado() {
		return listado;
	}

	public void setListado(List<String> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDCadena [listado=" + listado + "]";
	}

	public void agregarCadena (String cadena) {
		listado.add(cadena);
	}
	
}
