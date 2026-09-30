/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       System.out.print("Por favor, introduzca un numero: ");
       numero = entrada.nextInt();
       
       if (numero > 0) {
           System.out.println("El número introducido es positivo");
       } else if (numero < 0) {
           System.out.println("El número introducido es negativo");
       } else {
           System.out.println("El número introducido es cero");
       }
    }
}

