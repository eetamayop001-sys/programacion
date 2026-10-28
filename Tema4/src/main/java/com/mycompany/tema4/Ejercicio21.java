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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return entrada.nextInt();          
    }
    
    public static boolean comprobar(int num1, int num2){
         if (num1 < num2) {
            return true;
        } else {
            return false;
        }
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int suma = 0;

        do {

            if (comprobar(num1, num2)==false) {
                System.out.println("Error: debes introducir un numero mayor .");
                entrada.next();
            }
            
        } while (comprobar(num1, num2)!=true);

        for (int i = num1; i >= num2; i++) {
            System.out.println(i);
        }
       
        //muestra el resultado
        System.out.println("La suma total de los numeros es:" + suma);               
    }
    
}
