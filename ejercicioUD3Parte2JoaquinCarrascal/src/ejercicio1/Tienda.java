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
	
	public boolean comprobarFragilidad(String nombreProd) {
		if(lista[findByName(nombreProd)].isFragilidad())
			return true;
		else
			return false;
	}
	public int findByName(String nombreProd) {
		int i = 0;
		boolean encontrado = false;
		while(i < nPs && !encontrado) {
			if(lista[i].getNombre().equalsIgnoreCase(nombreProd))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1;
	}
	
	
}
