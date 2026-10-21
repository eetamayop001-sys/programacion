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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        return entrada.nextInt();
    }  
    
    public static boolean comprobar(){
        int numeroIngresado;
        //usamos while 
        
        while(numeroIngresado <1){       
            //usamos un if para que aparezca el mensaje de error si el usuario ingresa un numero menor que 1 
            if(numeroIngresado <1){
               System.out.println("ERROR, NUMERO INVALIDO  ");
            } 
        }        
     
        //Usamos for porque sabemos desde donde empieza si el usuario ingresa un numero mayor a 1
        for(int i=1; i<numeroIngresado; i++){
        System.out.println(i);         
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = pedirNumero(); 
        boolean resultado = comprobar(numeroIngresado);


    }
    
}
