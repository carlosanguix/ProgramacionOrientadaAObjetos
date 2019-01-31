package ejercicio3;

import java.util.Scanner;

public class PrincipalCafetera {

	public static void menuPrincipal () {

		System.out.printf("----- MENU-----%n");
		System.out.println(" 1- Elegir la capacidad máxima de la cafetera y llenarla.");
		System.out.println(" 2- Elegir la capacidad máxima de la cafetera e indicar la cantidad de café que tendrá.");
		System.out.println(" 3- Llenar cafetera.");
		System.out.println(" 4- Servir taza.");
		System.out.println(" 5- Vaciar cafetera.");
		System.out.println(" 6- Agregar café a la cafetera.");
		System.out.println(" 7- Cantidad actual de café en la cafetera.");
		System.out.println(" 0- Salir del programa.");
		System.out.printf("Elija una opción: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Cafetera cafetera = new Cafetera();

		int capacidadMaxima;
		int cantidadActual;

		while (true) {

			menuPrincipal();
			int opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.printf("%nCapacidad máxima: ");
				capacidadMaxima = sc.nextInt(); sc.nextLine();
				cafetera = new Cafetera(capacidadMaxima);

				System.out.printf("Se ha ajustado la capacidad máxima de la cafetera a %dml y"
						+ " se ha llenado de café.%n%n", cafetera.getCapacidadMaxima());

				break;

			case 2:

				System.out.printf("%nCapacidad máxima: ");
				capacidadMaxima = sc.nextInt();
				System.out.printf("Cantidad actual: ");
				cantidadActual = sc.nextInt(); sc.nextLine();

				cafetera = new Cafetera(capacidadMaxima, cantidadActual);

				System.out.printf("Se ha ajustado la capacidad máxima de la cafetera a %dml y"
						+ " se ha llenado con %dml de café.%n%n", cafetera.getCapacidadMaxima(), cafetera.getCantidadActual());

				break;

			case 3:

				cafetera.llenarCafetera();

				System.out.printf("%nSe ha llenado la cafetera con un total de %dml de café.%n%n", cafetera.getCantidadActual());

				break;

			case 4:

				System.out.printf("%nDe cuántos ml quieres la taza?%n");
				System.out.printf("Cantidad: ");
				int taza = sc.nextInt();

				cafetera.servirTaza(taza);

				System.out.println();
				
				break;

			case 5:

				cafetera.vaciarCafetera();

				System.out.printf("%nSe ha vaciado la cafetera (%dml de café actualmente)%n%n", cafetera.getCantidadActual());

				break;

			case 6:

				System.out.printf("%nCantidad: ");
				int cafeAgregado = sc.nextInt();

				cafetera.agregarCafe(cafeAgregado);

				System.out.printf("%nLa cantidad actual de café en la cafetera es de: %dml%n%n", cafetera.getCantidadActual());

				break;
				
			case 7:
				
				System.out.printf("%nQuedan %dml de café en la cafetera.%n%n", cafetera.getCantidadActual());
				
				break;

			case 0:

				System.out.printf("%n%nHasta pronto!");
				System.exit(0);

				break;

			default:
				break;

			}
		}
	}
}
