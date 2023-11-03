/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1excepciones;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ejercicio1Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//cambiar el out por err para que se vea hermosamente rojo ajjaja
        try {
            Persona per = null;
            per.mayorDeEdad(per);
          
        } catch (Exception ex) {
            
            System.err.println("Hay un error");
           
            
        } finally {
            System.out.println("holaaaaa");
        }
               

    }

}
