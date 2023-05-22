package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Proporciona el valor de base: ");
    double base = sc.nextDouble();
    System.out.print("Proporciona el valor de altura: ");
    double altura = sc.nextDouble();
    sc.close();
    
    double perimetro = 2*(altura+base);
    double superficie = altura*base;
    
    System.out.println("El valor del perimetro es: "+perimetro);
    System.out.println("El valor de la superficie es: "+superficie);
    
	}

}
