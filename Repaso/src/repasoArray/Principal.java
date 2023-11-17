package repasoArray;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
	
		Random rnd = new Random(System.nanoTime());
		Scanner keyB = new Scanner(System.in);
		
		String aux;
		int tam = 10,rellenator,
				randomizator = rnd.nextInt(100-1+1)+1;
		 //Declarar arrays con valores iniciales
		//int [] myArrayInt = {1,2,4,5,6};//tamaño = al número de cosas dentro
		
		//declarando e instanciando en diferentes líneas
		int [] myArrayInt2;
		myArrayInt2 = new int[tam];
		
		
		//Rellenar un Array
		
		for(int i = 0;i<myArrayInt2.length;i++) {
			aux = keyB.nextLine();
			rellenator = Integer.parseInt(aux);
			myArrayInt2[i] = rellenator;
		}
		
		for(int i = 0;i<myArrayInt2.length;i++) {
			myArrayInt2[i] = randomizator;
		}
		
		
		keyB.close();
	}
}
