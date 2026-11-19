/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema5;

/**
 *
 * @author Usuario
 */
public class Asignaturas {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private int nota;
    
    
    //Contructorees
    //por defecto
    public Asignaturas(){
        this.nombre ="";
        this.nota =0;
    }
    
    

    //se le pasan todos los atributos
    //parametrizado
    public Asignaturas(String nombre,  int notas){
        this.nombre = nombre;
        this.nota= nota;
                
        
    }
}
