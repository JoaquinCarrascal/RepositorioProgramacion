package trabajo_investigacion;

import java.util.List;

public class CRUDPersona {

	private List <Persona> listado;

	public CRUDPersona(List<Persona> listado) {
		this.listado = listado;
	}

	public List<Persona> getListado() {
		return listado;
	}

	public void setListado(List<Persona> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDPersona [listado=" + listado + "]";
	}
	
	public void mostrarLista(){
		for(var objeto : listado) {
			System.out.println(objeto);//en este caso el compilador infiere en el tipo de la lista
		}								//cuando he creado el atributo lista de esta clase he designado
	}									//que lo que iba a guardar eran personas, por consiguiente
										//el programa recibe el tipo de ahí y nos deja usar el for each
	
}
