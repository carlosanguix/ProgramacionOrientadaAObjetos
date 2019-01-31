package ejercicio06;

public class Pizza {

	// ==ATRIBUTOS==
	// DE INSTANCIA
	private String tipoPizza;
	private String tamaño;
	private boolean servida;
	// DE CLASE
	private static int totalPedidas;
	private static int totalServidas;
	
	
	// CONSTRUCTOR
	public Pizza (String tipoPizza, String tamaño) {
		
		this.tipoPizza = tipoPizza;
		this.tamaño    = tamaño;
		this.servida   = false;
		
		Pizza.totalPedidas++;
	}
	
	// PROPIEDADES
	
	
	// METODOS
	// DE INSTANCIA
	public void sirve () {
		
		if (this.servida == false) {
			
			this.servida = true;
			Pizza.totalServidas++;
		} else {
			
			System.out.println("esa pizza ya se ha servido");
		}
		
	}
	@Override
	public String toString() {
		
		if (this.servida) {
			
			return "pizza " + tipoPizza + " " + tamaño + ", servida";
		} else {
			
			return "pizza " + tipoPizza + " " +tamaño + ", pedida";
		}
		
	}
	// DE CLASE
	public static int getTotalPedidas() {
		return totalPedidas;
	}
	public static int getTotalServidas() {
		return totalServidas;
	}
	
	
	
}
