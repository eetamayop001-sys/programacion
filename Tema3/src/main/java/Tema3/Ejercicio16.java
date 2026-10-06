/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in);
                     
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");

//declaramos las variables
        int numero =20;
        int cantidad= 0;

//iniciamos el bucle 
        while (numero <= 160) {           
// Comprobamos si el número actual es impar

            if (numero % 2 !=0) {
            System.out.print("-" + numero);
            cantidad++;
            }
            numero++;
            }
        
        //se imprime la cantidad de numero impares que hay 
            System.out.println("La cantidad de numeros impares impresos han sido: " + cantidad);  
    }   }
