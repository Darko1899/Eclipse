package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Proporciona el valor de a: ");
	int a = sc.nextInt();
	System.out.print("Proporciona el valor de b: ");
	int b = sc.nextInt();
	System.out.print("Proporciona el valor de c: ");
	int c = sc.nextInt();
	System.out.print("Proporciona el valor de d: ");
	int d = sc.nextInt();
	System.out.print("Proporciona el valor de e: ");
	int e = sc.nextInt();
	sc.close();
	
	int Resultado = a*(b+c)+c* (d+e);
	
	System.out.println("El valor de la expresion es: "+Resultado);
	

	}

}
