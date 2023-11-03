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
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);

        System.out.println("Digite un numero");

        int numero1 = leer.nextInt();

        System.out.println("Digite otro numero: ");

        int numero2 = leer.nextInt();

        int suma = numero1 + numero2;

        System.out.println("El resultado es: " + suma);
    }

}
    