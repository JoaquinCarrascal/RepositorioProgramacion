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
	
	public Producto findById(int iD) {
		boolean encontrado = false;
		int i = 0;
		while(i < numProd && !encontrado) {
			if(lista[i].getiD()==iD)
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return lista[i];
		else
			return null;
	}
	
	public int findById2(int iD) {
		boolean encontrado = false;
		int i = 0;
		while(i < numProd && !encontrado) {
			if(lista[i].getiD()==iD)
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1;
	}
	
	public void mostrarLista(Producto [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
			System.out.println(lista[i]);
		}
	}
	
	public double calcularPVP(int iD,double porcentGanan) {
		double pVP = findById(iD).getPrecFabr()+findById(iD).getPrecFabr()*porcentGanan/100;
		lista[findById2(iD)].setpVP(pVP);
		return pVP;
	}
	
	public void cambiarPrecFabSeccion(int seccion,double nuevoPrec) {
		for (int i = 0; i < numProd; i++) {
			if(lista[i].getSeccion()== seccion)
				lista[i].setPrecFabr(nuevoPrec);
		}
	}
	
	public double calcularDescuento(double porCent,int iD,double descuento) {
		double calculo = calcularPVP(iD, porCent);
		return calculo - calculo * descuento/100;
	}
	
	public int cambiarEnVentaSeccion(int seccion) {
		int contador = 0;
		for (int i = 0; i < numProd; i++) {
			if(lista[i].getSeccion()== seccion) {
				lista[i].setEnVenta(false);
				contador++;
			}
		}
		return contador;
	}
	
	public void mostrarListaActiva() {
		for (int i = 0; i < numProd; i++) {
			if(lista[i] != null && lista[i].isEnVenta())
			System.out.println(lista[i]);
		}
	}
	
	
	/*public Producto buscarElMenorPrecio() {
		Producto menor;
		menor = lista[0];
		for (int i = 0; i < numProd; i++) {
			if()
		}
	}*/
	
}
