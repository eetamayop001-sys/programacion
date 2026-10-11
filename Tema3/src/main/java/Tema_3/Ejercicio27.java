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
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        //MENUS

        // Declaramos las variables
        int opc = 0; // Guarda la opción elegida en el menú
        double numero1; // Guarda el primer número
        double numero2; // Guarda el segundo número

        Scanner entrada = new Scanner(System.in); // Lee los datos del usuario

        // Pedimos los dos números
        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextDouble();

        // Repetimos el menú mientras la opción no sea 5
        do {
            try {
                // Mostramos el menú
                System.out.println("--- MENÚ ---");
                System.out.println("1. Sumar los números");
                System.out.println("2. Restar los números");
                System.out.println("3. Multiplicar los números");
                System.out.println("4. Dividir los números");
                System.out.println("5. Salir del programa");

                // Pedimos la opción al usuario
                System.out.print("Elija una opción: ");
                opc = entrada.nextInt();

                // Ejecutamos la operación elegida
                switch (opc) {

                    case 1:
                        // Sumamos los números
                        System.out.println("Resultado: " + (numero1 + numero2));
                        break;

                    case 2:
                        // Restamos los números
                        System.out.println("Resultado: " + (numero1 - numero2));
                        break;

                    case 3:
                        // Multiplicamos los números
                        System.out.println("Resultado: " + (numero1 * numero2));
                        break;

                    case 4:
                    try {
        // Comprobamos si el divisor es cero
                    if (numero2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                    } else {
            // Realizamos la división
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
                } catch (ArithmeticException e) {
        // Mostramos el mensaje si ocurre un error aritmético
                System.out.println("Error al realizar la división");
                }
                break;

                    case 5:
                        // Mensaje de salida
                        System.out.println("Gracias por usar nuestro programa");
                        break;

                    default:
                        // Si la opción no está entre 1 y 5
                        System.out.println("Opción no válida. Elige un número del 1 al 5.");
                        break;
                }

            } catch (InputMismatchException e) {
                // Controlamos si el usuario introduce texto en lugar de un entero
                System.out.println("Dato no válido: debes introducir un número entero.");

                // Limpiamos el dato incorrecto del Scanner
                entrada.nextLine();

                // Evitamos que el programa salga del bucle por un dato incorrecto
                opc = 0;
            }

        } while (opc != 5); // Repetimos hasta que el usuario elija salir
    }
}