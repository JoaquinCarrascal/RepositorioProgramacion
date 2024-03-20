package ejemploFechas;

public class FechaInalcanzable extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FechaInalcanzable() {}
	
	public FechaInalcanzable(String msg) {
		
		super(msg);
		
	}
	
}
