/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintro;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int val =3;
        String[] Equipo = new String[val];
    
        for (int i = 0 ; i<val ; i++) {
            System.out.println("Ingresa valor en la posicion "+ (1+i));
            Equipo[i] = leer.next();
        }
        for (int i = 0 ; i<val ; i++) {
            System.out.println(" "+ Equipo[i] +" ");
        }
        System.out.println(" ");
    }

    }
    

