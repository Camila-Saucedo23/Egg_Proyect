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
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int correcta, incorrecta;
        correcta = 0;
        incorrecta = 0;
        String cadena;
        System.out.println("Ingrese una cadena de 5 caracteres");
        System.out.println("El primer carácter tiene que ser X y el último tiene que ser una O");
      
        cadena = leer.nextLine();
        
 while (!cadena.equals("&&&&&")){
     int longitud = cadena.length();
     
     if (cadena.substring(0, 1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && (longitud == 5) ) {
        
         correcta++;
         
     }else {
         incorrecta++;
 System.out.println("Ingrese otra cadena");
     }
        System.out.println("Ingrese una cadena válida");
        cadena = leer.nextLine();
        
     }
 System.out.println("Cadenas correctas " + correcta);
 System.out.println("Cadenas incorrectas " + incorrecta);
    
 }
}
