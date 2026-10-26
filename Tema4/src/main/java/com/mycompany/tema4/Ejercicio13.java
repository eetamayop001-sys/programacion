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
    
    /**
     * Metodo para pedirle un numero al usuario
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        return entrada.nextInt();
    }  
    
    /**
     * Metodo booleano para comprobar la contraseña 
     * @param numeroIngresado
     * @return 
     */
    
    public static boolean comprobar(int numeroIngresado){
         if (numeroIngresado > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Metodo para comprobar el resultado
     */
    
    public static void resultado(){
        int numeroIngresado;

        do {
            numeroIngresado = pedirNumero();

            if (comprobar(numeroIngresado)==false) {
                System.out.println("Error: debes introducir un numero mayor que 1.");
            }

        } while (comprobar(numeroIngresado)!=true);

        for (int i = 1; i <= numeroIngresado; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {    
//llamamos al metodo resultado
        resultado();

    }
    
}
//corregir el pedir numero desde el main y el bucle do while que se muestra en el resultado
//el metodo comprobar esta bien con su if y else