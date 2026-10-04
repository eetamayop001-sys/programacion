

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ejercicio4 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num1;
       System.out.print("Por favor, introduzca un numero: ");
       num1 = entrada.nextInt();
       
       int num2;
       System.out.print("Ahora, introduzca un segundo numero: ");
       num2 = entrada.nextInt();
       
        int num3;
       System.out.print("Por ultimo, introduzca un tercer numero: ");
       num3 = entrada.nextInt();
       
       if (num1 < num2 && num1<num3) {
           System.out.println("El nùmero mayor de los introducidos es el:  " + num1);
           
        }else if (num2 < num3 && num2<num1) {
         System.out.println("El nùmero mayor de los introducidos es el: " + num2);  
       } else {
           System.out.println("El nùmero menor de los introducidos es el:  " + num3);
       }
    }
}
