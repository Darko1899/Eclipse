package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sumar(num1, num2);
		restar(num1, num2);
		multiplicar(num1, num2);
		dividir(num1, num2);
		residuo(num1, num2);
		sc.close();
		
	}
    
	public static void sumar(double a, double b) {
		double resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	public static void restar(double a, double b) {
		double resultado = a - b;
		System.out.println("La resta es: "+resultado);
	}
	
	public static void multiplicar(double a, double b){
		double resultado = a*b;
		System.out.println("La multiplicacion es: "+resultado);
	}
	
	public static void dividir(double a, double b){
		if (b == 0 ){
		System.out.println("Error: division por cero");
		} else {
			double resultado = a / b;
			System.out.println("La division es: "+resultado);					
		}
	}
	
	public static void residuo(double a, double b){
		double resultado = a%b;
		System.out.println("El residuo es: "+resultado);
	}
}
