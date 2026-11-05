
package Tema4_Consolidacion;

import java.util.Scanner;

public class Ejercicio27 {

    // Método para pedir la elección al usuario
    public static String pedirEleccion() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Elige cara o cruz: ");
        return entrada.nextLine().toLowerCase();
    }

    // Método para lanzar la moneda y generar un resultado aleatorio
    public static String lanzarMoneda() {

        // Genera un número aleatorio entre 0 y 1
        int numero = (int) (Math.random() * 2);

        // Si el número es 0, sale cara; si es 1, sale cruz
        if (numero == 0) {
            return "cara";
        } else {
            return "cruz";
        }
    }

    // Método para comprobar si el usuario ha acertado
    public static boolean comprobar(String eleccion, String resultado) {

        if (eleccion.equals(resultado)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Variable para guardar la elección del usuario
        String eleccion;

        // Variable para guardar el resultado de la moneda
        String resultado;

        // Repetimos el lanzamiento hasta que el usuario acierte
        do {

            // Pedimos la elección al usuario
            eleccion = pedirEleccion();

            // Lanzamos la moneda
            resultado = lanzarMoneda();

            // Mostramos el resultado obtenido
            System.out.println("La moneda ha salido: " + resultado);

            // Comprobamos si el usuario ha acertado
            if (comprobar(eleccion, resultado)) {

                System.out.println("¡Enhorabuena! Has acertado.");

            } else {

                System.out.println("Has perdido. Inténtalo de nuevo.");

            }

        } while (comprobar(eleccion, resultado) != true);

    }
}
