package ejerciciotipoexamen2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MiMusica {

	private Map <Integer,Cancion> listado;

	public MiMusica(Map<Integer, Cancion> listado) {
		this.listado = listado;
	}

	public Map<Integer, Cancion> getListado() {
		return listado;
	}

	public void setListado(Map<Integer, Cancion> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "MiMusica [listado=" + listado + "]";
	}
	
	public void agregar(int id,Cancion cancion) {
		listado.put(id, cancion);
	}
	
	public Map <Integer,Cancion> buscarGratis(){
		Map <Integer, Cancion> mapaux = new HashMap<>();
		Set <Integer> aux = listado.keySet();
		Iterator <Integer> it = aux.iterator();
		while(it.hasNext()) {
			int aux2 = it.next();
			if(listado.get(aux2).isGratis())
				mapaux.put(aux2, listado.get(aux2));
		}
		return mapaux;
	}
	
	public List <Cancion> buscarMasLarga() {
		List <Cancion> listadoDevuelto = new ArrayList<>();
		Collection <Cancion> listadoAux = listado.values();
		double mayor = 0;
		for (Cancion c : listadoAux) {
			if(c.getDuracion()>mayor) {
				mayor = c.getDuracion();
			}
		}
		for(Cancion c : listadoAux) 
			if(c.getDuracion() == mayor)
				listadoDevuelto.add(c);
		
		return listadoDevuelto;
	}
	
}
