/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
     
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Scanner entrada = new Scanner(System.in);
       int num1;
       System.out.println("Por favor, introduzca un numero: ");
       num1 = entrada.nextInt();
       
       int num2;
       System.out.println("Ahora, introduzca un segundo numero: ");
       num2 = entrada.nextInt();
       
       if (num1 > 10) {
            Operaciones.multiplicar(num1, num2);
        } else {
            Operaciones.sumar(num1, num2);
        }
    }
}
