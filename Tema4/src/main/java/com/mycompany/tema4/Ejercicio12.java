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
        System.out.print("Por favor, introduzca su contraseña: ");
        return entrada.nextInt();          
    }    
    
    public static boolean comprobar(){
        int contraseña;
        int numero = 1234;
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        do {
            System.out.print("Por favor, introduzca su contraseña: ");
            contraseña = entrada.nextInt();

            if (contraseña == numero) {
                System.out.println("Enhorabuena, tu acceso ha sido concedido");
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta");
            }
            //numeros de intentos
        } while (contraseña != numero && intentos < 3);
        if (contraseña == numero) {
            System.out.println("Error de acceso. Has superado los 3 intentos.");
        }
        return false;
    }
    /**
     *
     * @param contraseña
     * @param numero
     * @param intentos
     */
    public static void resultadoComprobacion(int contraseña, int numero, int intentos){
        comprobar();
        comprobar();
        comprobar();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos al metodo pedir numero
        int num1 = pedirNumero(); 
        
//llamo al metodo
       int contraseña; 
       int intentos;
       int numero=1234;
       boolean resultado = comprobar();
    }
    
}
//corregir 