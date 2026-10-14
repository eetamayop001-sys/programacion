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
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

        // variables para la fecha actual
        int anioActual;
        int mesActual;
        int diaActual;

        // variables para la fecha de nacimiento
        int anioNacimiento;
        int mesNacimiento;
        int diaNacimiento;

        // variables para el resultado
        int anios;
        int meses;
        int dias;
        int mesAnterior;
        int diasDelMesAnterior;

        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos de la fecha actual
        System.out.print("Introduzca el año actual: ");
        anioActual = entrada.nextInt();

        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();

        System.out.print("Introduzca el día actual: ");
        diaActual = entrada.nextInt();

        // Pedimos los datos de la fecha de nacimiento
        System.out.print("Ahora, introduzca su año de nacimiento: ");
        anioNacimiento = entrada.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();

        System.out.print("Por último introduzca su día de nacimiento: ");
        diaNacimiento = entrada.nextInt();

        // Cálculo inicial de las diferencias directas
        anios = anioActual - anioNacimiento;
        meses = mesActual - mesNacimiento;
        dias = diaActual - diaNacimiento;

        // Si el día actual es menor al de nacimiento, debemos ajustar
        if (dias < 0) {
            meses = meses - 1; // Restamos 1 mes porque el mes actual no se ha completado

            // Averiguamos cuál fue el mes anterior
            mesAnterior = mesActual - 1;
            if (mesAnterior == 0) {
                mesAnterior = 12; // Si el mes actual era enero (1), el anterior fue diciembre (12)
            }

            // Calculamos cuántos días tenía el mes anterior para sumarlos
            if (mesAnterior == 2) {
                diasDelMesAnterior = 28;
            } else if (mesAnterior == 4 || mesAnterior == 6 || mesAnterior == 9 || mesAnterior == 11) {
                diasDelMesAnterior = 30;
            } else {
                diasDelMesAnterior = 31;
            }

            dias = dias + diasDelMesAnterior;
        }

        // Si el mes actual resulta ser menor al de nacimiento (o quedó negativo por el ajuste anterior)
        if (meses < 0) {
            anios = anios - 1; 
            meses = meses + 12; 
        }

        // Mostramos el mensaje final con el resultado exacto
        System.out.println("Su edad exacta es de " + anios + " años, " + meses + " meses y " + dias + " días.");
    }
}
    
//corregir este ejercicio, con decrementar con mn