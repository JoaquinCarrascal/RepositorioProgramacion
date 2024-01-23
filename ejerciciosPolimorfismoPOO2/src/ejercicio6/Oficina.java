package ejercicio6;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] listado;
	private int indexListado;
	
	public Oficina(Cuenta[] listado) {
		this.listado = listado;
	}

	public Cuenta[] getListado() {
		return listado;
	}

	public void setListado(Cuenta[] listado) {
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
		return "Oficina [listado=" + Arrays.toString(listado) + ", indexListado=" + indexListado + "]";
	}
	
	public void agregarCuenta(Cuenta c) {
		if(indexListado<listado.length)
		listado[indexListado++] = c;
	}
	
	public double calcularDineroTotal() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			total += listado[i].getSaldo();
		}
		return total;
	}
	
	public double calcularGanancia() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			if(listado[i] instanceof CuentaEmpresa) {
				total += ((CuentaEmpresa)listado[i]).getSumatorioSustraido();
			}
		}
		return total;
	}
	
	public double calcularPerdidas() {
		double total = 0;
		for (int i = 0; i < indexListado; i++) {
			if(listado[i] instanceof CuentaJoven) {
				total += ((CuentaJoven)listado[i]).getSumatorioRegalo();
			}
		}
		return total;
	} 
	
	
	
}
