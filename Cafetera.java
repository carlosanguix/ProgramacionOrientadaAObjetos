package ejercicio3;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;


	// CONSTRUCTORES
	public Cafetera () {

		this(1000, 0);
	}

	public Cafetera (int capacidadMaxima) {

		this(capacidadMaxima, capacidadMaxima);
	}

	public Cafetera (int capacidadMaxima, int cantidadActual) {

		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual  = cantidadActual;

		if (cantidadActual > capacidadMaxima)
		{
			this.cantidadActual  = capacidadMaxima;
		}
	}


	// METODOS
	public int llenarCafetera () {

		return this.cantidadActual = this.capacidadMaxima;
	}

	public int servirTaza (int taza) {

		if (this.cantidadActual - taza <= 0) 
		{
			return vaciarCafetera();
		} 
		else
		{
			//TODO		
			return this.cantidadActual = this.cantidadActual - taza;	
		}
	}

	public int vaciarCafetera () {

		return this.cantidadActual = 0;
	}

	public int agregarCafe (int cafeAgregado) {

		return this.cantidadActual = (this.cantidadActual + cafeAgregado > this.capacidadMaxima)
				? this.capacidadMaxima
				: this.cantidadActual + cafeAgregado;
	}


	// GET - SET
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}


}
