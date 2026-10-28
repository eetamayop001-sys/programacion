package com.mycompany.tema4;

import java.util.Scanner;

public class Ejercicio17 {

    /**
     * Metodo que pide al usuario una letra
     * @return letra
     */
    public static char pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Generamos la letra aleatoria
        char letraAleatoria = (char) (Math.random() * 26 + 97);

        // Contamos los intentos
        int intentos = 0;
        char letra;

        do {
            // Pedimos una letra al usuario
            letra = pedirLetra();
            intentos++;

            // Comparamos las letras
            if (letra < letraAleatoria) {
                System.out.println("La letra buscada está después.");
            } else if (letra > letraAleatoria) {
                System.out.println("La letra buscada está antes.");
            }

        } while (letra != letraAleatoria);

        // Mostramos el resultado
        System.out.println("¡Correcto! Has adivinado la letra.");
        System.out.println("Intentos realizados: " + intentos);
    }
}