

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2 {
       public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num1;
       System.out.println("Por favor, introduzca un numero: ");
       num1 = entrada.nextInt();
       
       int num2;
       System.out.println("Ahora, introduzca un segundo numero: ");
       num2 = entrada.nextInt();
       
       if (num1 > 10) {
           int resultado = num1 * num2;
           System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
       } else {
           int resultado = num1 + num2;
           System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
       }
    }
}


