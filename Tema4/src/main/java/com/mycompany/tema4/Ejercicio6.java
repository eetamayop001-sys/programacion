/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    public static void comprobar(int nota){
        
     if (nota < 0 || nota > 10) {
           System.out.println("Error: la nota debe estar entre 0 y 10");
       } else if (nota <= 4) {
           System.out.println("La calificación es Suspenso");
       } else if (nota <= 6) {
           System.out.println("La calificación es Bien");
       } else if (nota <= 8) {
           System.out.println("La calificación es Notable");
       } else {
           System.out.println("La calificación es Sobresaliente");
       }
    }
    public static void main(String[] args) {
   int nota;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Por favor, introduzca la nota del alumno: ");
    nota = entrada.nextInt();
    comprobar(nota);
}
}


