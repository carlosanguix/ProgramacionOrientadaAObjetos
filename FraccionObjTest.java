package ejercicio4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FraccionObjTest {

	@Test
	void invertir () {
		
		FraccionObj fracc = new FraccionObj(2, 4);
		FraccionObj fraccCorrecta = new FraccionObj(4, 2);
		fracc = fracc.invertir();
		assertEquals(fraccCorrecta, fracc);
		}
	
	@ Test
	void sumar (FraccionObj fracc1) {
		
		fracc1 = new FraccionObj(2, 1);
		FraccionObj fracc2 = new FraccionObj(2, 2);
		fracc2 = fracc1.sumar(fracc2);
		
		FraccionObj fraccCorrecta = new FraccionObj(6, 2);
		
		assertEquals(fraccCorrecta, fracc2);
	}
	
	
}
