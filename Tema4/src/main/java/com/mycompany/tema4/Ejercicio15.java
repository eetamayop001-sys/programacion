/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema4;

/**
 *
 * @author Usuario
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {

    // Metodo para pedir un numero
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        return entrada.nextInt();
    }

    // Metodo para mostrar el menu
    public static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Sumar los numeros");
        System.out.println("2. Restar los numeros");
        System.out.println("3. Multiplicar los numeros");
        System.out.println("4. Dividir los numeros");
        System.out.println("5. Salir del programa");
        System.out.print("Elige una opcion: ");
    }

    // Metodo para sumar
    public static void sumar(int numero1, int numero2) {
        System.out.println("La suma es: " + (numero1 + numero2));
    }

    // Metodo para restar
    public static void restar(int numero1, int numero2) {
        System.out.println("La resta es: " + (numero1 - numero2));
    }

    // Metodo para multiplicar
    public static void multiplicar(int numero1, int numero2) {
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
    }

    // Metodo para dividir
    public static void dividir(int numero1, int numero2) {
        try {
            System.out.println("La division es: " + (numero1 / numero2));
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }

    // Metodo para ejecutar la opcion elegida
    public static void ejecutarOpcion(int opc, int numero1, int numero2) {
        switch (opc) {
            case 1 -> sumar(numero1, numero2);
            case 2 -> restar(numero1, numero2);
            case 3 -> multiplicar(numero1, numero2);
            case 4 -> dividir(numero1, numero2);
            case 5 -> System.out.println("Gracias por usar nuestro programa");
            default -> System.out.println("Error: selecciona una opcion del 1 al 5.");
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedimos los dos numeros al usuario
        int numero1 = pedirNumero();
        int numero2 = pedirNumero();

        // Declaramos la variable para elegir la opcion
        int opc = 0;

        do {
            try {
                // Mostramos el menu
                mostrarMenu();

                // Leemos la opcion elegida
                opc = entrada.nextInt();

                // Ejecutamos la operacion seleccionada
                ejecutarOpcion(opc, numero1, numero2);

            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un numero entero.");
                entrada.next();
            }

        } while (opc != 5);
    }
}
//se usò un do while, en mostrar menu 