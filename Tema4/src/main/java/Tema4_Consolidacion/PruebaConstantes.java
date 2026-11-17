/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4_Consolidacion;

/**
 *
 * @author Usuario
 */
<<<<<<< Updated upstream:Tema4/src/main/java/Tema4_Consolidacion/PruebaConstantes.java
public class PruebaConstantes {
=======
   
import java.util.Scanner;

public class Ejercicio17 {
>>>>>>> Stashed changes:Tema4/src/main/java/com/mycompany/tema4/Ejercicio17.java

    static Scanner entrada = new Scanner(System.in);

    // Metodo para generar una letra aleatoria
    public static char generarLetra() {
        char letra = (char) (Math.random() * 26 + 97);
        return letra;
    }

    // Metodo para pedir una letra
    public static char pedirLetra() {
        System.out.println("Introduce una letra minuscula:");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

    public static void main(String[] args) {
<<<<<<< Updated upstream:Tema4/src/main/java/Tema4_Consolidacion/PruebaConstantes.java
        // TODO code application logic here
        
        System.out.println(Constantes.velocidadLuz);
        System.out.println(Constantes.constanteuniversalGravitacion);
        System.out.println(Constantes.constanteplanck);
=======
        char letraAleatoria = generarLetra();
        char letra;
        int intentos = 0;

        do {
            letra = pedirLetra();
            intentos++;

            if (letra < letraAleatoria) {
                System.out.println("La letra que buscas esta despues.");
            } else if (letra > letraAleatoria) {
                System.out.println("La letra que buscas esta antes.");
            } else {
                System.out.println("Has adivinado la letra.");
                System.out.println("Numero de intentos: " + intentos);
            }

        } while (letra != letraAleatoria);
>>>>>>> Stashed changes:Tema4/src/main/java/com/mycompany/tema4/Ejercicio17.java
    }
}


    

