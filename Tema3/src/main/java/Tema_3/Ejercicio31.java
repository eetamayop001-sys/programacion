/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author Usuario
 */
        
public class Ejercicio31 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//declaramos las variable
        int contadorImpares = 0;
        int contadorIntentos = 0;

        // Variables para los tres números impares
        int impar1 = 0;
        int impar2 = 0;
        int impar3 = 0;


        while (contadorImpares < 3) {

            //generamos un numero aleatorio entre 1 y 100     
            double aleatorio =Math.floor(Math.random()*100+1);
            //convertimos en entero
            int aleatorioEntero = (int) aleatorio;
            contadorIntentos++;

            // Comprobar si el número es impar
            if (aleatorioEntero % 2 != 0) {
            contadorImpares++;

            if(contadorImpares == 1) {
                impar1 = aleatorioEntero;
            } else if (contadorImpares == 2) {
                impar2 = aleatorioEntero;
            } else {
                    impar3 = aleatorioEntero;
                }
            }
        }

        // Mostrar los tres números impares
        System.out.println("Primer impar: " + impar1);
        System.out.println("Segundo impar: " + impar2);
        System.out.println("Tercer impar: " + impar3);

        // Mostrar la cantidad total de números generados
        System.out.println("Cantidad de aleatorios generados: "+ contadorIntentos);
    }
}
    
//usar un do while