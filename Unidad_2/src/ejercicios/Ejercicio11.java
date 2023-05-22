package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Proporciona el valor de a:");
	int a = sc.nextInt();
	System.out.print("Proporciona el valor de b:");
	int b = sc.nextInt();
	System.out.print("Proporciona el valor de c:");
	int c = sc.nextInt();
	System.out.print("Proporciona el valor de d:");
	int d = sc.nextInt();
	sc.close();
	a *= 10;
	b *= 10;
	c *= 10;
	d *= 10;
	
	System.out.println("el valor de a multiplicado por 10 es de: " +a);
	System.out.println("El valor de b multiplicado por 10 es de: " +b);
	System.out.println("El valor de c multiplicado por 10 es de: " +c);
	System.out.println("El valor de d multiplicado por 10 es de: " +d);
			
    }
}
