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
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero: "); 
        return entrada.nextInt();
    }
    
    /**
     * Metodo para comprobar que el numero sea mayor que 0
     * @param 
     */
    
    public static int comprobar(int numeroIngresado){
        if (numeroIngresado > 0) {
            return numeroIngresado;
        } else {
            System.out.println("ERROR, NUMERO INVALIDO");
            return 0;
        }
    }
    
    /**
     * Metodo para comprobar el resultado
     */
    
    public static void resultado(){
   
        int numeroIngresado;

        do {
            numeroIngresado = pedirNumero();
            numeroIngresado = comprobar(numeroIngresado);
        } while (numeroIngresado == 0);

        int contador = 0;

        for (int i = 1; i <= numeroIngresado; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de numeros mostrados: " + contador);
    }
    
    
    public static void main(String[] args) {
        // //llamamos al metodo resultado
        resultado(); 

        
    }    
}

//corregir el pedir numero desde el main y el bucle do while que se muestra en el resultado
//arreglar el main, ahi debe de ir 
//