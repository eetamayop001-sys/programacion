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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        dato= entrada.nextInt();     
        return dato;
    }
    
    public static void comprobar(int dato){
//iniciamos el bucle 
        while (dato < 0) {           
// Comprobamos si el número actual es impar

            if (dato < 0) {
                System.out.println("ERROR, NUMERO INVALIDO");
            }    
    }
    }
    public static int calcculos(int dato){
   
        int contador=0;
        
        for (int i = 1; i <= dato; i++) {

            // Comprueba si el número es múltiplo de 3
            if (i % 3 == 0) {
                System.out.println(i);
                // Aumenta el contador
                contador++;
            }
        }
        //muestra el total de múltiplos de 3 encontrados
        System.out.println("Total de numeros mostrados: " + contador);
        return dato;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         int dato = pedirNumero(); 

        
    }    
}
