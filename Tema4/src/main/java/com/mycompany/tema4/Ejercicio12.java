/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema4;

import static com.mycompany.tema4.Ejercicio10.pedirNumero;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */

    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        return entrada.nextInt();          
    }    
    
    public static void comprobar(int clave){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos al metodo pedir numero
        int num1 = pedirNumero();  
        
    }
    
}
