/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeextra3herencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class EjeExtra3Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alojamiento> a = new ArrayList();
        Alojamiento a1 = new Hotel4estrellas(20, "Food", 'A', 9, 18, 2, 0, "Elhotel4estrellas", "nose", "aqui", "yo");
        Alojamiento a2 = new Hotel5estrellas(2, 3, 3, 20, "FOOD", 'A', 9, 20, 1, 0, "Elhotel5estrellas", "callesiempreviva", "Springfield", "homero");
        Alojamiento a3 = new Camping(20, 3, true, 40, true, "carpitasclub", "novellana", "Asturias", "pao");
        Alojamiento a4 = new Recidencia(30, true, true, 60, true, "residenciaharrypotter", "howarts", "algunlugar", "hagrid");
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        int op;
        do {
            System.out.println("Opciones de consulta");
            System.out.println("1. Todos los alojamientos");
            System.out.println("2. Hoteles ordenados por precio (mas caro a mas barato)");
            System.out.println("3. Camping con restaurantes");
            System.out.println("4. Recidencia con descuentos");
            System.out.println("5 Salir ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Los alojamientos son: ");
                    for (Alojamiento alo : a) {
                        System.out.println(alo);
                    }
                    break;
                case 2:
                    Collections.sort(a, Comparadoressss.ordenprecio);
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (op!=5);

    }

}
