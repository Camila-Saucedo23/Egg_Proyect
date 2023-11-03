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
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
    
        int num = 0;
    
        for(int i=0; i<4; i++){
            do{
                System.out.println("Ingrese un numero entre 1-20");
                num = leer.nextInt();
            }while(num<1 || num>20);
            System.out.print(num + " - ");
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println("");            
        } 
        System.out.println("");
    }
    }
    

