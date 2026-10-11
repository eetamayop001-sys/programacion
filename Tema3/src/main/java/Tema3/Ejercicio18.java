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
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contraseña;
        int numero = 1234;
        int intentos = 0;

        do {
            System.out.print("Por favor, introduzca su contraseña: ");
            contraseña = entrada.nextInt();

            if (contraseña == numero) {
                System.out.println("Enhorabuena, tu acceso ha sido concedido");
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta");
            }
            
            if (contraseña == numero) {
            System.out.println("Error de acceso. Has superado los 3 intentos.");
            }
        } while (contraseña != numero && intentos < 3);

    }
}
