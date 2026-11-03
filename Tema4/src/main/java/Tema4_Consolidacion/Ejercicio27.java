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
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    
    public static String pedirPalabra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Intenta adivinar. Elige cara o cruz: ");
        String eleccion = entrada.nextLine();
        return eleccion;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String eleccion;
        String resultado;

        do {
            eleccion = pedirPalabra();

            // Generamos un número aleatorio entre 1 y 2
            int numero = (int) (Math.random()*2+1);

            // Comprobamos el resultado de la moneda
            if (numero == 1) {
                resultado = "cara";
            } else {
                resultado = "cruz";
            }

            // Mostramos el resultado
            System.out.println("Ha salido: " + resultado);

            // Comprobamos si ha acertado
            if (eleccion.equalsIgnoreCase(resultado)) {
                System.out.println("¡Enhorabuena! Has acertado.");
            } else {
                System.out.println("Has perdido. Inténtalo de nuevo.");
            }

        } while (!eleccion.equalsIgnoreCase(resultado));                            
    }   
}
