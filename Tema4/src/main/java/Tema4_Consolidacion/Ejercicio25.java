/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4_Consolidacion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    
     public static double calcularPotencia(double a, double b) {

        //comprueba si la base es cero y el exponente negativo
         if (a == 0 && b < 0) {
            System.out.println("El resultado es infinito");
            return 0;
        } else {
           //calculamos la potnecia con el metodo Math
            double elevarExponente = Math.pow(a, b);
            //devuelve el resultado de la potencia
            return elevarExponente;
        }
    }
     
    
    public static void main(String[] args) {
        // llama al metodo 
    Scanner scanner = new Scanner(System.in);

        // Pedimos la base como número entero
        System.out.print("Introduce el número base (a): ");
        int a = scanner.nextInt();

        // Pedimos el exponente como número entero
        System.out.print("Introduce el exponente (b): ");
        int b = scanner.nextInt();
        
    double resultado = calcularPotencia(a, b);
    System.out.println("El resultado de la potencia es: " + resultado);
    }
    
}
