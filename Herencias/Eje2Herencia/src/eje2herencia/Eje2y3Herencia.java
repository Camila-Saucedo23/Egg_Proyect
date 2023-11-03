/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje2herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje2y3Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        ArrayList<Electrodomesticos> lista = new ArrayList();
        do {
            System.out.println("///MENU///");
            System.out.println("1. Ingresar lavadora");
            System.out.println("2. Ingresar Televisor");
            System.out.println("3. Suma de electrodomesticos");
            System.out.println("4. Precio de electrodomesticos individual");
            System.out.println("5. Salir del menu");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cargando datos de la lavadora");
                    Electrodomesticos ee = new Lavadora();
                    ee.CrearElectrodomestico();
                    lista.add(ee);
                    break;
                case 2:
                    System.out.println("Cargando datos de televisor");
                    Electrodomesticos et = new Televisor();
                    et.CrearElectrodomestico();
                    lista.add(et);
                    break;
                case 3:
                    double preciosuma = 0;
                    for (Electrodomesticos electrodomes : lista) {
                        preciosuma += electrodomes.PrecioFinal();
                    }
                    System.out.println("El precio del total de los electrodomesticos es : " + preciosuma);
                    break;
                case 4:
                    for (Electrodomesticos electro : lista) {
                         electro.PrecioFinal();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del menu...");
                    System.out.println("vuelva pronto!!");
                    break;
                default:
                    System.out.println("EEROR");
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 5);

    }

}
