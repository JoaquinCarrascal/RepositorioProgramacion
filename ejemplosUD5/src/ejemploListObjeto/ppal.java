package ejemploListObjeto;

import java.util.ArrayList;
import java.util.List;

public class ppal {

	public static void main(String[] args) 
	{
	
		Figura f1 = new Cuadrado("cuadrado1",4);
		Figura f2 = new Cuadrado("cuadrado2",4);
		Figura f3 = new Cuadrado("cuadrado3",4);
		Figura f0 = new Figura("figura1");
		
		List <Figura> listado = new ArrayList <Figura>();
		
		listado.add(f0);
		listado.add(f1);
		listado.add(f2);
		listado.add(f3);
		
		System.out.println(listado);
		
		System.out.println(listado.contains(f1));
		
		System.out.println(listado.size());
		
		listado.remove(2);
		
		System.out.println(listado);

	}

}
