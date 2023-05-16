package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1, num2, sigo;

		boolean parar = true, gemelos;
		Scanner sc = new Scanner(System.in);
		do {
			do {
				System.out.println("Introduzca el primer numero entero positivo: ");
				num1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca el segundo numero entero positivo:");
				num2 = Integer.parseInt(sc.nextLine());
				if (num1 < 0 || num2 < 0) {
					System.out.println("No se admiten numeros por debajo de 0");
				}
			} while (num1 < 0 || num2 < 0);

			gemelos = sonGemelos(num1, num2);
			if (gemelos) {
				System.out.println("Esta pareja de numeros son gemelos");
			} else {
				System.out.println("Esta pareja de numeros no son gemelos");

			}
			System.out.println("Quiere otra pareja? (0 para parar, cualquier otro numero para seguir)");
			sigo = Integer.parseInt(sc.nextLine());
			if (sigo == 0) {
				parar = false;
			} else {
				System.out.println();
			}
		} while (parar);
		sc.close();
	}

	public static boolean esPrimo(int num) {
		boolean Primo = true;
		int div = 2;
		if (num == 0 || num == 1) {
			Primo = false;
		} else {
			while (num > div && Primo) {
				if (num == 2) {
				} else {
					if (num % div == 0) {
						Primo = false;
					}
					div++;
				}
			}
		}
		return Primo;
	}

	public static boolean sonGemelos(int num1, int num2) {
		boolean sonGemelos = false;
		if (esPrimo(num1) && esPrimo(num2) && (num1 - num2 == 2 || num2 - num1 == 2)) {
			sonGemelos = true;
		} else {
		}
		return sonGemelos;
	}
}