/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4;

/**
 *
 * @author alumno
 */
public class Funcion4 {
    public static void operacion (int num1, int num2, int num3) {
   
       if (num1 < num2 && num1<num3) {
           int resultado = num1;
           System.out.println("El nùmero mayor de los introducidos es el:  " + resultado);
           
        }else if (num2 < num3 && num2<num1) {
           int resultado = num2;
         System.out.println("El nùmero mayor de los introducidos es el: " + resultado);  
       } else {
            int resultado =num3;
           System.out.println("El nùmero menor de los introducidos es el:  " + resultado);
        }
    }

    static void funcion(int num1, int num2, int num3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
