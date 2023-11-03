/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1y2colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ej1y2Op2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> Perros = new ArrayList();
        int op;
        do {
            System.out.println("----MENÚ----");
            System.out.println("1- Crear Raza ");
            System.out.println("2- Salir ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Perros.add(leer.next());
                    break;
                case 2:
                    System.out.println("Saliendoo");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 2);
        System.out.println("Lista de perros");
        Perros.forEach((e)->System.out.println(e)); 
//nombre del Array . foreach entre parentesis poner una valiable + el sout de la misma
        System.out.println("------------");
        System.out.println("Ingrese la raza de perro a borrar");
        String raza = leer.next();
        Iterator<String> it = Perros.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(raza)) {
                it.remove();
            }
        }
        System.out.println("Lista de perros con la raza elegida borrada");   
        Perros.forEach((e)->System.out.println(e)); 
        System.out.println("---------------");
        System.out.println("Lista de perros ordenada ");
        Collections.sort(Perros);
        Perros.forEach((e)->System.out.println(e)); 
    }

}
