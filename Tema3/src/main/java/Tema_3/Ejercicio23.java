/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //do while
        int numero1 = 1 ;
        int numero2;
        int cantidad= 0;
        
        try{
        System.out.print("Introduzca un numero:");
        numero2 =entrada.nextInt();      
        System.out.print("Introduzca un segundo numero:");
        numero2 =entrada.nextInt();          
        do {
            System.out.println("Los numeros existentes son los siguientes" +numero2);// Comprobamos si el número iingresado es mayor
            cantidad++;
            numero2++; 
        } while (numero2 < 1);
        } catch(InputMismatchException e){
//MUESTRA EL MENSASJE DE ERROR
            System.out.println("ERROR; DEBES DE SELECCIONAR UN NUMERO ENTERO");  
        }
    }
    
}
        

    