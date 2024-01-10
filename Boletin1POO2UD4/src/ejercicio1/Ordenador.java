package ejercicio1;

public class Ordenador {

	private double capacidadHDD;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;
	
	public Ordenador(double capacidadHDD, double frecuenciaProcesador, double precioBase, String marca) {
		this.capacidadHDD = capacidadHDD;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public double getCapacidadHDD() {
		return capacidadHDD;
	}

	public void setCapacidadHDD(double capacidadHDD) {
		this.capacidadHDD = capacidadHDD;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadHDD=" + capacidadHDD + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPVP (double porcentGanan) {
		int cien = 100;
		return precioBase + precioBase * porcentGanan/cien;
	}
	
}
