package ejemploarrayobjetos;

import java.util.Arrays;

public class Concesionario {

	private Vehiculo [] lista;
	private int nVs;
	
	public Concesionario(Vehiculo[] lista, int nVs) {
		this.lista = lista;
		this.nVs = nVs;
	}

	public Vehiculo[] getLista() {
		return lista;
	}

	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	public int getNumCoches() {
		return nVs;
	}

	public void setNumCoches(int numCoches) {
		this.nVs = numCoches;
	}

	@Override
	public String toString() {
		return "Concesionario [lista=" + Arrays.toString(lista) + ", nVs=" + nVs + "]";
	}

	public void agregar(Vehiculo v) {
		lista[nVs]=v;
		nVs++;
	}
	
	public void mostrar100cv(int topePotencia) {
		for (int i = 0; i < nVs; i++) {
			if(lista[i].getPotencia()>=topePotencia)
				System.out.println(lista[i].getModelo());
		}
	}
	
}
