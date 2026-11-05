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
    
    // Metodo para comprobar si un numero es primo
    public static boolean esPrimo(int numero) {

        boolean primo = true;
        int divisor = 2;

        if (numero <= 1) {
            primo = false;
        } else {

            while (divisor < numero && primo) {

                if (numero % divisor == 0) {
                    primo = false;
                }

                divisor++;
            }
        }
        return primo;
    }

    // Metodo principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = entrada.nextInt();

        boolean resultado = esPrimo(numero);

        if (resultado) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " no es primo.");
        }
    }
}
