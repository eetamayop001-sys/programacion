/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema04_TiposMetodosBoolean;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    
    // Metodo para pedir el numero
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero mayor que 0: ");
        return entrada.nextInt();
    }

    // Metodo para comprobar que el numero sea mayor que 0
    public static int comprobarNumero(int numero) {

        do {
            if (numero <= 0) {
                System.out.println("ERROR: El numero debe ser mayor que 0.");
                numero = pedirNumero();
            }

        } while (numero <= 0);

        return numero;
    }

    // Metodo para calcular y mostrar los multiplos de 3
    public static void mostrarMultiplos(int numero) {

        int contador = 0;

        System.out.println("Los multiplos de 3 entre 1 y " + numero + " son:");

        for (int i = 1; i <= numero; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de numeros mostrados: " + contador);
    }

    // Metodo principal
    public static void main(String[] args) {

        int numero = pedirNumero();

        numero = comprobarNumero(numero);

        mostrarMultiplos(numero);

    }
}
   