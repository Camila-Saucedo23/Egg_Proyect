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
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la frase:");
        
        String frase = leer.nextLine();
        
        System.out.println("---------------");
        System.out.println(frase.toLowerCase());
        System.out.println("---------------");
        System.out.println(frase.toUpperCase());
    }
    }
    

