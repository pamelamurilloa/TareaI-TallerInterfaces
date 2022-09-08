/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;

/**
 *
 * @author pamelamurillo
 */
public class Calculadora {
    
    private int primerOperador = 0;
    private int segundoOperador = 0;

    public Calculadora(int primerOperador, int segundoOperador) {
        this.primerOperador = primerOperador;
        this.segundoOperador = segundoOperador;
    }

    public static int suma(int a, int b){
        return a + b;
    }
    
    public static int resta(int a, int b){
        return a - b;
    }
    
    public static int multiplicacion(int a, int b){
        return a * b;
    }
    
    public static int division(int a, int b){
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
    
}
