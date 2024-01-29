package ejemploForEach;

public class Principal {
	
	public static void main(String[] args) {
		
		int [ ] numeros = {1,3,5,7,9,11,13,15,17,19};
		int suma = 0;
		
		for (int valor : numeros) {// se declara la variable del tipo del array (int valor)
									// luego de los dos puntos, el nombre del array (numeros)
			suma += valor;			// los dos punto : son un operador ternario
									// es como un if else en una sola linea
			System.out.println (valor);
			
		}
		
		System.out.println ("La suma es: " + suma);
		
	}
}
