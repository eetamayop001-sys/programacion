/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema4;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        return entrada.nextInt();
    }  
    
    public static boolean comprobar(int numeroIngresado){
         if (numeroIngresado > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void resultado(){
        int numeroIngresado;

        do {
            numeroIngresado = pedirNumero();

            if (comprobar(numeroIngresado)==false) {
                System.out.println("Error: debes introducir un numero mayor que 1.");
            }

        } while (comprobar(numeroIngresado) !=true);

        for (int i = 1; i <= numeroIngresado; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        resultado();

    }
    
}
