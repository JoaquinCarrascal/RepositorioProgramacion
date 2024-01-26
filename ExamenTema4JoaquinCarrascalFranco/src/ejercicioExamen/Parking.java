package ejercicioExamen;

public class Parking {

	private VehiculoGenerico[] lista;
	private int indexLista;
	private String direccion;

	public Parking(VehiculoGenerico[] lista, String direccion) {
		this.lista = lista;
		this.direccion = direccion;
	}

	public VehiculoGenerico[] getLista() {
		return lista;
	}

	public void setLista(VehiculoGenerico[] lista) {
		this.lista = lista;
	}

	public int getIndexLista() {
		return indexLista;
	}

	public void setIndexLista(int indexLista) {
		this.indexLista = indexLista;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarVehiculo(VehiculoGenerico v) {
		if (indexLista < lista.length) {
			lista[indexLista++] = v;
		}
	}

	public double calcularGenerico(VehiculoGenerico v, double cantFija, double plusLongitud) {
		return v.calcularPrecio(cantFija, plusLongitud);
	}

	public VehiculoGenerico findByMatricula(String matricula) {
		boolean encontrado = false;
		int contador = 0;
		while (!encontrado && indexLista > contador) {
			if (lista[contador].getMatricula().equalsIgnoreCase(matricula)) {
				encontrado = true;
			} else
				contador++;
		}
		if (encontrado) {
			return lista[contador];
		} else
			return null;
	}

	public double calcularPrecioConcreto(String matricula, double cantFija, double plusLongitud) {
		return calcularGenerico(findByMatricula(matricula), cantFija, plusLongitud);
	}

	public double recaudadoEnMotos(double cantFija, double plusLongitud) {
		double total = 0;
		for (int i = 0; i < indexLista; i++) {
			if (lista[i] instanceof Moto)
				total += calcularGenerico(lista[i], cantFija, plusLongitud);
		}
		return total;
	}

	public double calcularEnNavidad(String matricula, double cantFija, double plusLongitud, double plusNavidenyo) {
		return calcularPrecioConcreto(matricula, cantFija, plusLongitud) + plusNavidenyo;
	}

	public boolean estaEnLista(String matricula) {
		if (findByMatricula(matricula) == null)
			return false;
		else
			return true;
	}

}
