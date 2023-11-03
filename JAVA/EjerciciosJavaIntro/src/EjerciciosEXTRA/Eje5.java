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
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
     
        char opcion;
        double valor;
      
        
        do {
            System.out.println("A: 50% de descuento");
            System.out.println("B. 35% de descuento");
            System.out.println("C. No aplica descuento");
            System.out.println("Elija una categoría: ");
        opcion = leer.next().charAt(0);
        } while (opcion != 'A' && opcion != 'B' && opcion != 'C');
        
        System.out.println("Ingrese el valor del tratamiento");
        valor = leer.nextInt();
        
        if (opcion == 'A') {
            valor = valor * 0.50;
            System.out.println("Descuento aplicable: 50%");
                System.out.println("Importe con descuento: $" + valor); 
        }
          
                
                if (opcion == 'B') {
                    valor -= valor * 0.35;
                System.out.println("Descuento aplicable: 35%");
                System.out.println("Importe con descuento: " + valor);
                }
                if (opcion == 'C') {
                    System.out.println("Este tratamiento no recibe descuento");
                }
    }
    
}
