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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNombre (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, digite su nombre: ");
        return entrada.nextInt();          
    }
    
    
    public static int pedirEdad (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        return entrada.nextInt();          
    }
    
    public static boolean mayorEdad(int edad){
        
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
        
      
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int nombre = pedirNombre();
        int edad = pedirEdad();
      
       if(mayorEdad(edad)==false){
            System.out.println( nombre + " no es mayor de edad");
       }else if(mayorEdad(edad)==true ){
           System.out.println( nombre + " es mayor de edad");
           
       }
 

    }
    
}
