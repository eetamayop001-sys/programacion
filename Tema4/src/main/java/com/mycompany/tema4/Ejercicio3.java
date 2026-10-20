/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4;


import java.util.Scanner;
import operacion.Operacion3;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    
    
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num1;
       System.out.println("Por favor, introduzca un numero: ");
       num1 = entrada.nextInt();
       
       int num2;
       System.out.println("Ahora, introduzca un segundo numero: ");
       num2 = entrada.nextInt();
       
        int num3;
       System.out.println("Por ultimo, introduzca un tercer numero: ");
       num3 = entrada.nextInt(); 
      
       Operacion3.Operacion(num1, num2, num3);
     }
    
}
    