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
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int num1 ;
        int num2 ;
       
        
        System.out.println("Ingresa dos numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esMultiplo(num1, num2);
        
        
    }
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("Es multiplo");
        
        }else{
            System.out.println("NO ES MULTIPLO");
        }
}
    }
    

