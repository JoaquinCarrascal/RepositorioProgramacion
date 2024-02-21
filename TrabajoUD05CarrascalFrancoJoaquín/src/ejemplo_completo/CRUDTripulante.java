package ejemplo_completo;

import java.util.Set;

public class CRUDTripulante {
	
	private Set <Tripulante> listado; //Ctrl + shift + o = importa todas las clases que necesites

	public CRUDTripulante(Set<Tripulante> listado) {
		this.listado = listado;
	}

	public Set<Tripulante> getListado() {
		return listado;
	}

	public void setListado(Set<Tripulante> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDTripulante [listado=" + listado + "]";
	}
	
	public void imprimirListado() {//con intros de por medio
		for (Tripulante tripulante : listado) {
			System.out.println(tripulante);
		}
	}
	
	public void agregarTripulante(Tripulante tripulante) {
		listado.add(tripulante);
	}
	
	public Tripulante buscarXId(String id) {
		if (listado.size() != 0) {
			for (Tripulante tripulante : listado) {
				if (tripulante.getIdTripulante().equals(id))
					return tripulante;
			}
		}
		return null;
	}
	
	public void mostrarTripulante(String id) {
		System.out.println(buscarXId(id));
	}
	
	public void borrarTripulante(String id) {
		if(listado.contains(buscarXId(id))) {
			listado.remove(buscarXId(id));
		}
	}
	
	public double calcularSueldoGenerico(Tripulante trip,double porcentajeInterior) {
		if(listado.contains(trip))
			return trip.calcularSueldoUnitario(porcentajeInterior);
		else
			return 0.0;
	}
	
	public double calcularGastoTotal(double porcentajeInterior) {
		var aux = 0f;
		for (Tripulante tripulante : listado) {
			aux	+= calcularSueldoGenerico(tripulante, porcentajeInterior);
		}
		return aux;
	}
	
	public void consejoTripulante(String id) {
		buscarXId(id).avisoDeTrabajo();
	}

}
