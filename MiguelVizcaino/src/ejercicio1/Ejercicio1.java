package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String frase;
		boolean FinPrograma = true;
		Scanner sc = new Scanner(System.in);
		do{frase = leerFrase(sc);
		if (frase.toUpperCase().equals("FIN")) {
			FinPrograma = false;
		} 
		else {
				palabraMasLarga(frase);
			}
		}while(FinPrograma);
		sc.close();
	}

	public static String leerFrase(Scanner sc) {
		String frase;
		do {
			System.out.println("Introduzca una frase: (FIN para parar)");
			frase = sc.nextLine();
		} while (frase.equals(""));
		return frase;
	}

	public static void palabraMasLarga(String frase) {
		String[] palabras;
		palabras=frase.split(" ");
		String palabraMasLarga="";
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].length()>palabraMasLarga.length()) {
				palabraMasLarga=palabras[i];
			}
		}
		System.out.println("La palabra mas larga de tu frase es: "+palabraMasLarga);
		System.out.println("Su longitud es: "+palabraMasLarga.length());
	}

}
