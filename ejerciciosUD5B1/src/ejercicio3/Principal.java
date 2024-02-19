package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

	Set <Alumno> listado = new HashSet<>();
	CRUDAlumno crd1 = new CRUDAlumno(listado);
	
	crd1.agregarAlumno(new Alumno("Carlos Ramón",5));
	crd1.agregarAlumno(new Alumno("Victor Tui",55));
	crd1.agregarAlumno(new Alumno("Cristóbal Aguilera",13));
	crd1.agregarAlumno(new Alumno("Jesus Fernandez",24));
	crd1.agregarAlumno(new Alumno("Abraham Carrascal",62));
	crd1.agregarAlumno(new Alumno("Daniel Martinez",10));

	crd1.mostrarLista();
	System.out.println("------------------------------------------------");
	crd1.mostrarAlumno(24);
	System.out.println("------------------------------------------------");
	crd1.modificarNombre(62, "Pacopepe");
	System.out.println("------------------------------------------------");
	crd1.mostrarLista();
	System.out.println("------------------------------------------------");
	crd1.borrarAlumno(55);
	System.out.println("------------------------------------------------");
	crd1.mostrarLista();
	System.out.println("------------------------------------------------");
	
	}

}
