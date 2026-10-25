/*package
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**Metodo para pedir la contraseña al usuario
     * @param args the command line arguments
     */
    
    int numero =1234;
    
    public static int pedirContraseña(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca su contraseña: ");
        return entrada.nextInt();

    }    
    
    /**
     * Metodo booleano para comprobar la contraseña 
     * @param contraseña
     * @return 
     */
    public static boolean comprobar(int contraseña, int numero){
        if (contraseña == numero) {
        return true;
    } else {
        return false;
    }
}
    /**
     * Metodo para comprobar el resultado
     * @param contraseña
     * 
     */
    public static void resultado() {
        int contraseña;
        int intentos =0;
        int numero =1234;

        do {
            contraseña = pedirContraseña();

            if (comprobar(contraseña, numero)) {
                System.out.println("Enhorabuena, tu acceso ha sido concedido");
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta");
            }

        } while (contraseña != numero && intentos < 3);

        if (contraseña != numero) {
            System.out.println("Error de acceso. Has superado los 3 intentos.");
        }
    }
    
   public static void main(String[] args) {
        resultado();
    } 
}