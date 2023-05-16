package ejercicio1;

import java.util.Scanner;

public class Ejercicio1Corregido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase=" ";
		boolean Fin=true;
		do {
		
			frase= leerFrase(sc);
			if(frase.toLowerCase().equals("fin")) {
				
			}else {
			palabraMasLarga(frase);
			}
		} while (Fin);
		sc.close();
	}
	public static String leerFrase(Scanner sc) {
		String frase;
		do{System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		}while(frase.equals(""));
		return frase;
	}
	public static void palabraMasLarga(String frase) {
		String []cadena=frase.split(" ");
		int letras=0;
		String larga="";
		for(int i=0;i<cadena.length;i++) {
			if (cadena[i].length()>letras) {
				larga=cadena[i];
				letras=cadena[i].length();
			}
			
		}
		System.out.println("La palabra de mayor longitud es: " + larga);
		System.out.println("Su longitud es: " + letras);
		
	}
}
