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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int num1, num2, resultadoDivision;       
        try{
            
//pedir el primer numero
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero:");
        num1 =entrada.nextInt();       
//pedir el segundo numero
        System.out.print("Introduzca un segundo numero:");
        num2 =entrada.nextInt();
//SE REALIZA LA SUMA DE LOS DOS NUMEROS INTRODUCIDOS           
        resultadoDivision = num1/num2;
//MOSTRAR EL RESULTADO
         System.out.println("Tu division es:"+resultadoDivision);
        } catch(ArithmeticException e){
//MUESTRA EL MENSASJE DE ERROR
            System.out.println("ERROR"+ e.getMessage()); 
            resultadoDivision=0;
        }
        
    }
    
}
