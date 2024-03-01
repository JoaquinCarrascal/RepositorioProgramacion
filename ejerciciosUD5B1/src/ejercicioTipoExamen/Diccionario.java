package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List <Palabra> listado;

	public Diccionario(List<Palabra> listado) {
		this.listado = listado;
	}

	public List<Palabra> getListado() {
		return listado;
	}

	public void setListado(List<Palabra> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Diccionario [listado=" + listado + "]";
	}
	
	public void agregarPalabra(Palabra p) {
		listado.add(p);
	}
	
	public void imprimirDiccionario() {
		Iterator <Palabra> it = listado.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Palabra buscarPorNombre(String nombre) {
		for (Palabra palabra : listado) {
			if(palabra.getNombre().equalsIgnoreCase(nombre))
				return palabra;
		} 
		return null;
	}
	
	public void imprimirDescripcion(Palabra p) {
		System.out.println(p.getDescripcion());
	}
	
	public void modificarDescripcion(String nombre,String s) {
		buscarPorNombre(nombre).setDescripcion(s);
	}
	
	public void borrarPalabra(String nombre) {
		listado.remove(buscarPorNombre(nombre));
	}
	
	public List <Palabra> listadoPalabra(String nombre){
		List <Palabra> lista2 = new ArrayList<>();
		for (Palabra palabra : listado) {
			if(palabra.getNombre().equalsIgnoreCase(nombre))
				lista2.add(palabra);
		}
		return lista2;
	}
	
}
