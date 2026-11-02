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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    
   // Método que comprueba si un número es primo
    public static boolean esPrimo(int numero) {

        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Comprobamos si tiene algún divisor desde el 2
        for (int i = 2; i < numero; i++) {

            // Si el resto es 0, significa que tiene otro divisor
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no encontramos divisores, el número es primo
        return true;
    }

    public static void main(String[] args) {

        // Creamos el Scanner para leer el número
        Scanner entrada = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduzca un numero: ");
        int numero = entrada.nextInt();

        // Comprobamos si el número es primo
        if (esPrimo(numero)) {

            System.out.println("El numero " + numero + " es primo.");

        } else {

            System.out.println("El numero " + numero + " no es primo.");

        }
    }
}
