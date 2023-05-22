package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la longitud del cateto adyacente: ");
        double catetoAdyacente = sc.nextDouble();
        
        System.out.print("Introduce la longitud del cateto opuesto: ");
        double catetoOpuesto = sc.nextDouble();
        sc.close();
        double hipotenusa = Math.sqrt(Math.pow(catetoAdyacente, 2) + Math.pow(catetoOpuesto, 2));
        double angulo1 = Math.toDegrees(Math.atan(catetoOpuesto / catetoAdyacente));
        double angulo2 = 90.0 - angulo1;
        
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
        System.out.println("Los ángulos agudos del triángulo son: " + angulo1 + " grados y " + angulo2 + " grados");
    }
}