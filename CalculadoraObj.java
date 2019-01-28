package calculadora;

public class CalculadoraObj {

	private double num1;
	private double num2;
	
	public CalculadoraObj (double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double sumar () {
		
		return num1 + num2;
	}
	
	public double restar () {
		
		return num1 - num2;
	}
	
	public double multiplicar () {
		
		return num1 * num2;
	}
	
	public double dividir () {
		
		return num1 / num2;
	}
	
}
