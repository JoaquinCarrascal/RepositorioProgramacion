package ejercicio6;

import java.util.Random;

public class Generadora {

	public int generarAleatorio(int desde, int hasta) {
		
		Random rnd = new Random(System.nanoTime());
		int aleatorio = rnd.nextInt(hasta-desde+1)+desde;
		
		return aleatorio;
	}
	
	public int generarPrimitiva(int desde, int hasta) {
		int primitiva;
		primitiva = generarAleatorio(desde, hasta);
		return primitiva;
	}
	
	public boolean generarParesYNones(int numUsu) {
 
		//par = true //impar = false
		boolean result;
		if((generarAleatorio(0,10) + numUsu)%2==0)
			return result = true;
		else
			return result = false;
	
	}
	
	
	
}