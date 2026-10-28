/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    
     // Método que pregunta cuál es la capital de España
    public static int preguntaCapital(String capital) {

        // Creamos el Scanner para leer la respuesta
        Scanner entrada = new Scanner(System.in);

        // Pedimos la respuesta al usuario
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuesta = entrada.nextLine();

        // Comprobamos si la respuesta es correcta
        if (respuesta.equalsIgnoreCase(capital)) {
            System.out.println("Muy bien, respuesta correcta.");

            // Devolvemos 5 puntos si acierta
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + capital);

            // Devolvemos 0 puntos si falla
            return 0;
        }
    }

    // Método que pregunta quién descubrió América
    public static int preguntaDescubridor(String descubridor) {

        // Creamos el Scanner para leer la respuesta
        Scanner entrada = new Scanner(System.in);

        // Pedimos la respuesta al usuario
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuesta = entrada.nextLine();

        // Comprobamos si la respuesta es correcta
        if (respuesta.equalsIgnoreCase(descubridor)) {
            System.out.println("Muy bien, respuesta correcta.");

            // Devolvemos 5 puntos si acierta
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + descubridor);

            // Devolvemos 0 puntos si falla
            return 0;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Guardamos las respuestas correctas
        String capital = "Madrid";
        String descubridor = "Colón";

        // Mostramos el título del examen
        System.out.println("EXAMEN DE CULTURA GENERAL");

        // Llamamos al método de cada pregunta y guardamos los puntos
        int pregunta1 = preguntaCapital(capital);
        int pregunta2 = preguntaDescubridor(descubridor);

        // Sumamos los puntos obtenidos en las dos preguntas
        int nota = pregunta1 + pregunta2;

        // Mostramos la nota final del examen
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
}
   
