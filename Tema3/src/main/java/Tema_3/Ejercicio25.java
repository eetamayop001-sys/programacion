/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;


/**
 *
 * @author Usuario
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //do while
        int numero = 17;
        int suma = 0;

        do {
            // Comprobamos si el número actual es par
            if (numero % 2 == 0) {
                
                //añade el número par a la suma acumulada
                suma = suma + numero;
            }
            // se incrementara el numero
            numero++; 
        } while (numero <= 139);  
        //muestra el resultado
        System.out.println("La suma total de los numeros es:" + suma);
    }
    
}
