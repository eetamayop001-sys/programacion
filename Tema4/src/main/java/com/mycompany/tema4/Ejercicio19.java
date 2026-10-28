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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    // Método que pide el día y lo devuelve al main
    public static String pedirDiaSemana() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduzca un día de la semana:");
        String dia = entrada.nextLine();

        return dia;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Llamamos al método para pedir el día
        String diadelasemana = pedirDiaSemana();

        // Comprobamos el día introducido
        switch (diadelasemana) {
            case "Lunes" ->
                System.out.println("El Lunes es el primer día de la semana");
            case "Martes" ->
                System.out.println("El Martes es el segundo día de la semana");
            case "Miércoles" ->
                System.out.println("El Miércoles es el tercer día de la semana");
            case "Jueves" ->
                System.out.println("El Jueves es el cuarto día de la semana");
            case "Viernes" ->
                System.out.println("El Viernes es el quinto día de la semana");
            case "Sábado" ->
                System.out.println("El Sábado es el sexto día de la semana");
            case "Domingo" ->
                System.out.println("El Domingo es el séptimo día de la semana");
            default ->
                System.out.println("El día introducido no es válido");       
        }
    }
    
}
