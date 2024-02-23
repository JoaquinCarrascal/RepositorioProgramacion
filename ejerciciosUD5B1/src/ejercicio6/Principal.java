package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List <Trabajador> listado = new ArrayList<>();
		CRUDTrabajador c1 = new CRUDTrabajador(listado);
		c1.agregarTrabajador(new Trabajador("Juanito","1123",10,15));
		c1.agregarTrabajador(new Trabajador("Pablito","2123",1,16));
		c1.agregarTrabajador(new Trabajador("Jaimito","3123",1,17));
		c1.agregarTrabajador(new Trabajador("Gonzalito","4123",1,15));
		c1.agregarTrabajador(new Trabajador("Robertito","5123",9,10));
		c1.agregarTrabajador(new Trabajador("Yo","6123",1,1000));
		
		c1.calcularSueldoListadoCompleto();
		
		for (Trabajador trabajador : listado) {
			System.out.println(trabajador);
		}
		
		Collections.sort(listado);
		System.out.println();
		for (Trabajador trabajador : listado) {
			System.out.println(trabajador);
		}

	}

}
