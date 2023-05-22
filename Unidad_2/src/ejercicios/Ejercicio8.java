package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Proporciona el valor de a:" );
	double a = sc.nextDouble();
	System.out.print("Proporciona el valor de b:" );
	double b = sc.nextDouble();
	System.out.print("Proporciona el valor de c:" );
	double c = sc.nextDouble();
	System.out.print("Proporciona el valor de y:" );
	double y = sc.nextDouble();
	System.out.print("Proporciona el valor de h:" );
	double h = sc.nextDouble();
	sc.close();
	
	double Resultado = ((a % 2)/b)-(c*a*y)+(18/c)-(3*h);
	
	System.out.println("El valor de la operacion final es de "+Resultado);
	
	}

}
