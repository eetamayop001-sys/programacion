/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int numeroIngresado;
        int contador = 0; 

        do {
            // Solicita un número al usuario
            System.out.println("Introduzca un numero mayor que 0:");
            numeroIngresado = entrada.nextInt();

            // Comprueba si el número es inválido
            if (numeroIngresado <= 0) {
                System.out.println("ERROR, NUMERO INVALIDO");
            }
        } while (numeroIngresado <= 0); 
        // Recorre los números desde 1 hasta el número introducido
        for (int i = 1; i <= numeroIngresado; i++) {

            // Comprueba si el número es múltiplo de 3
            if (i % 3 == 0) {
                System.out.println(i);
                // Aumenta el contador
                contador++;
            }
        }
        //muestra el total de múltiplos de 3 encontrados
        System.out.println("Total de numeros mostrados: " + contador);
    }
}
  
