package ejercicio4;

public class FraccionVoid {

	private int numerador;
	private int denominador;
	
	
	// CONSTRUCTOR
	public FraccionVoid (int numerador, int denominador) {

		this.numerador   = numerador;
		this.denominador = denominador;
	}
	
	// FUNCIONES
	public static int hallarMaximoComundivisor (int a, int b) {

		return  (b == 0)
				? a
				: hallarMaximoComundivisor(b, a % b);
	}
	
	
	// METODOS
	public void invertir () {
				
		int aux;
		aux              = this.numerador;
		this.numerador   = this.denominador;
		this.denominador = aux;
	}

	public void simplificar () {

		int mcd = hallarMaximoComundivisor(numerador, denominador);
		
		this.numerador   = this.numerador / mcd;
		this.denominador = this.denominador / mcd;
	}

	public void dividir (int divisor) {

		this.numerador   = this.numerador / divisor;
		this.denominador = this.denominador / divisor;
	}

	public void multiplicar (int numero) {

		this.numerador   = this.numerador   * numero;
		this.denominador = this.denominador * numero;
	}


	// GETTERS SETTERS
	public int getNumerador() {
		
		return numerador;
	}

	public void setNumerador(int numerador) {
		
		this.numerador = numerador;
	}

	public int getDenominador() {
		
		return denominador;
	}

	public void setDenominador(int denominador) {
		
		this.denominador = denominador;
	}
}
