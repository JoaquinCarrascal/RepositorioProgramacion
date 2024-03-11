package ejemploLambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ppal {

	public static void main(String[] args) {
		
		ISaludo holaLambda = () -> "Hola mundo";
		
		System.out.println(holaLambda.saludo());
		
		ISuma calc = x -> x + 2;
		
		System.out.println(calc.suma(4));
		
		Supplier <Boolean> bool = () -> { //no se le pasan param y devuelve param
			if(Math.random()%2>0.5)
				return true;
			else
				return false;
		};
		
		if(bool.get())
			System.out.println("BERDAERO");
		
		Consumer <String> consumidor = (x) -> System.out.printf("Qué es esa %s",x);
		//se le pasan param y no devuelve param
		
		consumidor.accept("cosa");
		
		
		Function <String,Double> funsiom = x -> Double.parseDouble(x);
		//se le pasan el parametro de entrada y el de salida
		
		System.out.printf("El número resultante es: %.2f",funsiom.apply("2.435423"));
		
		
		

	}

}
