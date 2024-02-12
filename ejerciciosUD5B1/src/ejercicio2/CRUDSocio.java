package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CRUDSocio {

	List <Socio> listado = new ArrayList <>();

	public CRUDSocio(List<Socio> listado) {
		this.listado = listado;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDSocio [listado=" + listado + "]";
	}
	
	public void agregarSocio(Socio s) {
		listado.add(s);
	}
	
	public Socio buscarXDni(String dni) {
		boolean encontrado = false;
		int contador = 0;
		while(contador < listado.size() && !encontrado) {
			if(listado.get(contador).getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}
			else
				contador++;
		}
		if(encontrado)
			return listado.get(contador);
		else
			return null;
	}
	
	public void mostrarSocio(String dni) {
		System.out.println(buscarXDni(dni));
	}
	
	public void modificarDni(String dni,String dniNuevo) {
		buscarXDni(dni).setDni(dniNuevo);
	}
	
	public void modificarNombre(String dni,String nombre) {
		buscarXDni(dni).setNombre(nombre);
	}
	
	public void modificarEdad (String dni,int edad) {
		buscarXDni(dni).setEdad(edad);
	}
	
	public void borrarSocio(String dni) {
		if(listado.contains(buscarXDni(dni)))
			listado.remove(buscarXDni(dni));
	}
	
	
}
