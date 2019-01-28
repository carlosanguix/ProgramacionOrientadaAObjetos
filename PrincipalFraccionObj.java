package ejercicio4;

import java.util.Scanner;

public class PrincipalFraccionObj {

	public static void menuPrincipal () {

		System.out.println();
		System.out.println("---- M E N U ----");
		System.out.println(" 1-  Invertir");
		System.out.println(" 2-  Simplificar");
		System.out.println(" 3-  Sumar número.");
		System.out.println(" 4-  Sumar fracción.");
		System.out.println(" 5-  Restar número.");
		System.out.println(" 6-  Restar fracción.");
		System.out.println(" 7-  Dividir número.");
		System.out.println(" 8-  Dividir fracción.");
		System.out.println(" 9-  Multiplicar número.");
		System.out.println(" 10- Multiplicar fracción");
		System.out.print("Elige una opción: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub






		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos a crear la fracción sobre la que operaremos.");
		System.out.print("Numerador: ");
		int numerador = sc.nextInt();
		System.out.print("Denominador: ");
		int denominador = sc.nextInt(); sc.nextLine();

		FraccionObj fraccion = new FraccionObj(numerador, denominador);
		FraccionObj fracc2;

		int num;

		while (true) {

			menuPrincipal();
			int opcion = sc.nextInt(); sc.nextLine();

			switch (opcion) {
			case 1:

				// Invertir
				System.out.println(fraccion);
				fraccion = fraccion.invertir();
				System.out.println(fraccion);

				break;

			case 2:

				// Simplificar
				System.out.println(fraccion);
				fraccion = fraccion.simplificar();
				System.out.println(fraccion);

				break;

			case 3:

				// Sumar número
				System.out.println();
				System.out.print("Número a sumar: ");
				num = sc.nextInt();
				System.out.println(fraccion);
				fraccion = fraccion.sumar(num);
				System.out.println(fraccion);

				break;

			case 4:

				// Sumar fracción
				System.out.println();
				System.out.println("Introduce la nueva fracción.");
				System.out.print("Numerador: ");
				numerador = sc.nextInt();
				System.out.printf("Denominador: ");
				denominador = sc.nextInt();

				fracc2 = new FraccionObj(numerador, denominador);
				System.out.println(fracc2);
				fracc2 = fracc2.sumar(fraccion);
				System.out.println(fracc2);

				break;

			case 5:

				// Restar número
				System.out.println();
				System.out.print("Número a restar: ");
				// Restar 4 - 2 es igual que sumar 4 + (-2)
				num = sc.nextInt() * -1;

				System.out.println(fraccion);
				fracc2 = fraccion.sumar(num);
				System.out.println(fracc2);

				break;

			case 6:

				// Restar fracción
				System.out.println();
				System.out.println("Introduce la nueva fracción.");
				System.out.print("Numerador: ");
				// Restar 4 - 2 es igual que sumar 4 + (-2)
				numerador = sc.nextInt() * -1;
				System.out.printf("Denominador: ");
				denominador = sc.nextInt();

				fracc2 = new FraccionObj(numerador, denominador);
				System.out.println(fraccion);
				fracc2 = fraccion.sumar(fracc2);
				System.out.println(fracc2);

				break;

			case 7:

				// Dividir número
				System.out.println();
				do 
				{
					System.out.print("Número a dividir: ");
					num = sc.nextInt();
				} while (num == 0);

				System.out.println(fraccion);
				fracc2 = fraccion.dividir(num);
				System.out.println(fracc2);

				break;

			case 8:

				// Dividir fracción
				System.out.println();
				System.out.println("Introduce la nueva fracción.");
				System.out.print("Numerador: ");
				numerador = sc.nextInt();
				System.out.printf("Denominador: ");
				denominador = sc.nextInt();
				
				fracc2 = new FraccionObj(numerador, denominador);
				System.out.println(fraccion);
				fracc2 = fraccion.dividir(fracc2);
				System.out.println(fracc2);

				break;

			case 9:

				// Multiplicar número
				System.out.println();
				System.out.print("Número a multiplicar: ");
				num = sc.nextInt();
				System.out.println(fraccion);
				fraccion = fraccion.multiplicar(num);
				System.out.println(fraccion);

				break;

			case 10:

				// Multiplicar fracción
				System.out.println();
				System.out.println("Introduce la nueva fracción.");
				System.out.print("Numerador: ");
				numerador = sc.nextInt();
				System.out.printf("Denominador: ");
				denominador = sc.nextInt();

				fracc2 = new FraccionObj(numerador, denominador);
				System.out.println(fraccion);
				fracc2 = fracc2.multiplicar(fraccion);
				System.out.println(fracc2);

				break;

			case 0:

				System.out.printf("%n%n¡Hasta pronto!");
				System.exit(0);

				break;

			default:
				break;

			}

		}


	}

}
