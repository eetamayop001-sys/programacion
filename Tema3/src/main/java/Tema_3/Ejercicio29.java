/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author Usuario
 */



import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        // Creamos las variables
        int numeroIngresado = 0;
        int intentos = 0;

        // Generamos un número aleatorio entre 1 y 100
        double aleatorio = Math.random() * 100 + 1;
        aleatorio = Math.floor(aleatorio);
        // Convertimos el número decimal en entero
        int aleatorioEntero = (int) aleatorio;

        Scanner entrada = new Scanner(System.in);


        do {
            System.out.print("Introduce un número: ");
            numeroIngresado = entrada.nextInt();
            intentos++;
               
                // Comprobamos si el número aleatorio es mayor
                if (aleatorioEntero > numeroIngresado) {
                    System.out.println("¡Casi! El número a adivinar es mayor");

                // Comprobamos si el número aleatorio es menor
                } else if (aleatorioEntero < numeroIngresado) {
                    System.out.println("¡Casi! El número a adivinar es menor");

                // Si no es mayor ni menor, el usuario ha acertado
                } else {
                    System.out.println("¡Has acertado!");
                }

        // Repetimos mientras el número introducido sea distinto del aleatorio
        } while (numeroIngresado != aleatorioEntero);

        System.out.println("Número de intentos: " + intentos);
    }
}
