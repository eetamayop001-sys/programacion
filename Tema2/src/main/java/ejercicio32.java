/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int dinero = scanner.nextInt();

        int b50 = dinero / 50;
        dinero = dinero % 50;
        System.out.println("Billetes de 50: " + b50);

        int b20 = dinero / 20;
        dinero = dinero % 20;
        System.out.println("Billetes de 20: " + b20);

        int b10 = dinero / 10;
        dinero = dinero % 10;
        System.out.println("Billetes de 10: " + b10);

        int b5 = dinero / 5;
        dinero = dinero % 5;
        System.out.println("Billetes de 5: " + b5);

        int m2 = dinero / 2;
        dinero = dinero % 2;
        System.out.println("Monedas de 2 euros: " + m2);

        int m1 = dinero;
        System.out.println("Monedas de 1 euro: " + m1);

        scanner.close();
    }
}
