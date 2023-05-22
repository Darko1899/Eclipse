package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Ingrese el numero de partidos ganados: ");
	int ganados = sc.nextInt();
	System.out.print("Ingrese el numero de partidos empatados: ");
	int empatados = sc.nextInt();
	System.out.print("Ingrese el numero de partidos perdidos: ");
	sc.nextInt();
	sc.close();
	
	int Puntaje_total = (ganados*3) + empatados;
	
	System.out.println("El puntuaje total del equipo es: "+ Puntaje_total);
	

	}

}
