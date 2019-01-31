package ejercicio4;

import java.util.Scanner;

public class PrincipalFraccionVoid {

	public static void menuPrincipal () {

		System.out.println("--- MENU ---");
		System.out.println(" 1- Invertir la fracción.");
		System.out.println(" 2- Simplificar la fracción.");
		System.out.println(" 3- Mutiplicar la fracción.");
		System.out.println(" 4- Dividir la fracción.");
		System.out.println(" 0- Salir del programa.");
		System.out.printf("Elija una opción: ");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecciones los números que compondrán la fracción.");
		System.out.printf("Numerador: ");
		int numerador = sc.nextInt();
		System.out.printf("Denominador: ");
		int denominador = sc.nextInt();
		System.out.println();

		FraccionVoid fraccion = new FraccionVoid(numerador, denominador);

		int numero;

		while (true) {

			menuPrincipal();
			int opcion = sc.nextInt();

			switch (opcion) {


			case 1:

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				fraccion.invertir();

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				break;

			case 2:

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				fraccion.simplificar();
				
				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				break;

			case 3:

				System.out.printf("%nNúmero para multiplicar: ");
				numero = sc.nextInt();

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				fraccion.multiplicar(numero);

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());


				break;

			case 4:

				System.out.printf("%nNúmero para dividir: ");
				numero = sc.nextInt();

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				fraccion.dividir(numero);

				System.out.printf(" %d%n----%n %d%n%n", fraccion.getNumerador(), fraccion.getDenominador());

				break;

			case 0:

				System.out.println("Hasta pronto!");
				System.exit(0);

				break;

			default:
				break;

			}
		}
	}
}
