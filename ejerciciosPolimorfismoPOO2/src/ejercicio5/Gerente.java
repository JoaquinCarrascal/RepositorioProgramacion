package ejercicio5;

public class Gerente extends Empleado{

	private double impuestosSobreBase;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double impuestosSobreBase) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.impuestosSobreBase = impuestosSobreBase;
	}

	public double getImpuestosSobreBase() {
		return impuestosSobreBase;
	}

	public void setImpuestosSobreBase(double impuestosSobreBase) {
		this.impuestosSobreBase = impuestosSobreBase;
	}

	@Override
	public String toString() {
		return "Gerente impuestosSobreBase=" + impuestosSobreBase + super.toString();
	}

	@Override
	public double calcularSueldo() {
		int cien = 100;
		return super.calcularSueldo()+super.calcularSueldo()*impuestosSobreBase/cien;
	}
	
	
	
}
