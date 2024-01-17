package ejercicio4;

public class Alimentacion extends Producto {

	private boolean caducidadProx;
	private double desCaducidad;

	public Alimentacion(double precioUnit, String nombre, String codIdentificacion, boolean caducidadProx,
			double desCaducidad) {
		super(precioUnit, nombre, codIdentificacion);
		this.caducidadProx = caducidadProx;
		this.desCaducidad = desCaducidad;
	}

	public boolean isCaducidadProx() {
		return caducidadProx;
	}

	public void setCaducidadProx(boolean caducidadProx) {
		this.caducidadProx = caducidadProx;
	}
	
	public double getDesCaducidad() {
		return desCaducidad;
	}

	public void setDesCaducidad(double desCaducidad) {
		this.desCaducidad = desCaducidad;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Alimentacion [caducidadProx=" + caducidadProx + ", desCaducidad=" + desCaducidad + "]";
	}

	public boolean checkCaducidad() {
		if(caducidadProx)
			return true;
		else
			return false;
	};

	@Override
	public double calcularPVP() {
		double precFinal = super.getPrecioUnit();
		int cien = 100;
		if(checkCaducidad()) {
			return precFinal - (precFinal*desCaducidad/cien);
		}
		else
			return precFinal;
	}
	
	
	
}
