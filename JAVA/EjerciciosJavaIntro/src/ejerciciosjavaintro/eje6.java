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
public class eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO7
       Scanner leer = new Scanner(System.in);
        
        int op;
        System.out.println("Ingrese la bomba con opciones del 1 al 4");
        op = leer.nextInt();
        
        switch(op){
            case 1: System.out.println("Es una bomba de agua");break;
            case 2: System.out.println("Es una bomba de gasolina");break;
            case 3: System.out.println("Es una bomba de hormigón");break;
            case 4: System.out.println("Es una bomba de pasta alimenticia");break;
        default: System.out.println("No existe un valor valido para esta bomba") ;

    }
    }
}
