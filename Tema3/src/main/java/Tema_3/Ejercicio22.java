/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos las variables
        int num1, num2, resultadoSuma;       
        try{
            
//pedir el primer numero
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero:");
        num1 =entrada.nextInt();       
//pedir el segundo numero
        System.out.print("Introduzca un segundo numero:");
        num2 =entrada.nextInt();
//SE REALIZA LA SUMA DE LOS DOS NUMEROS INTRODUCIDOS           
        resultadoSuma = num1 +num2;
//MOSTRAR EL RESULTADO
         System.out.println("Tu suma es:"+resultadoSuma);
        } catch(InputMismatchException e){
//MUESTRA EL MENSASJE DE ERROR
            System.out.println("ERROR; DEBES DE SELECCIONAR UN NUMERO ENTERO");            
        }
        
    }
    
}
