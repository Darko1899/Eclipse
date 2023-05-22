package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Introduce la medida en pies: ");
        double pies = sc.nextDouble();
        sc.close();
        
        double yardas = pies / 3.0;
        double pulgadas = pies * 12.0;
        double centimetros = pulgadas * 2.54;
        double metros = centimetros / 100.0;
        
        
        System.out.println(pies + " pies son equivalentes a:");
        System.out.println(yardas + " yardas");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(centimetros + " centímetros");
        System.out.println(metros + " metros");
    }
}