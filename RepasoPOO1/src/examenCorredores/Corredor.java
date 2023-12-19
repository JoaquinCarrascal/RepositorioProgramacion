package examenCorredores;
/*
 	nombre, apellidos, dorsal (número de 
	corredor), categoría (un entero para tres posibilidades que son juvenil, senior o veterano) y el tiempo que ha tardado en acabar la carrera 
	medido en minutos (para no complicar los cálculos tendrá decimales pero no hace falta pasarlo a segundos ni nada de eso, un número 
	de minutos con decimales, por ejemplo, el tiempo de un corredor puede ser 20.8 minutos).
 */
public class Corredor {

	private String nombreApellidos;
	private int dorsal;
	private int categoria;//1 juvenil, 2 senior, 3 veterano
	private double tiempoEnMinutos;
	
	
	
	public Corredor(String nombreApellidos, int dorsal, int categoria, double tiempoEnMinutos) {
		this.nombreApellidos = nombreApellidos;
		this.dorsal = dorsal;
		this.categoria = categoria;
		this.tiempoEnMinutos = tiempoEnMinutos;
	}
	
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public double getTiempoEnMinutos() {
		return tiempoEnMinutos;
	}
	public void setTiempoEnMinutos(double tiempoEnMinutos) {
		this.tiempoEnMinutos = tiempoEnMinutos;
	}
	@Override
	public String toString() {
		return "Corredor [nombreApellidos=" + nombreApellidos + ", dorsal=" + dorsal + ", categoria=" + categoria
				+ ", tiempoEnMinutos=" + tiempoEnMinutos + "]";
	}
	
	
	
}
