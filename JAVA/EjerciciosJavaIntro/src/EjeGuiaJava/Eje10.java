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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, suma= 0, num;
        
        do {
            System.out.println("Ingrese el limite a superar");
            limite = leer.nextInt();
            } while (limite < 0);
            
        
        do {
            System.out.println("Ingrese el numero a sumar");
            num = leer.nextInt();
            suma += num;
            } while (suma <= limite);
        
        System.out.println("La suma " + suma + " supero al Limite: " + limite);
    }
}
 