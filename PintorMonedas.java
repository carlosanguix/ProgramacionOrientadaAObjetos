package ejercicio07;

import java.util.ArrayList;

// Imprime los atributos de una lista de monedas por la consola.
public class PintorMonedas {

	// Método al que pasamos el ArrayList de monedas creadas desde el main.
	// Quitar static?
	public static void ImprimirMonedas(ArrayList<Moneda> monedas) {
		
		int moneda;
		
		// Recorremos todo el ArrayList.
		for (int i = 0; i < monedas.size(); i++) {
			// Condición 1 céntimo
			if (monedas.get(i).getValor() < 2) {
				
				System.out.printf("%d céntimo - %s%n", monedas.get(i).getValor(), monedas.get(i).getLado());
			// Condición céntimos	
			} else if (monedas.get(i).getValor() < 100) {
				
				System.out.printf("%d céntimos - %s%n", monedas.get(i).getValor(), monedas.get(i).getLado());
			// Condición 1 euro	
			} else if (monedas.get(i).getValor() < 200) {
			// Las monedas están en céntimos, las dividimos entre 100	
				moneda = monedas.get(i).getValor() / 100;
				
				System.out.printf("%d euro - %s%n", moneda, monedas.get(i).getLado());
			// Condición euros	
			} else {
			// céntimos / 100	
				moneda = monedas.get(i).getValor() / 100;
				
				System.out.printf("%d euros - %s%n", moneda, monedas.get(i).getLado());
			}
		}	
	}
}