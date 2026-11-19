/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9_tema5;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void metodo(){
        int num1 =4;
        int num2=2;
        int num3=8;
        
        if (num1 > num2 && num1>num3) {
           System.out.println("El nùmero mayor de los introducidos es el:  " + num1);
           
        }else if (num2 > num3 && num2>num1) {
         System.out.println("El nùmero mayor de los introducidos es el: " + num2);  
       } else {
           System.out.println("El nùmero mayor de los introducidos es el:  " + num3);
       }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos un objeto
        Numero num1 = new  Numero();
        num1.setestablecerValor(0);
        
        //creamos un segundo objeto
        Numero num2 = new  Numero();
        num2.setestablecerValor(0);
        
        //creamos un tercer objeto
        Numero num3 = new  Numero();
        num3.setestablecerValor(0);
    }
    
}
