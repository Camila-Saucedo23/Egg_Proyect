/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2excepciones;

/**
 *
 * @author camis
 */
public class Ej2Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
            int [] numero = new int [4];
        numero [5] = 5;
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.err.println("El espacio no existe");
        }
               
    }
    
}
