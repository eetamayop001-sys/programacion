/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author Usuario
 */
public class Ejercicio30 {

    public static void main(String[] args) {

        // Creamos las variables
        int numeroIngresado = 0;
        int intentos = 0;

        // Generamos un número aleatorio entre 1 y 100
        double aleatorio = (Math.random() * 100 + 1);
        aleatorio = Math.floor(aleatorio);
        //Convertimos el número decimal en entero
        int aleatorioEntero = (int) aleatorio;

        Scanner entrada = new Scanner(System.in);

        // Repetimos la petición de número hasta que el usuario lo adivine
        do {
            System.out.print("Introduce un número (entre 1 y 100): ");
             intentos++;
            try {
                numeroIngresado = entrada.nextInt();

                // Comprobamos si el número a adivinar es mayor
                if (aleatorioEntero > numeroIngresado) {
                    System.out.println("¡Casi! El número que tienes que adivinar es MAYOR.");

                // Comprobamos si el número a adivinar es menor
                } else if (aleatorioEntero < numeroIngresado) {
                    System.out.println("¡Casi! El número que tienes que adivinar es MENOR.");

                // Si no es ni mayor ni menor, el usuario ha acertado
                } else {
                    System.out.println("¡Enhorabuena! ¡Has acertado!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Has introducido un valor no válido (debes introducir un número entero).");   
                entrada.next(); //se encaraga de limpiar un numero que no es entero; limpiar el buffer
            }
                   
        }while (numeroIngresado != aleatorioEntero);
       
        System.out.println("Número de intentos utilizados: " + intentos);
    }
}

