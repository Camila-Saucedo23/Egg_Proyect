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
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion;
        String eleccion = null;
        
        System.out.println("Ingrese dos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    do {                                               
                        eleccion = leer.nextLine();   
                    } while (!eleccion.equalsIgnoreCase("s") && !eleccion.equalsIgnoreCase("n"));
                    break;
                default:
                    System.out.println("ERROR! Ingresa un numero del 1-5.");
                    break;
            }
        } while (!eleccion.equalsIgnoreCase("s"));
    }   
    }
    

