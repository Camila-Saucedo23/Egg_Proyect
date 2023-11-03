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
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String text = leer.nextLine();
        //String letra = String.valueOf(text.charAt(0));
        if (text.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("INCORRECTO");
                
            }
    }
    
}

    