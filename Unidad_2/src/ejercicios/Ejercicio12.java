package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
	System.out.print("Proporciona la velocidad constante del automovil en kilometros: "); 
	double Velocidad = sc.nextDouble();
	System.out.print("Proporciona el tiempo que a recorrido el automovil en horas: ");
	double Tiempo = sc.nextDouble();
	sc.close();
	
	double Distancia = Tiempo * Velocidad;
	
	System.out.println("La distancia recorrida es de: "+Distancia+" Kilometros"); 
	
    }
}