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
        int numero = 111;
        int suma = 0;

        do {
            // Comprobamos si el número actual es impar
            if (numero % 2 != 0) {
                
                //añade el número par a la suma acumulada
                suma = suma + numero;
            }
            // se incrementara el numero
            numero++; 
        } while (numero <= 222);  
        //muestra el resultado
        System.out.println("La suma total de los numeros es:" + suma);
    }
    
}
