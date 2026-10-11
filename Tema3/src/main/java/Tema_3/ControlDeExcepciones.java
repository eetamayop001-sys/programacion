/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ControlDeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        try{
         //pedir un dato conflictivo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad:");
//        int edad =entrada.nextInt();   //Variable local
        edad =entrada.nextInt();
         //MOSTRAR ESE DATO
         System.out.println("Tu edad es:"+edad);
        } catch(InputMismatchException e) {
            System.out.println("Dato no valido; debes de introducir un numero entero");
        } finally{
            System.out.println("Dato pedido al usuario");
        }
     
        
    }
    
}
