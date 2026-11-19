package pruebaclases;

/**
 * Clase PruebaClases
 * 
 * 
 * @author danib
 */
public class PruebaClases {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos bici1
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);  
        
        //Incrementamos el contador de bicis en 1
        Bicicleta.aumentarContadorBicicleta();
        
        //Creamos bici2
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Mérida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        //Incrementamos el contador de bicis en 2
        Bicicleta.aumentarContadorBicicleta();
        
        //Mostramos bici1 (con el método mostrar)
        bici1.mostrarBicicleta();     
        System.out.println("");
        
        //Mostramos bici2 (con el método toString())
        System.out.println(bici2.toString());
        System.out.println("");
        //Alternativa guardando lo que devuelve toString() en una variable
        //String resultado = bici2.toString();
        //System.out.println(resultado);
        
         //Mostramos el color de bici1
         System.out.println("Color de bici1: " + bici1.getColor());
         System.out.println("");
         
         //Mostramos el contador de bicicletas
        System.out.println("Contador de bicicletas: " + Bicicleta.getContadorBicicleta());  
        
    }
    
}
