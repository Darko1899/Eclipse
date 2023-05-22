package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();
        
        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();
        sc.close();
        double areaLateral = 2.0 * Math.PI * radio * altura;
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
