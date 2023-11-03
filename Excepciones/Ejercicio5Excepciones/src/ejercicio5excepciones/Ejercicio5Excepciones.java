/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ejercicio5Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = (int) (Math.random()*150);
        System.out.println(num);
        int op=0, cont=0;
        //poner algo entre do y try asi se ejecuta de nuevo 
        do {
             System.out.println("Adivina el num");
            try {
             op =  leer.nextInt();
            if (num > op ) {
                System.out.println("El num es mayor al ingresado");
            } else if (num < op){
                System.out.println("El num es menor al ingresado");
            }
            cont ++;
            } catch (InputMismatchException e) {
                System.err.println("Ingrese un numero!!");
                cont ++;
                //agregar el cod de la linea 39, para que borre el scaner y no lo hace infinito
                leer.nextLine();
            }
            
        } while (num != op);
        System.out.println("Acertaste!!! ");
        System.out.println("despues de: " + cont);
        
    }
    
}
