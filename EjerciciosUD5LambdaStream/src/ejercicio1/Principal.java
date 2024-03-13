package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List <Alumno> listado = new ArrayList<>();
		
		Secretaria sec = new Secretaria(listado);
		
		sec.agregarAlumno(new Alumno("Joaquin","Carrascal Franco Primero","DAM",9.5,22));
		sec.agregarAlumno(new Alumno("Joaquin","Carrascal Franco","DAM",9.5,22));
		sec.agregarAlumno(new Alumno("Paco","Paquetes","DAM",9.5,23));
		sec.agregarAlumno(new Alumno("Pepe","Botika","DAM",9.5,40));
		sec.agregarAlumno(new Alumno("Luis","Tosar","DAM",9.5,22));
		sec.agregarAlumno(new Alumno("Pablo","Motos","DAM",9.5,18));
		sec.agregarAlumno(new Alumno("Joaquin","Carrascal Franco","DAM",9.5,22));
		sec.agregarAlumno(new Alumno("Aaa","test","test",9.5,20));
		sec.agregarAlumno(new Alumno("Aaaa","test","test",9.5,21));
		sec.agregarAlumno(new Alumno("Aaaaaaaaaaa","test","test",9.5,21));
		
		sec.imprimirListado(sec.filtradoPorNombre("Joaquin"));
		
		System.out.println("\n--------\n");
		
		sec.imprimirListado(sec.getListado());
		
		System.out.println("\n--------\n");
		
		sec.imprimirListado(sec.filtradoPorLetra("P"));
		
		System.out.println("\n--------\n");
		
		System.out.printf("Hay %d alumnos en la lista.",sec.cantidadAlumnos());
		
		System.out.println("\n--------\n");
		
		sec.imprimirListado(sec.filtradoPorNotaMedia(9));
		
		System.out.println("\n--------\n");
		
		sec.mostrarPrimeros(3);
		
		System.out.println("\n--------\n");
		
		System.out.println(sec.filtradoPorMasJoven());
		
		System.out.println("\n--------\n");
		
		System.out.println(sec.buscarPrimeroLista());
		
		System.out.println("\n--------\n");
		
		sec.imprimirListado(sec.buscarNombreLargo(4));
		
		System.out.println("\n--------\n");
		
		sec.imprimirListado(sec.buscarLetraLongitud("A", 5));
		
		
		

	}

}
