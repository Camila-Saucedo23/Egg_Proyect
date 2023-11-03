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
public class Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese la longitud de los lados: ");
        n = leer.nextInt();
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }  
            System.out.println("");
        }

    }
    
}
