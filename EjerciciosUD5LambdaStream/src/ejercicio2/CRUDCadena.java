package ejercicio2;

import java.util.Set;

public class CRUDCadena {

	private Set <String> listado;

	public CRUDCadena(Set<String> listado) {
		this.listado = listado;
	}

	public Set<String> getListado() {
		return listado;
	}

	public void setListado(Set<String> listado) {
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
