package crud;

import model.Producto;

public class CrudProducto 
{

	private Producto [] lista;
	
	public CrudProducto(Producto[]lista) {
		this.lista=lista;
	}

	public Producto[] getLista() {
		return lista;
	}
	
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	//Éste método agrega a la lista los objetos
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	public void editPrecio(String codigo,double PrecioN) {
		int index = findByIdV2(codigo);
		if(PrecioN>=0)
			lista[index].setPrecioUnitario(PrecioN);
	}
	
	//Este metodo busca en la lista
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while(i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))//equalsIgnoreCase sirve para comparar Strings sin distincion entre mayusculas y minusculas
				encontrado = true;//cambia a true y skipea el bucle por el !encontrado(!false)
			else
				i++;
		}
		
		if(encontrado)
			return lista[i];//Devolvemos el producto aqui
		else
			return null;
	}
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while(i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))//equalsIgnoreCase sirve para comparar Strings sin distincion entre mayusculas y minusculas
				encontrado = true;//cambia a true y skipea el bucle por el !encontrado(!false)
			else
				i++;
		}
		
		if(encontrado)
			return i;
		else
			return -1;
	}
	
}
