/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author alumno
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//generamos un numero aleatorio entre 1 y 100     
          double aleatorio =(Math.random()*100+1);
          aleatorio=Math.floor(aleatorio);
          //convertimos en entero
          int aleatorioEntero = (int) aleatorio;  
          
          //comprobamos si el  numero es par o impar
          if (aleatorio % 2 == 0) {
            System.out.println("El numero es:" +aleatorioEntero + "-numero par" ); 
          
          } else {                
             System.out.println("El numero es:" +aleatorioEntero + "-numero impar" );                  
          }
          
    }
}
    

