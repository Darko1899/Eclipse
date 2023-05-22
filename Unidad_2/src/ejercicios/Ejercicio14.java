package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Proporciona la calificacion de la primer nota:");
	double nota1 = sc.nextDouble();
	System.out.print("Proporciona la calificacion de la segunda nota:");
	double nota2 = sc.nextDouble();
	System.out.print("Proporciona la calificacion de la tercera nota:");
	double nota3 = sc.nextDouble();
	sc.close();
	
	double Promedio = (nota1+nota2+nota3)/3.0;
	
	System.out.println("El promedio de las 3 notas es de: "+Promedio);
	}

}
