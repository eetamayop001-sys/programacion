/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bicicleta;

/**
 *
 * @author Usuario
 */
public class Bicicleta {
    
    
    //Atributos no se inicializa en la declaracion
    private String marca;
    private String color;
    private float precio;
    private int anios;
    //Atributo static si se inicializa en la declaracion
    private static int contadorBicicletas = 0;
    
    //Metodos
    //Getters /Setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca =m;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color =c;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float p){
        precio =p;
    }
    
    public int getAnios(){
        return anios;
    }
    
    public void setAnios(int a){
        anios =a;
    }
    
    
    public static int getContadorBicicleta(){
        return contadorBicicletas;
    }
    
    //Otros métodos
    
    public void mostrarAntiguedad(){
        if(anios > 10){
        System.out.println("La bici es antigua");
    }else {
        System.out.println("La bici es nueva");

    }
    }
    
    public static void aumentarContadorBicicleta(){
        contadorBicicletas++;
    }
    
    //Método mostrar /toString()
    public void mostrarBicicleta(){
        System.out.println("Marca" +marca);
        System.out.println("color:" +  color);
        System.out.println("precio:"+precio);
        System.out.println("Años:"+anios);
    }
    
    @Override
    public String toString(){
        return color + "Marca:" + marca + ",Color" + color + ",precio" + precio + ",años" + anios;    }
    
}
