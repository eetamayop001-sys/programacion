package com.mycompany.tema4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class prueba1 {

    // El método hace la comprobación y devuelve directamente el texto
    public static String comprobarPositivo(int num1) {
        if (num1 >= 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un numero: ");
        int num1 = entrada.nextInt(); 

        // ¡Adiós al if en el main! Imprimimos directamente el resultado del método
        System.out.println("El número introducido es " + comprobarPositivo(num1));
        
    }
}
