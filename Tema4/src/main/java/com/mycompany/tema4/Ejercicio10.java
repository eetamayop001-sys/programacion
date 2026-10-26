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
public class Ejercicio10 {

    /**
     * Metodo para pedirle el numero al usuario
     * @return 
     */
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        return entrada.nextInt();          
    }
    
    /**
     * Metodo para realizar la tabla de multiplicar
     * @param num1 
     */
    
    public static void tablaMultiplicar(int num1){
     // Calculamos e imprimimos la tabla 
        for (int i = 0; i <= 12; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        } 
    }
                
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos al metodo pedir numero
        int num1 = pedirNumero();
        
        //llamamos al metodo para la tabla de multiplicar
        tablaMultiplicar(num1);
    }
    
}
