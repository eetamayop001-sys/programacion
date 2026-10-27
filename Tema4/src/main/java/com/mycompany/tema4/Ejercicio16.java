
package com.mycompany.tema4;

public class Ejercicio16 {

    // Metodo para hallar la raiz cuadrada
    public static void sqrt() {
        double raizCuadrada = Math.sqrt(64);
        System.out.println("Raiz cuadrada de 64: " + raizCuadrada);
    }

    // Metodo para elevar un numero al cubo
    public static void elever() {
        double elevarExponente = Math.pow(8, 3);
        System.out.println("8 elevado al cubo: " + elevarExponente);
    }

    // Metodo para hallar la exponencial de 2
    public static void exp() {
        double numero = Math.exp(2);
        System.out.println("Exponencial de 2: " + numero);
    }

    // Metodo para hallar el logaritmo de 2.71828
    public static void log() {
        double logaritmo = Math.log(2.71828);
        System.out.println("Logaritmo de 2.71828: " + logaritmo);
    }

    // Metodo para hallar el menor valor entre 2 y 3
    public static void min() {
        double minimo = Math.min(2, 3);
        System.out.println("Menor valor entre 2 y 3: " + minimo);
    }

    // Metodo para hallar el valor absoluto de -4.5
    public static void abs() {
        double absoluto = Math.abs(-4.5);
        System.out.println("Valor absoluto de -4.5: " + absoluto);
    }

    // Metodo para redondear -4.5 con ROUND
    public static void redondeado() {
        long round = Math.round(-4.5);
        System.out.println("Redondeo de -4.5: " + round);
    }

    // Metodo para hallar el seno de 45 grados
    public static void seno() {
        double sin = Math.sin(Math.toRadians(45));
        System.out.println("Seno de 45 grados: " + sin);
    }

    public static void main(String[] args) {
        sqrt();
        elever();
        exp();
        log();
        min();
        abs();
        redondeado();
        seno();
    }
}
