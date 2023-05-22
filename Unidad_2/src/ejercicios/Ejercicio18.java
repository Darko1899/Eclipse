package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Proporciona un numero: ");
    int numero = sc.nextInt();
    sc.close();
    
    int cuadrado = numero*numero;
    int cubo = numero*numero*numero;
    int quinta = numero*numero*numero*numero*numero;

    System.out.println("El numero proporcionado al cuadrado equivale a: "+cuadrado);
    System.out.println("El numero proporcionado al cubo equivale a: "+cubo);
    System.out.println("El numero proporcionado a la quinta equivale a: "+quinta);
	}

}
