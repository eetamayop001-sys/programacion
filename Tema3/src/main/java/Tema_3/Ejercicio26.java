/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author Usuario
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //creamos las variables    
    int suma = 0;

        //se recorre los números desde el 111 hasta el 222
        for (int i = 111; i <222; i++) {
            // Comprobamos si el número es impar
            if (i % 2 != 0) {
                suma += i;
            }
        }

        // se muestra el resultado
        System.out.println("La suma total de los números impares entre el 111 y el 222 es: " + suma);
    }
}