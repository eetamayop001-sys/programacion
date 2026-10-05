/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
im
package Tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int indice =0;
                
               //while
               System.out.println("while");
                while(indice<10){
                    System.out.println(indice);
                    indice++;
                }   
                
                
                //do while
                indice =0;
                System.out.println(" do while");
                do{
                    System.out.println(indice);
                    indice++;
                }while(indice<10);
                
                //for
                System.out.println("for");
                for(int i =0; i <10; i++){
                    if(i%2 !=0){
                    System.out.println(i);
                    }
                }
                
                //MENUS
               int opc =0;
               
               Scanner entrada =new Scanner(System.in);
                do{
                    //Mostramos el menu
                    System.out.println("-Menu_");
                    System.out.println("1. ver catalago");
                    System.out.println("2. Solicitar libro");
                    System.out.println("3. Devolver libro");
                    System.out.println("4. Salir");
                    
                    
                    
                    //Pedir opcion 
                    System.out.print("Elija una opcion:");
                    opc =  entrada.nextInt();
                    
                    switch(opc){
                        case 1-> System.out.println("Has elegido ver catalago");
                        case 2 -> System.out.println("Has elegido solicitar un libro");
                        case 3 -> System.out.println("Has elegido devolver el libro");
                        case 4 -> System.out.println("Gracias por usar nuestro programa");     
                            
                    }
                    
                }while (opc !=4);
                       
    }
    
}
