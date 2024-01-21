package ejercicio5;

public class Oficina {

	private Empleado [] listado;
	private int indexListado;

	public Oficina(Empleado[] listado) {
		this.listado = listado;
	}

	public Empleado[] getListado() {
		return listado;
	}

	public void setListado(Empleado[] listado) {
		this.listado = listado;
	}
	
	public int getIndexListado() {
		return indexListado;
	}

	public void setIndexListado(int indexListado) {
		this.indexListado = indexListado;
	}

	public void agregarEmpleado(Empleado e) {
		if(indexListado<listado.length)
			listado[indexListado++] = e;
	}
	
	public double calcularSueldoEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double calcularCostesTotales() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			total += calcularSueldoEmpleado(listado[i]);
		}
		return total;
	}
	
}
