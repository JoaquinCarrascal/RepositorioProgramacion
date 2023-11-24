package ejemplopasoarray;

import java.util.Random;

public class Listas {

	public void rellenarArray(int [] miArray, int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = rnd.nextInt(hasta - desde + 1) + desde;
		}
	}
	
	public void mostrarArray(int [] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.print("  " + miArray[i]);
		}
	}

}
