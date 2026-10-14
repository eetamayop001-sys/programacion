/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio34 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables de salida
        int diaSalida;
        int horaSalida;
        int minutoSalida;

        // Pedimos los datos de salida
        System.out.println("--- DATOS DE SALIDA ---");
        System.out.print("Introduce el día de salida: ");
        diaSalida = entrada.nextInt();

        System.out.print("Introduce la hora de salida (0-23): ");
        horaSalida = entrada.nextInt();

        System.out.print("Introduce el minuto de salida (0-59): ");
        minutoSalida = entrada.nextInt();

        // Declaramos las variables de llegada
        int diaLlegada;
        int horaLlegada;
        int minutoLlegada;

        // Pedimos los datos de llegada
        System.out.println("--- DATOS DE LLEGADA ---");
        System.out.print("Introduce el día de llegada: ");
        diaLlegada = entrada.nextInt();

        System.out.print("Introduce la hora de llegada (0-23): ");
        horaLlegada = entrada.nextInt();

        System.out.print("Introduce el minuto de llegada (0-59): ");
        minutoLlegada = entrada.nextInt();

        // Declaramos las variables para los cálculos de minutos
        int totalMinutosSalida;
        int totalMinutosLlegada;

        // Convertimos ambas fechas a minutos totales
        // 1 día = 24 horas * 60 minutos = 1440 minutos
        totalMinutosSalida = (diaSalida * 1440) + (horaSalida * 60) + minutoSalida;
        totalMinutosLlegada = (diaLlegada * 1440) + (horaLlegada * 60) + minutoLlegada;

        // Comprobamos si la fecha de llegada es válida
        if (totalMinutosLlegada < totalMinutosSalida) {
            System.out.println("Error: La hora de llegada no es posible (no se puede retroceder en el tiempo).");
        } else {
            // Declaramos las variables del resultado final
            int minutosDiferencia;
            int horasTrayecto;
            int minutosTrayecto;

            // Calculamos la diferencia en minutos totales
            minutosDiferencia = totalMinutosLlegada - totalMinutosSalida;

            // Convertimos los minutos totales a horas y minutos
            horasTrayecto = minutosDiferencia / 60;
            minutosTrayecto = minutosDiferencia % 60;

            // Mostramos el resultado
            System.out.println("El tren tarda " + horasTrayecto + " horas y " + minutosTrayecto + " minutos en llegar a su destino.");
        }
    }
}

//corregir este ejercicio, basarme en el ejercicio de los billetes
//individualmente ir probando 
    
