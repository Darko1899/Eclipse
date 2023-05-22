package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero de tres dígitos: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero de tres dígitos: ");
        int num2 = sc.nextInt();
        sc.close();
        
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;
        
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
        System.out.println("El cociente de " + num1 + " entre " + num2 + " es: " + cociente);
        System.out.println("El resto de " + num1 + " entre " + num2 + " es: " + resto);
    }
}