package ejercicio07;

public class Moneda {

	// ATRIBUTOS
	private int valor;
	private String lado;
	
	
	// CONSTRUCTOR
	// Llamado desde la clase Eurocoin
	public Moneda (int valor, String lado) {

		this.valor = valor;
		this.lado = lado;
	}
	
	
	// METODOS
	public int getValor() {
		
		return valor;
	}
	
	public String getLado() {
		
		return lado;
	}
	// Método con el que sabremos si una moneda tiene alguna diferencia con otra moneda
	public boolean TienenDiferencia(Moneda moneda) { // Moneda a comparar
		// False - Si no tiene nada dentro
		if(moneda == null) {
			
			return false;
		}
		// True - comparamos que los lados Ó los valores sean distintos.
		return this.valor != moneda.valor || this.lado != moneda.lado;
	}
}
