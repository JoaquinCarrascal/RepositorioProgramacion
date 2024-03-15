package ejerciciotipoexamen2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ppal {

	public static void main(String[] args) {
		
		//Cancion(String titulo, String interprete, int vecesEscuchada, boolean gratis, double duracion)
		
		Cancion c1 = new Cancion("lol","lol",2,false,17.5);
		Cancion c2 = new Cancion("lol","lol",2,true,1);
		Cancion c3 = new Cancion("lol","lol",2,false,3);
		Cancion c4 = new Cancion("lol","lol",2,true,8);
		Cancion c5 = new Cancion("lol","lol",2,false,6.5);
		Cancion c6 = new Cancion("lol","lol",2,true,7.5);
		Cancion c7 = new Cancion("lol","lol",2,false,27.5);
		Cancion c8 = new Cancion("esta","lol",2,true,27.5);
		
		int id = 0;
		
		Map <Integer,Cancion> listado = new HashMap<>();
		
		MiMusica mm1 = new MiMusica(listado);
		
		mm1.agregar(id++, c1);
		mm1.agregar(id++, c2);
		mm1.agregar(id++, c3);
		mm1.agregar(id++, c4);
		mm1.agregar(id++, c5);
		mm1.agregar(id++, c6);
		mm1.agregar(id++, c7);
		mm1.agregar(id++, c8);
		
		System.out.println(mm1.buscarGratis());
		System.out.println(mm1.buscarMasLarga());
		
		Collections.sort(listado,new OrdenarPorDuracion());
		
		
	}
	
}
