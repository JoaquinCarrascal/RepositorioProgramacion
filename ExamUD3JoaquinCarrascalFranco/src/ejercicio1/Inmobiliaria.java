package ejercicio1;

import java.util.Arrays;

public class Inmobiliaria {

	private Piso[] p;
	private int numVendedores;
	private int numPisos;

	public Inmobiliaria(Piso[] p) {
		this.p = p;
	}

	public Piso[] getP() {
		return p;
	}

	public void setP(Piso[] p) {
		this.p = p;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	@Override
	public String toString() {
		return "Inmobiliaria [p=" + Arrays.toString(p) + ", numVendedores=" + numVendedores + ", numPisos=" + numPisos
				+ "]";
	}

	public void agregarPiso(Piso p1) {
		if (numPisos < p.length) {
			p[numPisos] = p1;
			p1.setDireccion(numPisos);
			numPisos++;
		}
	}

	public double calcularPrecioFinalVenta(double porcentGanan, int numPiso) {
		double precFin = p[numPiso].getPrecioVenta() + (p[numPiso].getPrecioVenta() * porcentGanan / 100);
		p[numPiso].setpVP(precFin);
		return precFin;
	}

	public int findByNumPiso(int numPiso) {
		int i = 0;
		boolean encontrado = false;

		while (!encontrado && numPisos < p.length) {
			if (p[i].getDireccion() == numPiso)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	public void mostrarPisosNuevos() {
		int varUno = 1;
		for (int i = 0; i < numPisos; i++) {
			if (p[i].getEstado() == varUno)
				System.out.println(p[i]);
		}
	}

	public boolean cambiarPrecioPiso(int numPiso, double precNuevo) {
		if (numPiso < numPisos) {
			p[numPiso].setPrecioVenta(precNuevo);
			return true;
		} else
			return false;
	}

	public double calcularPrecioM2(int numPiso) {
		return p[numPiso].getpVP() / p[numPiso].getM2();
	}

	public double ventaTotalSeminuevos(double porcentGanan) {
		double sumatorio = 0;
		for (int i = 0; i < numPisos; i++) {
			if (p[i].getEstado() == 2 && p[i].getpVP() == 0) {
				// se que ésta no es la mejor forma de hacerlo pero no da tiempo a todo ):
				calcularPrecioFinalVenta(porcentGanan, i);
			}
		}

		for (int i = 0; i < numPisos; i++) {
			if (p[i].getEstado() == 2)
				sumatorio += p[i].getpVP();
		}
		return sumatorio;
	}

	public double calcularGananxVendedor(double porcenGanan) {
		double sumatorio = 0;
		int cien = 100;
		for (int i = 0; i < numPisos; i++) {
			sumatorio += p[i].getPrecioVenta() + (p[i].getPrecioVenta() * porcenGanan / cien);
		}
		return sumatorio / numVendedores;
	}

	public void listarTodos() {
		for (int i = 0; i < numPisos; i++) {
			System.out.println(p[i]);
		}
	}
}
