package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Proporciona el valor de a:");
	int a = sc.nextInt();
	System.out.print("Proporciona el valor de b:");
	int b = sc.nextInt();
	sc.close();
	
	int paso1 = (a + b) * (a + b);
	int paso2 = 3 * b;
	double resultado = (double) paso1 / paso2;
	
	System.out.println("El resultado de la expresion es:"+resultado);
	
	}

}
