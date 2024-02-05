package ejemploListObjeto;

import java.util.List;

public class CRUDFigura {
	
	private List <Figura> listado;

	public CRUDFigura(List<Figura> listado) {
		this.listado = listado;
	}

	public List<Figura> getListado() {
		return listado;
	}

	public void setListado(List<Figura> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDFigura [listado=" + listado + "]";
	}

	public Figura findById(String id) {
		boolean encontrado = false;
		int contador = 0;
		while(!encontrado && listado.size() > contador) {
			if(listado.get(contador).getId().equalsIgnoreCase(id)) {
				encontrado = true;
			}
			else
				contador++;
		}
		if(encontrado)
			return listado.get(contador);
		else
			return null;
	}
	
	public void agregar(Figura f) {//nunca pasando los atributos sueltos
		listado.add(f);				//tampoco imprimimos si se ha guardado correcto
	}
	
	
	
	

}
