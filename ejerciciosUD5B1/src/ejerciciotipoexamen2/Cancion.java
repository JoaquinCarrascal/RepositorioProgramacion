package ejerciciotipoexamen2;

import java.util.Objects;

public class Cancion implements Comparable <Cancion>{

	private String titulo;
	private String interprete;
	private int vecesEscuchada;
	private boolean gratis;
	private double duracion;
	
	public Cancion(String titulo, String interprete, int vecesEscuchada, boolean gratis, double duracion) {
		this.titulo = titulo;
		this.interprete = interprete;
		this.vecesEscuchada = vecesEscuchada;
		this.gratis = gratis;
		this.duracion = duracion;
	}
	
	public Cancion() {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public int getVecesEscuchada() {
		return vecesEscuchada;
	}

	public void setVecesEscuchada(int vecesEscuchada) {
		this.vecesEscuchada = vecesEscuchada;
	}

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", interprete=" + interprete + ", vecesEscuchada=" + vecesEscuchada
				+ ", gratis=" + gratis + ", duracion=" + duracion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, gratis, interprete, titulo, vecesEscuchada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion) && gratis == other.gratis
				&& Objects.equals(interprete, other.interprete) && Objects.equals(titulo, other.titulo)
				&& vecesEscuchada == other.vecesEscuchada;
	}

	@Override
	public int compareTo(Cancion o) {
		return this.interprete.compareToIgnoreCase(o.getInterprete());
	}
	
	
	
}
