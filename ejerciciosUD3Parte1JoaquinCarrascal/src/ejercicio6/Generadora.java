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
		if((generarAleatorio(0,10) + numUsu)%2==0)
			return true;
		else
			return false;
	
	}
	
	public boolean jugarALosChinos(int numUsu, int prediccionUsu) {
		
		if((generarAleatorio(0,3) + generarAleatorio(0,3) + numUsu)==prediccionUsu)
			return true;
		else
			return false;
	}
	
	
	
}