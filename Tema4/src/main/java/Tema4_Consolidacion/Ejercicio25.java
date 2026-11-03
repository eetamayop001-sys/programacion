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
    
        // Método que calcula la potencia
    public static double calcularPotencia(int a, int b) {
        return Math.pow(a, b);  
    }
     
    
    public static void main(String[] args) {
        // llama al metodo 
        Scanner entrada = new Scanner(System.in);

        // Pedimos la base
        System.out.print("Introduce la base: ");
        int a = entrada.nextInt();

        // Pedimos el exponente
        System.out.print("Introduce el exponente: ");
        int b = entrada.nextInt();

        // Comprobamos si la base es 0 y el exponente negativo
        if (a == 0 && b < 0) {
            System.out.println("Error: el resultado es infinito.");
        } else {

            // Calculamos la potencia
            double resultado = calcularPotencia(a, b);

            // Mostramos el resultado
            System.out.println("El resultado es: " + resultado);
        }
    }
}
