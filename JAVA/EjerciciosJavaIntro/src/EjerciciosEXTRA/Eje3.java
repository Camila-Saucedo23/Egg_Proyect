/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEXTRA;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una letra");
        String letra=leer.nextLine();
        
        if(letra.length()>1){
            do{
            System.out.println("ingrese una letra");
            letra=leer.nextLine();
            }while(letra.length()>1);
        }
        
        if (letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")) {
            System.out.println("Correcto");
        }
        else{
            System.out.println("incorrecto");
        }
        
    }
    
}


 