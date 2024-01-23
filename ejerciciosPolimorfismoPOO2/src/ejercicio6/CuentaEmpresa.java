package ejercicio6;

public class CuentaEmpresa extends Cuenta{
	
	private double cantidadSustraida;
	private double sumatorioSustraido;
	
	public CuentaEmpresa(double saldo, String nombreProp, String numCuenta, double cantidadSustraida) {
		super(saldo, nombreProp, numCuenta);
		this.cantidadSustraida = cantidadSustraida;
	}

	public double getCantidadSustraida() {
		return cantidadSustraida;
	}

	public void setCantidadSustraida(double cantidadSustraida) {
		this.cantidadSustraida = cantidadSustraida;
	}

	public double getSumatorioSustraido() {
		return sumatorioSustraido;
	}

	public void setSumatorioSustraido(double sumatorioSustraido) {
		this.sumatorioSustraido = sumatorioSustraido;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [cantidadSustraida=" + cantidadSustraida + ", sumatorioSustraido=" + sumatorioSustraido
				+ "]";
	}

	@Override
	public double ingresarSaldo(double cantidad) {
		if(cantidad > 0) {
		super.setSaldo(getSaldo()+cantidad);
		}
		return super.getSaldo();
	}

	@Override
	public double retirarSaldo(double cantidad) {
		if(cantidad + cantidadSustraida <= super.getSaldo()) {
			super.setSaldo(super.getSaldo()-(cantidad+cantidadSustraida));
			sumatorioSustraido += cantidadSustraida;
		}
		return super.getSaldo();
	}
	
	
	
	
}
