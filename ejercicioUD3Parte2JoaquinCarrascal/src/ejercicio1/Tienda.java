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
		int contador = 0;
		boolean encontrado = false;
		while(!encontrado && contador < lista.length) {
			if(lista[contador] == null) {
				encontrado = true;
				lista[contador] = p;
				nPs++;
			}
			else
				contador++;
		}
	}
	public double calcularPVP(double porcentGanan,int posi) {
		int cien = 100;
		return lista[posi].getPrecioCoste() + (lista[posi].getPrecioCoste()*porcentGanan/cien);
	}
	public double calcularCosteTotal() {
		double sumatorio = 0;
		for (int i = 0; i < nPs; i++) {
			sumatorio+=lista[i].getPrecioBase();
		}
		return sumatorio;
	}
	
	public void mostrarDatosLista() {
		int contador = 1;
		for (int i = 0; i < nPs; i++) {
			if(lista[i] != null) {
			System.out.println("Producto "+contador+" "+lista[i].toString());
			contador++;
			}
		}
	}
	
	public boolean comprobarFragilidad(String nombreProd) {
		return lista[findByName(nombreProd)].isFragilidad();
	}
	public int findByName(String nombreProd) {
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado) {
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
	public double calcularGananciasTotales(double porcentTrans, double porcentGanan){
		double pvp = 0;
		int cero = 0;
		for (int i = 0; i < nPs; i++) {
			if(lista[i].getPrecioCoste()==cero) {
				lista[i].setPrecioCoste(lista[i].calcularPrecioCoste(porcentTrans));
			}
			pvp += calcularPVP(porcentGanan, i);
		}
		return pvp - calcularCosteTotal();
	}
	
	
}
