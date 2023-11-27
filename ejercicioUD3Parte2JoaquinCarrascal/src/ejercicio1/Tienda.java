package ejercicio1;

public class Tienda {

	private Producto [] lista;
	private int nPs;
	
	public Tienda(Producto[] lista, int nPs) {
		this.lista = lista;
		this.nPs = nPs;
	}
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public int getnPs() {
		return nPs;
	}

	public void setnPs(int nPs) {
		this.nPs = nPs;
	}

	public void agregarProductos(Producto p) {
		lista[nPs] = p;
		nPs++;
	}
	
	public void mostrarDatosLista() {
		int contador = 1;
		for (int i = 0; i < nPs; i++) {
			System.out.println("Producto "+contador+" "+lista[i].toString());
			contador++;
		}
	}
	
	public boolean comprobarFragilidad(int posicionProducto) {
		if(lista[posicionProducto].isFragilidad())
		return true;
		else
		return false;
	}
	
	
}
