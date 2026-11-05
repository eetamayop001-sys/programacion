
package Tema4_Consolidacion;

import java.util.Scanner;

public class Ejercicio25 {

    // Método que calcula la potencia de una base elevada a un exponente
    public static double calcularPotencia(double a, int b) {

        // Comprobamos si la base es 0 y el exponente es negativo
        if (a == 0 && b < 0) {

            // Mostramos un mensaje indicando que el resultado es infinito
            System.out.println("El resultado es infinito");

            return 0;

        } else {

            // Calculamos la potencia utilizando Math.pow()
            double elevarExponente = Math.pow(a, b);

            // Devolvemos el resultado de la potencia
            return elevarExponente;
        }
    }

    public static void main(String[] args) {

        // Creamos el Scanner para leer los datos
        Scanner entrada = new Scanner(System.in);

        // Pedimos la base al usuario
        System.out.print("Introduzca la base: ");
        double a = entrada.nextDouble();

        // Pedimos el exponente al usuario
        System.out.print("Introduzca el exponente: ");
        int b = entrada.nextInt();

        // Llamamos al método para calcular la potencia
        double resultado = calcularPotencia(a, b);

        // Mostramos el resultado cuando no se trata del caso especial
        if (a != 0 || b >= 0) {
            System.out.println("El resultado de la potencia es: " + resultado);
        }

    }
}
