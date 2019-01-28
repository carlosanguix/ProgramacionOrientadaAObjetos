package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraObjTest {

	@Test
	void testSumar() {
		
		CalculadoraObj calcu = new CalculadoraObj(2, 2);
		double resultado = calcu.sumar();
		assertEquals(4, resultado);
	}
	
	@Test
	void testRestar() {
		
		CalculadoraObj calcu = new CalculadoraObj(3, 2);
		double resultado = calcu.restar();
		assertEquals(1, resultado);
	}

	@Test
	void testMultiplicar() {
		
		CalculadoraObj calcu = new CalculadoraObj(2, 2);
		double resultado = calcu.multiplicar();
		assertEquals(4, resultado);
	}

	@Test
	void testDividir() {
		
		CalculadoraObj calcu = new CalculadoraObj(4, 2);
		double resultado = calcu.dividir();
		assertEquals(2, resultado);
	}

}
