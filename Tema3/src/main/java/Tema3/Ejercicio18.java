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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        //do while
       int contraseña;
       int numero =1234;
        do {
            // Comprobamos si el número actual es par
         System.out.print("Por favor, introduzca su contraseña: ");
         contraseña = entrada.nextInt();    
            switch(contraseña){
            case 1-> 
                if (contraseña >=numero ) {
                System.out.println("Enhorabuena, tu acceso ha sido consedido");
            }

            case 2 -> System.out.println("Contraseña Incorrecta");
            case 3 -> System.out.println("Contraseña Incorrecta");
            case 4 -> System.out.println("Contraseña Incorrecta");
            default -> {
                System.out.println("Ese fuè tu ultimo intento, hasta pronto");
            }
            }

        } while (contraseña !=4);   
}
}    

