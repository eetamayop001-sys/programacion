/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        int numero = scanner.nextInt();


        int primera = numero / 1000;
        System.out.println("La primera cifra es: " + primera);

        int segunda = (numero / 100) % 10;
        System.out.println("La segunda cifra es: " + segunda);

        int tercera = (numero / 10) % 10;
        System.out.println("La tercera cifra es: " + tercera);

        int cuarta = numero % 10;
        System.out.println("La cuarta cifra es: " + cuarta);

        scanner.close();
    }
}
