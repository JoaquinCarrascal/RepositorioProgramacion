package ejercicio1B;

public class Caja {

	private double totalRecaudado;

	public Caja(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	public double getTotalRecaudado() {
		return totalRecaudado;
	}

	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

	@Override
	public String toString() {
		return "Caja [totalRecaudado=" + totalRecaudado + "]";
	}
	
	public boolean iniciarSesion(String codTrabajador) throws codTrabajadorException{
		
		String regex = "[A-Z][0-9]{4}";

		if(codTrabajador.matches(regex)){
			
			return true;
			
		}else {
			
			throw new codTrabajadorException();
			
		}
		
	}
	
	public boolean hacerCaja(double caja) throws varianzaRecuentoMonetarioException{
		
		if(this.totalRecaudado == caja)
			return true;
		else
			throw new varianzaRecuentoMonetarioException();
		
	}
	
	public boolean comprobarOperaciones(int numOperaciones) throws operacionesNegativasException {
		
		if(numOperaciones < 0)
			throw new operacionesNegativasException();
		else
			return true;
		
	}
	
	
	
	
	
}
