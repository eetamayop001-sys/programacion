/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;
import java.util.InputMismatchException;
import java.util.Scanner;

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
//creamos las variables
        int numero1;
        int numero2;
        
// Pedimos los dos números
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextInt();

        // Declaramos la variable para elegir la opción
        int opc =0;

        do {
       
            try {
                // Mostramos el menú
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Sumar los números");
                System.out.println("2. Restar los números");
                System.out.println("3. Multiplicar los números");
                System.out.println("4. Dividir los números");
                System.out.println("5. Salir del programa");
                System.out.print("Elige una opción: ");
                opc = entrada.nextInt();

                // Ejecutamos la operación elegida
                switch (opc) {
                    case 1 -> System.out.println("La suma es: " + (numero1 + numero2));

                    case 2 -> System.out.println("La resta es: " + (numero1 - numero2));

                    case 3 -> System.out.println("La multiplicación es: " + (numero1 * numero2));

//usamos un try catch por si se intenta dividir entre 0
                    case 4 -> {
                        try {
                            System.out.println("La división es: " + (numero1 / numero2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                    }

                    case 5 -> System.out.println("Gracias por usar nuestro programa");

                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un número del menú.");
                entrada.next(); //se encaraga de limpiar un numero que no es entero; limpiar el buffer
            }

        } while (opc != 5);
    }
}
        

