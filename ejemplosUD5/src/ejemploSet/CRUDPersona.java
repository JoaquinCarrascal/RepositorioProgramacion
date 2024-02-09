package ejemploSet;

import java.util.Iterator;
import java.util.Set;

public class CRUDPersona {

	private Set <Persona> listaP;

	public CRUDPersona(Set <Persona> listaP) {
		this.listaP = listaP;
	}

	public Set<Persona> getListaP() {
		return listaP;
	}

	public void setListaP(Set <Persona> listaP) {
		this.listaP = listaP;
	}
	
	public Persona buscarMasViejo() {
		Persona aux = null;
		int auxN = 0;
		for (Iterator<Persona> iterator = listaP.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if(persona.getEdad()>auxN) {
				aux = persona;
				auxN = persona.getEdad();
			}
		}
		return aux;
	}
	
	
	
}
