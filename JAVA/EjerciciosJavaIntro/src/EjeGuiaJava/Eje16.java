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
public class Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, contador = 0, num;
        
        System.out.println("Inrese el tamaño de su vector: ");
        n = leer.nextInt();
        int[] vectorAleatorio = new int[n];
        
        for (int i = 0; i < vectorAleatorio.length; i++) {
            vectorAleatorio[i] += (Math.random() * 10); 
        }
        
        
        System.out.println("Ingrese un numero a buscar: ");
        num = leer.nextInt();
        
        for (int i = 0; i < vectorAleatorio.length; i++) {
            if (vectorAleatorio[i] == num) {
                contador++;
                System.out.println("EL numero "+num+" se ha encontrado en la posicion: " + i+1);
            }
        }      
        if (contador == 0) {
            System.out.println("No se ha encontrado el numero");
        }else{
            System.out.println("EL numero " + num + " se ha encontrado " + contador + " veces.");
        }
    }
    
}
