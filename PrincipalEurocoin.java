package ejercicio07;

import java.util.ArrayList;

public class PrincipalEurocoin {

	public static void main(String[] args) {

		// Creamos la instancia del objeto Eurocoin pasándole los valores estáticos finales
		// de la clase Constantes (Al ser estáticos se les llama de esta manera).
		Eurocoin eurocoin = new Eurocoin(Constantes.valores, Constantes.lados);
		
		// Indicamos la cantidad de monedas a generar
		// creamos un ArrayList tipo Moneda (Igual que las clases String e Integer ...)
		// y le pasamos ese valor al método generar monedas de la clase Eurocoin.
		int monedasAGenerar = 6;
		ArrayList<Moneda> monedas = eurocoin.generarMonedas(monedasAGenerar);
		
		// Creamos una instáncia de la clase PintorMonedas que recibirá el ArrayList anteriormente creado.
		PintorMonedas pintorMonedas = new PintorMonedas();
		pintorMonedas.ImprimirMonedas(monedas);
	}
}
