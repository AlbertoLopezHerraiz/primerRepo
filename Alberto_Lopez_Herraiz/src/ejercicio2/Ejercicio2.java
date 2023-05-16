package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b;
		do {
		System.out.println("Escribe un número, 0 en el siguiente para acabar");
		a=Integer.parseInt(sc.nextLine());
	
		System.out.println("Escribe otro número, 0 para acabar");
		b=Integer.parseInt(sc.nextLine());
		
		if( sonGemelos(a, b)==true) {
		System.out.println("Los números " + a + " y " + b + " son gemelos");
		}else {
			System.out.println("Los números " + a + " y " + b + " NO son gemelos");
		}
		System.out.println();
		}while(a!=0 && b!=0);
		sc.close();
		
	}
	public static boolean esPrimo(int a) {
		boolean esPrimo=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				esPrimo=false;
			}
		}
		return esPrimo;
	}
	public static boolean sonGemelos(int num1, int num2) {
		boolean sonGemelos=false;
		if(esPrimo(num1)==true && esPrimo(num2)==true) {
			if( Math.abs(num2-num1)==2) {
				sonGemelos=true;
			}
		}
		return sonGemelos;
	}
}
