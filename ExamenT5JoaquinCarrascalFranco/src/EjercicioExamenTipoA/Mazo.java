package EjercicioExamenTipoA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mazo {

	private List <Carta> listado;

	public Mazo(List<Carta> listado) {
		this.listado = listado;
	}

	public List<Carta> getListado() {
		return listado;
	}

	public void setListado(List<Carta> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Mazo [listado=" + listado + "]";
	}
	
	public void agregarCarta(Carta c) {
		listado.add(c);
	}
	
	public Carta buscarCartaConcreta(int numCarta, String palo) {
		for (Carta carta : listado) {
			if(carta.getNumCarta()==numCarta && carta.getPalo().equalsIgnoreCase(palo))
				return carta;
		}
		return null;
	}
	
	public List <Carta> buscarValorCero(){
		List <Carta> listAux = new ArrayList<>();
		Iterator <Carta> it = listado.iterator();
		int casoEntrada = 0;
		while(it.hasNext()) {
			Carta c = it.next();
			if(c.valorCarta()==casoEntrada)
				listAux.add(c);
		}
		return listAux;
	}
	
	public int calcularPuntTotal() {
		int aux = 0;
		for (Carta carta : listado) {
			aux += carta.valorCarta();
		}
		return aux;
	}
	
	public void modificarNombre(int numCarta, String palo,String nuevoNombre) {
		buscarCartaConcreta(numCarta, palo).setNombre(nuevoNombre);
	}
	
	public void mostrarMazo () {
		Iterator <Carta> it = listado.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	
	
	
}
