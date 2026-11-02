/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4_Consolidacion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * Metodo para pedir un numero al usuario
     */
    
    public static int pedirNumero (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        return entrada.nextInt();          
    }
    
    /**
     * Metodo para comprobar que el segundo numero sea mayor que el primero
     * @param num1
     * @param num2
     * @return 
     */
    
    public static boolean comprobar(int num1, int num2){
         if (num1 < num2) {
            return true;
        } else {
            return false;
        }
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        int suma = 0;

        // Comprobamos que el segundo número sea mayor que el primero

        do {

            if (comprobar(num1, num2)==false) {
                System.out.println("Error: debes introducir un numero mayor .");
                // Volvemos a pedir el segundo número
                num2 = pedirNumero();
            }
            
        } while (comprobar(num1, num2)!=true);

        for (int i = num1; i <= num2; i++) {
             // Comprobamos si el número es par
            if (i % 2 == 0) {

                // Sumamos el número par al acumulador
                suma = suma + i;
            }
        }    
       
        //muestra el resultado
        System.out.println("La suma total de los numeros es:" + suma);               
    }
    
}
