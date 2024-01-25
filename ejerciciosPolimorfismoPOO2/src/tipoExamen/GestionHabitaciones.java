package tipoExamen;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion [] listado;
	private int indexListado;
	
	public GestionHabitaciones(Habitacion[] listado) {
		this.listado = listado;
	}
	public Habitacion[] getListado() {
		return listado;
	}
	public void setListado(Habitacion[] listado) {
		this.listado = listado;
	}
	public int getIndexListado() {
		return indexListado;
	}
	public void setIndexListado(int indexListado) {
		this.indexListado = indexListado;
	}
	@Override
	public String toString() {
		return "GestionHabitaciones [listado=" + Arrays.toString(listado) + ", indexListado=" + indexListado + "]";
	}
	
	public void agregarHab(Habitacion h) {
		if(indexListado < listado.length)
			listado[indexListado++] = h;
	}
	
	public double calcularPrecioGeneral(Habitacion h) {
		return h.calcularPrecioHab();
	}
	
	public Habitacion findByNum(int numHab) {
		boolean encontrado = false;
		int contador = 0;
		while(!encontrado && indexListado > contador) {
			if(listado[contador].getNumHabitacion() == numHab) {
				encontrado = true;
			}
			else
				contador ++;
		}
		if(encontrado)
			return listado[contador];
		else
			return null;
	}
	
	public double calcularConcreto(int numHab) {
		return calcularPrecioGeneral(findByNum(numHab));
	}
	
	public double calcularRecaudacionTot() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			if(listado[i].isOcupada())
				total += calcularPrecioGeneral(listado[i]);
		}
		return total;
	}
	
}
