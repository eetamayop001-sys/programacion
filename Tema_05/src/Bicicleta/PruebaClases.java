/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bicicleta;

/**
 *
 * @author Usuario
 */
public class PruebaClases {

    /**
     * Método main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear uno bicicletas
        //crear el metodo, y tambien instanciarlo
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea:");
        bici1.setColor("rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);
        
        //Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicleta();
        
        //Crear dos bicicleta
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Merida:");
        bici2.setColor("azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        
        //Mostrar bici1 (mostrar)
        bici1.mostrarBicicleta();
        System.out.println ("");
        
        //Mostrar bici1 (toString)
        System.out.println(bici2.toString());
        System.out.println ("");

        
        //mostrar color bici1
        bici1.getColor("Color de bici1" + bici1.getColor());
        System.out.println ("");

        
        System.out.println("Contador de bicicletas:" +Bicicleta.getContadorBicicleta());
        
        
    }
    
}
