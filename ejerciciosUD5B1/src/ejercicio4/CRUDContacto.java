package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CRUDContacto {
	
	private Map <Contacto, String> agenda;
	
	public CRUDContacto(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	public Map<Contacto, String> getAgenda() {
		return agenda;
	}


	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "CrudContacto [agenda=" + agenda + "]";
	}
	
	public void agregar(Contacto c, String tlf) {
		agenda.put(c, tlf);
	}
	


	public Contacto findByNombre (String nombre) {	
		for (Contacto contacto : agenda.keySet()) {
			if(contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}

	public List <Contacto> findByNombreV2 (String nombre) {
		List <Contacto> listadoAux = new ArrayList<>();
		for (Contacto contacto : agenda.keySet()) {
			if(contacto.getNombre().equals(nombre)) {
				listadoAux.add(contacto);
			}
		}
		return listadoAux;
	}
	
	public void borrar(String nombre) {
		if(findByNombre(nombre)!=null) {
			agenda.remove(findByNombre(nombre));
		}
	}
	
	public void modificarNombre(String nombre, String nuevoNombre) {
		if(agenda.containsKey(findByNombre(nombre))) {
		findByNombre(nombre).setNombre(nuevoNombre);
		}
		/*else {
			TODO agregar si no esta en la lista
		}*/
	}
	
	public void modificarTlf(String nombre, String nuevoTlf) {
		agenda.replace(findByNombre(nombre), nuevoTlf);//el buscar por nombre busca la 
	}													//key que es el telefono en este ejemplo
	
	public void imprimirAgenda() {
		if(!agenda.isEmpty()) {
			System.out.println(agenda);
		}
	}
}