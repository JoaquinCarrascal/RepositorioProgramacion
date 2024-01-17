package ejercicio4;

public class Venta {

	private LineaDeVenta [] listadoLinea;
	private int indexListado;
	private double precioTotal;

	public Venta(LineaDeVenta[] listadoLinea) {
		this.listadoLinea = listadoLinea;
		this.indexListado = 0;
	}
	
	public LineaDeVenta[] getListadoLinea() {
		return listadoLinea;
	}

	public void setListadoLinea(LineaDeVenta[] listadoLinea) {
		this.listadoLinea = listadoLinea;
	}

	public int getIndexListado() {
		return indexListado;
	}

	public void setIndexListado(int indexListado) {
		this.indexListado = indexListado;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public void agregarALaLista(LineaDeVenta linDeVen1) {
		if(indexListado<listadoLinea.length) {
			listadoLinea[indexListado] = linDeVen1;
			indexListado++;
		}
	}
	
	public double calcularPrecTotal() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			total += listadoLinea[i].calcularSubtotal();
		}
		setPrecioTotal(total);
		return total;
	}
	
}
