package ejercicio2;
/**
 * @author carrascal.frjoa24_tr
 */
public class Hotel {

	private Habitacion lista[];
	private int contadorOcup;
	private String nombreHot;

	public Hotel(Habitacion[] lista, String nombreHot) {
		this.lista = lista;
		this.nombreHot = nombreHot;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	public int getContadorOcup() {
		return contadorOcup;
	}

	public void setContadorOcup(int contadorOcup) {
		this.contadorOcup = contadorOcup;
	}

	public String getNombreHot() {
		return nombreHot;
	}

	public void setNombreHot(String nombreHot) {
		this.nombreHot = nombreHot;
	}

	public void agregarHabitacion(Habitacion h1) {
		if (contadorOcup < lista.length) {
			lista[contadorOcup] = h1;
			h1.setiD(contadorOcup);
			contadorOcup++;

		}
	}

	public boolean comprobarOcupacion(int iD) {
		return lista[findById(iD)].isAlquilada();
	}

	public int findById(int iD) {
		int i = 0;
		boolean encontrado = false;
		while (!encontrado && i < contadorOcup) {
			if (iD == lista[i].getiD())
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	public double calcularPrecHab(int iD, int numDias, boolean extras) {
		double porcentExtras = 15, precioFin;
		int cien = 100, varcero = 0;
		if (iD<=contadorOcup) {
			precioFin = lista[findById(iD)].getPrecio() * numDias;
			if (extras)
				return precioFin+(precioFin * porcentExtras / cien);
			else
				return precioFin;
		} else
			return varcero;
	}
	
	public void mostrarListaSinAlquilar() {
		for (int i = 0; i < contadorOcup; i++) {
			if(!lista[i].isAlquilada())
			System.out.println(lista[i]);
		}
	}

	public void alquilarHab(int iD,String nombreCliente,boolean extras,int numDias) {
		lista[iD].setAlquilada(true);
		lista[iD].setClienteAsig(nombreCliente);
		lista[iD].setExtra(extras);
		lista[iD].setDiasAlq(numDias);
	}
}
