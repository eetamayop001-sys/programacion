/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //creamos la variable que sera el numero ingresado por el usuario
        int numeroIngresado;
        //usamos do while porque le pedimos al usuario un numero y luego comprobamos si el numero ingresado es el correcto
        do{ 
        System.out.println("Introduzca un numero:");
        numeroIngresado = entrada.nextInt();
        
        //usamos un condicional para que aparezca el mensaje de error si el usuario ingresa un numero menor que 1 
        if(numeroIngresado <=1){
        System.out.println("ERROR, NUMERO INVALIDO  ");
        }
        }while(numeroIngresado <=1);
        
        //Usamos for porque sabemos que empieza desde el numero 1 
        for(int i=1; i<=numeroIngresado; i++){
        System.out.println(i);         
        }
    }    
}
        

    