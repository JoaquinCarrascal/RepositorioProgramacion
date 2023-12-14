package ejemplo1;

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
	
}
