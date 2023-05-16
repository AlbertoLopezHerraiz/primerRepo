package ejercicio3;

import java.util.Scanner;

public class Ejercicio3Corregido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos = 20;
		int[][] matriz = new int[alumnos][3];
		String mensaje = "Introduce notas";
		String[] nombresTrimestres = { "primer trimestre", "segundo trimestre", "tercer trimestre" };
		pedirNotas(matriz, mensaje, nombresTrimestres, sc);
		System.out.println();
		mostrarNotas(matriz, nombresTrimestres);
		System.out.println();
		int numeroAlumno = pedirAlumno(sc, alumnos) - 1;
		System.out.printf(
				"La media del alumno %d es: %.2f \n" ,(numeroAlumno + 1), calcularMediaAlumno(matriz, numeroAlumno));
	}

	public static void pedirNotas(int[][] matriz, String mensaje, String[] nombresTrimestre, Scanner sc) {
		System.out.println(mensaje);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				do {
					System.out.print("Nota del alumno " + (i + 1) + " en el " + nombresTrimestre[j] + ": ");
					matriz[i][j] = Integer.parseInt(sc.nextLine());
					System.out.println();
				} while (matriz[i][j] < 0 || matriz[i][j] > 10);

			}
		}
	}

	public static void mostrarNotas(int[][] matriz, String[] nombresTrimestres) {
		System.out.print("           ");
		for (int i = 0; i < nombresTrimestres.length; i++) {
			System.out.print(nombresTrimestres[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Alumno " + (i + 1) + " : ");
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + "                 ");
			}
			System.out.println();
		}
	}

	public static int pedirAlumno(Scanner sc, int num) {
		int alumno;
		System.out.print("Introduzca un alumno (1-" + num + "): ");
		alumno = Integer.parseInt(sc.next());
		while (alumno > num || alumno <= 0) {
			System.out.print("Introduzca un alumno (1-" + num + "): ");
			alumno = Integer.parseInt(sc.next());
		}
		return alumno;
	}

	public static double calcularMediaAlumno(int[][] matriz, int numAlumno) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == numAlumno) {
					suma = suma + matriz[i][j];
				}
			}
			
			media = suma / matriz[numAlumno].length;
		}

		return media;
	}
}
