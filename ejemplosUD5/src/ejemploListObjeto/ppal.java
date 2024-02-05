package ejemploListObjeto;

import java.util.ArrayList;
import java.util.List;

public class ppal {

	public static void main(String[] args) 
	{
		
		Figura f1 = new Cuadrado("cuadrado1","123L",4);
		Figura f2 = new Cuadrado("cuadrado2","321L",4);
		Figura f3 = new Cuadrado("cuadrado3","123C",4);
		Figura f0 = new Figura("figura1","321C");
		
		List <Figura> listado = new ArrayList <Figura>();
		
		listado.add(f0);
		listado.add(f1);
		listado.add(f2);
		listado.add(f3);
		listado.add(f3);//el mismo que el de arriba
		listado.add(new Cuadrado("cuadrado4","123J",4));
		listado.add(new Cuadrado("cuadrado4","123J",4));//diferentes pero con los mismos atributos
		
		CRUDFigura crudFig = new CRUDFigura(listado);
		
		System.out.println(listado);
		
		System.out.println(listado.contains(f1));
		
		System.out.println(listado.size());
		
		listado.remove(2);
		
		System.out.println(listado);
		
		System.out.println(crudFig.findById("123J"));
		
		crudFig.borrar("123L");
		
		Impresion.imprimirLista(listado);

	}

}
