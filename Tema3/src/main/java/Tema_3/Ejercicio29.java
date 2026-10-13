/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos las variables       
        int numeroIngresado;  
              
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero:");
        numeroIngresado =entrada.nextInt();    
        
        double aleatorio =(Math.random()*100+1);
        aleatorio =Math.floor(aleatorio);
        int aleatorioEntero = (int) aleatorio;
        
        do{
            // Comprobamos si el número actual es par
            if (aleatorio > numeroIngresado) {
            System.out.print("¡Cerca! El numero a adivinar es mayor");
             } else if (aleatorio < numeroIngresado) {                
             System.out.println(aleatorio + "-numero impar" );                  
          }
            }
            // se incrementara el numero
            numeroIngresado++;  
        }while();        
    }
}
  