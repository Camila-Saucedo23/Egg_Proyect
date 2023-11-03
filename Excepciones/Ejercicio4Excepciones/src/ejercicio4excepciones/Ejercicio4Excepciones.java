/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ejercicio4Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("ingrese un valor ");
            int op =  leer.nextInt();
        } catch ( InputMismatchException e) {
            System.out.println("Ingrese los datos de nuevo");
        } catch ( NumberFormatException a ){
            System.out.println(a.getMessage());
        } catch (ArithmeticException u){
            System.out.println(u.getMessage());
        }
    }
    
}
