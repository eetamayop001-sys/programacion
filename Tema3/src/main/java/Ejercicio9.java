

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();
        
        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = entrada.nextInt();

        int numcambio;

    //el número más grande hacia el final (num4)
        if (num1 > num2) {
            numcambio = num1;
            num1 = num2;
            num2 = numcambio;
        }

        if (num2 > num3) {
            numcambio = num2;
            num2 = num3;
            num3 = numcambio;
        }

        if (num3 > num4) {
            numcambio = num3;
            num3 = num4;
            num4 = numcambio;
        }

// el segundo más grande a su sitio (num3)
        if (num1 > num2) {
            numcambio = num1;
            num1 = num2;
            num2 = numcambio;
        }

        if (num2 > num3) {
            numcambio = num2;
            num2 = num3;
            num3 = numcambio;
        }

// aseguramos la posición de los dos primeros (n1 y n2)
        if (num1 > num2) {
            numcambio = num1;
            num1 = num2;
            num2 = numcambio;
        }

// RESULTADO
        System.out.println("El orden de los números introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
        
        entrada.close();
    }
}
