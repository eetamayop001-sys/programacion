/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    /**
     * Metodo que comprueba si el numero introducido es postivio o negativo
     * @param num1 
     */
    public static void comprobarNumero(int num1){
        
        if (num1 > 0) {
            System.out.println("El número introducido es positivo");
       } else {
           System.out.println("El número introducido es negativo");
       }
    }
    
    
    public static void main(String[] args) {
        //pedimos el numero al usuario
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero:");
        int num1 = entrada.nextInt();
        //llamamos al metodo comprobarNumero de si es postivio o negativo y lo guardamos en una variable int resultado   
        comprobarNumero(num1);
        
    }
}
