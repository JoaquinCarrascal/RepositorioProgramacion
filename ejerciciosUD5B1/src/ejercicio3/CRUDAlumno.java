package ejercicio3;

import java.util.Set;

public class CRUDAlumno {

	private Set<Alumno> listaAlumno;

	public CRUDAlumno(Set<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	public Set<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(Set<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "CRUDAlumno [listaAlumno=" + listaAlumno + "]";
	}

	public Alumno buscarXId(int id) {
		if (listaAlumno.size() != 0) {
			for (Alumno alumno : listaAlumno) {
				if (alumno.getCodAlumno() == id)
					return alumno;
			}
		}
		return null;
	}
	
	public void mostrarAlumno(int id) {
		System.out.println(buscarXId(id));
	}
	
	public void borrarAlumno(int id) {
		if(listaAlumno.contains(buscarXId(id))) {
			listaAlumno.remove(buscarXId(id));
		}
	}
	
	public void modificarNombre(int id,String nuevoNombre) {
		buscarXId(id).setNombre(nuevoNombre);
	}
	
	public void mostrarLista() {
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);
		}
	}

}
