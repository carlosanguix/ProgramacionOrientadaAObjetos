package ejercicio07;

import java.util.ArrayList;

public class Eurocoin {

	// ATRIBUTOS
	// ArrayList
	private ArrayList<Integer> valores;
	private ArrayList<String> lados;

	// CONSTRUCTOR
	// Le asignamos los atributos de la clase Constantes.
	public Eurocoin (ArrayList<Integer> valores, ArrayList<String> lados) {
		
		// ArrayList = ArrayList
		this.valores = valores;
		this.lados = lados;
	}

	// METODOS
	// Devolveremos un ArrayList de monedas. Este método lo llamamos desde el main,
	// es el que se encarga de generar monedas indicándole una cantidad de monedas a generar desde el main.
	public ArrayList<Moneda> generarMonedas(int cantidad) {
		
		// Creamos el ArrayList de tipo Moneda, ya que lo que queremos guardarnos es el valor / lado de cada moneda generada.
		ArrayList<Moneda> secuenciaMonedas = new ArrayList<Moneda>();
		Moneda ultimaGenerada = null;
		
		// Variables creadas para asignarselas a cada moneda generada y construirla
		// moneda(valor, lado)
		Moneda moneda;
		int valor;
		String lado;
		
		// Iteramos tantas veces como cantidad de monedas se quieran generar.
		for (int i = 0; i < cantidad; i++) {
			
			// Para elegir si cambiaremos el valor o el lado de cada moneda generada,
			// creamos una variable de tipo Opcion(Enum creado anteriormente), llamamos al método dentro de esta clase
			// dándole un int para que tenga en cuenta la primera iteración y crear una moneda random.
			// Las iteraciones != 0 devolverá una opción random (random generado dentro de el método seleccionarOpcion)
			Opcion opcionAModificar = seleccionarOpcion(i);
			
			// i == 0
			if (opcionAModificar == Opcion.AMBAS) {
				
				// Número random entre 0 - this.valores.size.
				// Asignamos a la variable |valor| el valor en la posición random del ArrayList valores de esta clase.
				int posicionValor = (int) (Math.random() * this.valores.size());
				valor = this.valores.get(posicionValor);
				// Lo mismo con la variable |lado|
				int posicionLado  = (int) (Math.random() * lados.size());
				lado  = this.lados.get(posicionLado);
			
			// Opción valor (elegida aleatoriamente), cambiamos el valor de la moneda que vamos a generar
			} else if (opcionAModificar == Opcion.VALOR) {
				
				// Creamos un ArrayList con todos los valores menos el valor de la última moneda generada.
				// Si la útlimaGenerada no tiene nigún valor dentro, le asignamos al Array todos los valores posibles,
				// sino, llamamos al método removeValue de la clase ArrayListExtensions que nos hemos creado para esto.
				ArrayList<Integer> valoresFiltrados = ultimaGenerada == null 
						? valores 
						: ArrayListExtensions.removeValue(valores, ultimaGenerada.getValor());
				// Ya que el ArrayList tiene un campo menos, creamos un random
				// y cogemos el valor de esa posición random de valoresFiltrados
				int posicionValor = (int) (Math.random() * valoresFiltrados.size());
				valor = valoresFiltrados.get(posicionValor);
				// Le asignamos el lado de la anterior moneda.
				lado  = ultimaGenerada.getLado();
				
			// Opción lado (elegida aleatoriamente), cambiamos el lado de la moneda que vamos a generar
			} else {
				
				// Creamos un ArrayList con todos los lados menos el lado de la última moneda generada.
				// Si la útlimaGenerada no tiene nigún lado dentro, le asignamos al Array todos los lados posibles,
				// sino, llamamos al método removeValue de la clase ArrayListExtensions que nos hemos creado para esto.
				ArrayList<String> ladosFiltrados = ultimaGenerada == null 
						? lados 
						: ArrayListExtensions.removeValue(lados, ultimaGenerada.getLado());
				// Ya que el ArrayList tiene un campo menos, creamos un random
				// y cogemos el lado de esa posición random de ladosFiltrados
				int posicionLado  = (int) (Math.random() * ladosFiltrados.size());
				valor = ultimaGenerada.getValor();
				// Le asignamos el valor de la anterior moneda.
				lado  =  ladosFiltrados.get(posicionLado);
			}
			// Una vez seleccionados el valor y el lado construimos la moneda.
			moneda = new Moneda(valor, lado);
			// Asignamos esa moneda a la moneda anterior para operar con ella en la próxima iteración.
			// Añadimos la moneda al ArrayList del principio
			ultimaGenerada = moneda;
			secuenciaMonedas.add(moneda);
		}

		return secuenciaMonedas;
	}

	// Método para elegir entre cambiar el valor o el lado para la próxima moneda.
	// Devolvemos un dato de tipo Enum.
	private Opcion seleccionarOpcion (int i) {

		if (i == 0) return Opcion.AMBAS;
		
		int turno = (int)(Math.random() * 2);
		
		return turno % 2 == 0 
				? Opcion.VALOR
				: Opcion.LADO;

	}

}
