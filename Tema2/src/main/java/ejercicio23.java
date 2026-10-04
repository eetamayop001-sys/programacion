/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejercicio23 {

public class EjercicioCalculoTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        double precio = scanner.nextDouble();

        System.out.print("¿Cuántas unidades quiere llevarse? ");
        int unidades = scanner.nextInt();

        double total = precio * unidades;
        System.out.println("El precio total de su compra es de: " + total + " Euros.");

        scanner.close();
    }
}
}
