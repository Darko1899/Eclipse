package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Ingrese el numero de respuestas correctas: ");
	int correctas = sc.nextInt();
	System.out.print("Ingrese el numero de respuestas incorrectas: ");
	int incorrectas = sc.nextInt();
	System.out.print("Ingrese el numero de respuestas en blanco: ");
	sc.nextInt();
	sc.close();
	
	int Puntaje = (correctas*4) + (incorrectas*-1);
	
	System.out.print("El puntaje final de calificacion es: "+Puntaje);
	}

}
