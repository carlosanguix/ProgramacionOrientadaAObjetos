package ejercicio07;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EurocoinTest {

	@Test
	public void GenerarMonedas_DosConsecuticasDebenSerDistintasEnLadoOValor() {
		
		//Arrange
		Eurocoin eurocoin = new Eurocoin(Constantes.valores, Constantes.lados);
		
		//Act
		ArrayList<Moneda> monedasGeneradas = eurocoin.generarMonedas(2);
		
		//Assert
		Moneda primeraMoneda = monedasGeneradas.get(0);
		Moneda segundaMoneda = monedasGeneradas.get(1);
		boolean monedasTienenUnaDiferencia = false;
		
		if (primeraMoneda.TienenDiferencia(segundaMoneda)) {
			monedasTienenUnaDiferencia = true;
		}
		
		assertTrue(monedasTienenUnaDiferencia);
	}

}
