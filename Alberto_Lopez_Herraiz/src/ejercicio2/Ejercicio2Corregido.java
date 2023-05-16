package ejercicio2;

import java.util.Scanner;

public class Ejercicio2Corregido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		boolean parar = true, gemelos;
		do {
			do {
				System.out.println("Escribe un número entero positivo");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Escribe otro número entero positivo");
				b = Integer.parseInt(sc.nextLine());
				if(a<0||b<0) {
					System.out.println("No se admiten números negativos");
				}
			} while (b<0 || a<0);
			gemelos=sonGemelos(a,b);
			if (gemelos == true) {
				System.out.println("Los números " + a + " y " + b + " son gemelos");
			} else {
				System.out.println("Los números " + a + " y " + b + " NO son gemelos");
			}
			System.out.println("Escribe un número no admitido para parar (0 o menor)");
			c=Integer.parseInt(sc.nextLine());
			if(c<=0) {
				parar=false;
			}
		} while (parar);
		sc.close();

	}

	public static boolean esPrimo(int a) {
		boolean esPrimo = true;
		for (int i = 2; i < a && esPrimo; i++) {
			if (a % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}

	public static boolean sonGemelos(int num1, int num2) {
		boolean sonGemelos = false;
		if (esPrimo(num1) == true && esPrimo(num2) == true) {
			if (Math.abs(num2 - num1) == 2) {
				sonGemelos = true;
			}
		}
		return sonGemelos;
	}
}
