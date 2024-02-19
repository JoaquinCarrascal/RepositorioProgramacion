package ejercicio4;

import java.util.Map;
import java.util.Set;

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
		Set <Contacto> claves = agenda.keySet();
		for (Contacto contacto : claves ) {
			if(contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}

	 
	
	public void borrar(String nombre) {
		if(findByNombre(nombre)!=null) {
			agenda.remove(findByNombre(nombre));
		}
	}
	
	public void modificarNombre(String nombre, String nuevoNombre) {
		findByNombre(nombre).setNombre(nuevoNombre);
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