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
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirPalabra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Intenta adivinar. Elige cara o cruz: ");
        return entrada.nextInt();   
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int palabra = pedirPalabra();
        
        double aleatorio =Math.floor(Math.random()*100+1);
          
          //comprobamos si el  numero es par o impar 
          if (aleatorio % 2 == 0) {
            System.out.println("El numero es:" +aleatorio); 
            System.out.println("Numero par");
          } else {                
            System.out.println("El numero es:" +aleatorio);  
            System.out.println("Numero impar");
          }
        
        
    }
    
}
