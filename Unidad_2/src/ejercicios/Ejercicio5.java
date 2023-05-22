package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double G = 6.673e-8; 
        
        System.out.print("Introduce la masa 1 en gramos: ");
        double masa1 = sc.nextDouble();
        
        System.out.print("Introduce la masa 2 en gramos: ");
        double masa2 = sc.nextDouble();
        
        System.out.print("Introduce la distancia entre las masas en centímetros: ");
        double distancia = sc.nextDouble();
        sc.close();
        
        double fuerza = G * masa1 * masa2 / Math.pow(distancia, 2);
        double fuerza_en_dinas = fuerza * 1000; 
        
        System.out.println("La fuerza de atracción gravitatoria entre las masas es: " + fuerza_en_dinas + " dinas");
    }
}