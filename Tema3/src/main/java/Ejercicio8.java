


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int dinero = scanner.nextInt();

        int b50 = dinero / 50;
        dinero = dinero % 50;
        if (b50 > 0) {
            System.out.println(b50 + " billetes de 50");
        }

        int b20 = dinero / 20;
        dinero = dinero % 20;
        if (b20 > 0) {
            System.out.println(b20 + " billetes de 20");
        }

        int b10 = dinero / 10;
        dinero = dinero % 10;
        if (b10 > 0) {
            System.out.println(b10 + " billetes de 10");
        }

        int b5 = dinero / 5;
        dinero = dinero % 5;
        if (b5 > 0) {
            System.out.println(b5 + " billetes de 5");
        }

        int m2 = dinero / 2;
        dinero = dinero % 2;
        if (m2 > 0) {
            System.out.println(m2 + " monedas de 2 euros");
        }

        int m1 = dinero;
        if (m1 > 0) {
            System.out.println(m1 + " monedas de 1 euro");
        }
    }
}
