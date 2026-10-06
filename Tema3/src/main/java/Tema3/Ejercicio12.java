/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //do while
        int numero = 11;

        do {
            // Comprobamos si el número actual es par
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++; 
        } while (numero < 133);                
    }
    
}
