package ejercicio6;

import java.util.List;

public class CRUDTrabajador {

	private List <Trabajador> listado;

	public CRUDTrabajador(List<Trabajador> listado) {
		this.listado = listado;
	}

	public List<Trabajador> getListado() {
		return listado;
	}

	public void setListado(List<Trabajador> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDTrabajador [listado=" + listado + "]";
	}
	
	public void agregarTrabajador(Trabajador t) {
		listado.add(t);
	}
	
	public void calcularSueldoListadoCompleto() {
		for (Trabajador trabajador : listado) {
			trabajador.setSueldoFinal(trabajador.getSueldoXhoras()*trabajador.getHorasTrabajadas());
		}
	}
	
	
}
