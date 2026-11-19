/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_tema5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
   
    public static int pedirValor(){
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un valor:");
        valor = entrada.nextInt();
        return valor;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada =new Scanner(System.in);
        int numero; 
        numero = pedirValor();
//creamos un objeto
        Numero num1 = new  Numero();
        num1.setestablecerValor(0);
        
        
        if (numero % 2 == 0) {
                System.out.println("El numero introducido es par");
            }
        else{
        System.out.println("El numero introducido es impar");
        }
        
    }
    
}
