/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4_Consolidacion;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static String pedirNombre (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, digite su nombre: ");
        return entrada.nextLine();
          
    }
    
    
    public static int pedirEdad (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        return entrada.nextInt();          
    }
    
    public static void mayorDeEdad(int edad, String nombre) {

    if (edad >= 18) {
        System.out.println(nombre + " es mayor de edad");
    } else {
        System.out.println(nombre +  " no es mayor de edad");
    }
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = pedirNombre();
        int edad = pedirEdad();
        mayorDeEdad(edad, nombre);
    }
    
}
