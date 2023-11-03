/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeGuiaJava;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero = leer.nextDouble();
        
        
        
        System.out.println("El doble del numero ingresado es: " + numero * 2);
        System.out.println("El triple del numero ingresado es:" + numero * 3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(numero) );
    
    }
    
}
