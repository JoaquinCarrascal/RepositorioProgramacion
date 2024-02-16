package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

	Set <Alumno> listado = new HashSet<>();
	CRUDAlumno crd1 = new CRUDAlumno(listado);
	
	listado.add(new Alumno("Carlos Ramón",5));
	listado.add(new Alumno("Victor Tui",55));
	listado.add(new Alumno("Cristóbal Aguilera",13));
	listado.add(new Alumno("Jesus Fernandez",24));
	listado.add(new Alumno("Abraham Carrascal",62));
	listado.add(new Alumno("Daniel Martinez",10));

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
