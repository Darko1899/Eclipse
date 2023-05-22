package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Proporciona el valor de a: ");
	int A = sc.nextInt();
	System.out.print("Proporciona el valor de b: ");
	int B = sc.nextInt();
	sc.close();
	
	int ValorA = B;
	int ValorB = A;
	
	System.out.println("El valor de a: "+ValorA);
	System.out.println("El valor de b: "+ValorB);
  }
}
