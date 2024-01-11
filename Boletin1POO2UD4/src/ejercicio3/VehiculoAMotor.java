package ejercicio3;

public class VehiculoAMotor {

	 private int tipoEmision;//cero(0),eco(1),tipoB(2),tipoC(3)
	 private double caballos;
	 private int centimetrosCub;
	 
	public VehiculoAMotor(int tipoEmision, double caballos, int centimetrosCub) {
		this.tipoEmision = tipoEmision;
		this.caballos = caballos;
		this.centimetrosCub = centimetrosCub;
	}

	public int getTipoEmision() {
		return tipoEmision;
	}

	public void setTipoEmision(int tipoEmision) {
		this.tipoEmision = tipoEmision;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public int getCentimetrosCub() {
		return centimetrosCub;
	}

	public void setCentimetrosCub(int centimetrosCub) {
		this.centimetrosCub = centimetrosCub;
	}
	 
	 public double calculoImpuestoCirc() {
		 double rango1= 24,rango2 = 32, rango3=54,rango4=104;
		 if(tipoEmision==0)
			 return rango1;
		 if(tipoEmision==1)
			 return rango2;
		 if(tipoEmision==2)
			 return rango3;
		 else
			 return rango4;
	 }
	
}
