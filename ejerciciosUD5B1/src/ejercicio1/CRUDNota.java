package ejercicio1;

import java.util.List;

public class CRUDNota {

	private List <Nota> listado;

	public CRUDNota(List<Nota> listado) {
		this.listado = listado;
	}

	public List<Nota> getListado() {
		return listado;
	}

	public void setListado(List<Nota> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDNota [listado=" + listado + "]";
	}
	
	public void imprimirLista () {
	int i = 1;
		for (Nota n : listado) {
			System.out.println(i++ + " " + n);
		}
	}
	
	public void agregarALaLista(Nota n) {
		listado.add(n);
	}
	
	public void mostrarXIndice(int ind) {
		 System.out.println(listado.get(ind-1));
	}
	
	public void consultarCantidadNotas() {
		System.out.printf("En la lista hay %d notas.",listado.size());
	}
	
	public void borrarNota(int ind) {
		Nota n = new Nota();
		if(listado.contains(n))
			listado.remove(ind-1);
	}
	
}
