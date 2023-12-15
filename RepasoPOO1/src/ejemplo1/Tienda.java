package ejemplo1;

import java.util.Iterator;

public class Tienda {

	private Producto [] lista;
	private int numProd;
	private int numTrabajadores;
	
	public Tienda(Producto[] lista, int numTrabajadores) {
		this.lista = lista;
		this.numTrabajadores = numTrabajadores;
	}
	public Producto[] getLista() {
		return lista;
	}
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	public int getNumProd() {
		return numProd;
	}
	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}
	public int getNumTrabajadores() {
		return numTrabajadores;
	}
	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	
	//el nombre del metodo va escrito como las variables y en infinitivo
	public void agregarProd(Producto p) {
		if(numProd<lista.length) {
			lista[numProd++] = p;
		}
	}
	
	public void mostrarLista() {
		for (int i = 0; i < numProd; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public Producto[] findBySection(int section) {
		Producto [] listadoNuevo = new Producto[numProd];
		int i=0;
		
		while(i < numProd) {
			if(lista[i].getSeccion() == section) {
				listadoNuevo[i] = lista[i];
			}
			i++;
		}
		
	return listadoNuevo;
	}
	
	public Producto findById() {
		
	}
	
	public void mostrarLista(Producto [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
			System.out.println(lista[i]);
		}
	}
	//porcen
	public double calcularPVP(int iD,double porcentGanan) {
		
	}
	/*public Producto buscarElMenorPrecio() {
		Producto menor;
		menor = lista[0];
		for (int i = 0; i < numProd; i++) {
			if()
		}
	}*/
	
}
