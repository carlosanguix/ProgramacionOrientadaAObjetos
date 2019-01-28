package ejercicio4;

public class FraccionObj {

	
	// ATRIBUTOS
	protected double numerador;
	private double denominador;


	// CONSTRUCTORES
	public FraccionObj () {

		this(1);
	}

	public FraccionObj (double numerador) {

		this(numerador, 1);
	}

	public FraccionObj (double numerador, double denominador) {

		this.numerador   = numerador;
		this.denominador = denominador;
	}

	
	// METODOS INTERNOS
	// MCD
	private static double hallarMaximoComundivisor (double a, double b) {

		return  (b == 0)
				? a
						: hallarMaximoComundivisor(b, a % b);
	}
	// MCM
	private static double hallarMinimoComunMultiplo (double numerador, double denominador) {

		double a   = Math.max(numerador, denominador);
		double b   = Math.min(numerador, denominador);
		double mcm = (a / hallarMaximoComundivisor(numerador, denominador));
		return mcm;
	}


	// METODOS EXTERNOS
	// Cuando llamamos a este método ocnvertimos la clase en un String para poder imprimirla.
	@Override
	public String toString() {

		return numerador + " / " + denominador;
	}
	// INVERTIR
	public FraccionObj invertir () {

		return new FraccionObj(this.denominador, this.numerador);
	}
	// SIMPLIFICAR
	public FraccionObj simplificar () {

		double mcd = hallarMaximoComundivisor(this.numerador, this.denominador);

		return new FraccionObj(this.numerador / mcd, this.denominador / mcd);
	}
	// SUMAR NUMERO
	public FraccionObj sumar (double numerador) {

		FraccionObj fracc = new FraccionObj(numerador);

		return this.sumar(fracc);
	}
	// SUMAR FRACCION
	public FraccionObj sumar (FraccionObj f) {

		double mcm = hallarMinimoComunMultiplo(f.denominador, this.denominador);

		f.numerador   = (mcm / this.denominador) * this.numerador + (mcm / f.denominador) * f.numerador;
		f.denominador = mcm;

		return f;
	}
	// DIVIDIR NUMERO
	public FraccionObj dividir (double numerador) {

		FraccionObj fracc = new FraccionObj(numerador);

		return this.dividir(fracc);
	}
	//DIVIDIR FRACCION
	public FraccionObj dividir (FraccionObj fraccion) {

		double aux = fraccion.numerador * this.denominador;
		fraccion.numerador   = fraccion.denominador * this.numerador;
		fraccion.denominador = aux;

		return fraccion;
	}
	// MULTIPLICAR NUMERO
	public FraccionObj multiplicar (double numerador) {

		FraccionObj fracc = new FraccionObj(numerador);

		return this.multiplicar(fracc);
	}
	// MULTIPLICAR FRACCION
	public FraccionObj multiplicar (FraccionObj f) {

		f.numerador   = f.numerador * this.numerador;
		f.denominador = f.denominador * this.denominador;

		return f;
	}


	// GETTERS & SETTERS
	public double getNumerador() {
		return numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	//	private double numerador;
	//	private double denominador;
	//
	//
	//	// CONSTRUCTOR
	//	public FraccionObj () {
	//
	//		this(1, 1);
	//	}
	//
	//	public FraccionObj (double numero) {
	//
	//		this(numero, 1);
	//	}
	//
	//	public FraccionObj (double numerador, double denominador) {
	//
	//		this.numerador   = numerador;
	//		this.denominador = denominador;
	//	}
	//
	//	
	//	// FUNCIONES
	//	private static double hallarMaximoComundivisor (double a, double b) {
	//
	//		return  (b == 0)
	//				? a
	//				: hallarMaximoComundivisor(b, a % b);
	//	}
	//
	//	
	//	// METODOS
	//	public FraccionObj invertir () {
	//
	//		FraccionObj fracc = new FraccionObj(this.denominador, this.numerador);
	//		return fracc;
	//	}
	//
	//	public FraccionObj simplificar () {
	//		
	//		double mcd = hallarMaximoComundivisor(numerador, denominador);
	//		
	//		FraccionObj fracc = new FraccionObj(this.numerador / mcd, this.denominador / mcd);
	//		return fracc;
	//	}
	//
	//	public FraccionObj sumar (int numASumar) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador + numASumar, this.denominador + numASumar);
	//		return fracc;
	//	}
	//
	//	public FraccionObj sumar (FraccionObj f) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador + f.numerador, this.denominador + f.denominador);
	//		return fracc;
	//	}
	//
	//	public FraccionObj restar (int numARestar) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador - numARestar, this.denominador - numARestar);
	//		return fracc;
	//	}
	//
	//	public FraccionObj restar (FraccionObj f) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador - f.numerador, this.denominador - f.denominador);
	//		return fracc;
	//	}
	//
	//	public FraccionObj dividir (int numADividir) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador / numADividir, this.denominador / numADividir);
	//		return fracc;
	//	}
	//
	//	public FraccionObj dividir (FraccionObj f) {
	//		
	//		FraccionObj fracc = new FraccionObj(this.numerador * f.denominador, this.denominador * f.numerador);
	//		return fracc;
	//	}
	//
	//	public FraccionObj multiplicar (int numAMultiplicar) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador * numAMultiplicar, this.denominador * numAMultiplicar);
	//		return fracc;
	//	}
	//
	//	public FraccionObj multiplicar (FraccionObj f) {
	//
	//		FraccionObj fracc = new FraccionObj(this.numerador * f.numerador, this.denominador * f.denominador);
	//		return fracc;
	//	}
	//
	//
	//	// GETTERS SETTERS
	//	public double getNumerador() {
	//
	//		return numerador;
	//	}
	//
	//	public double getDenominador() {
	//
	//		return denominador;
	//	}
}
