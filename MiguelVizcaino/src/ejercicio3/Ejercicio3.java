package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	final static int ALUMNOS = 20;

	public static void main(String[] args) {

		String[] nombresTrimestres = { "primer trimestre", "segundo trimestre", " tercer trimestre" };
		int[][] matriz = new int[ALUMNOS][nombresTrimestres.length];
		Scanner sc = new Scanner(System.in);
		String mensaje = "Introduce notas:";
		pedirNotas(matriz, mensaje, nombresTrimestres, sc);
		mostrarNotas(matriz, nombresTrimestres);
		int numA = (pedirAlumno(sc, ALUMNOS));
		System.out.println("La media del alumno " + (numA + 1) + " es: " + calcularMediaAlumno(matriz, numA));
		sc.close();
	}

	public static void pedirNotas(int[][] matriz, String mensaje, String[] nombresTrimestres, Scanner sc) {
		System.out.println(mensaje);
		int n;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				do {
				System.out.print("Alumno("+(i+1)+") en el " + nombresTrimestres[j] + ": ");
				n= Integer.parseInt(sc.nextLine());
				matriz[i][j] = n;
				}while(n<0||n>10);
				System.out.println();
			}
		}

	}

	public static void mostrarNotas(int[][] matriz, String[] nombresTrimestres) {
		System.out.print("                     ");
		for (int a = 0; a < nombresTrimestres.length; a++) {
			System.out.print(nombresTrimestres[a] + "  ");
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			System.out.print("Notas del alumno " + (i + 1) + "   ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "                 ");
			}
		}
		System.out.println();
	}

	public static int pedirAlumno(Scanner sc, int num) {
		int n;
		System.out.println();
		do {
			System.out.print("Introduzca un alumno (de 1 a " + num + "): ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0 || n > num);
		return (n - 1);
	}

	public static double calcularMediaAlumno(int[][] matriz, int numAlumno) {
		double media, suma = 0;
		for (int i = 0; i < 3; i++) {
			suma += matriz[numAlumno][i];
		}
		media = suma / 3;
		return media;
	}
}
