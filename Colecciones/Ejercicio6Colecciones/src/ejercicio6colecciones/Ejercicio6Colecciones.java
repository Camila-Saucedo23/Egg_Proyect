/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6colecciones;

import java.util.Scanner;
import service.TiendaService;

/**
 *
 * @author camis
 */
public class Ejercicio6Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaService sv = new TiendaService();
        Integer op;
        do {
            System.out.println("---MENU---");
            System.out.println("1-Agregar cosa");
            System.out.println("2-Modificar precio de la cosa");
            System.out.println("3-Eliminar cosa");
            System.out.println("4-Mostrar cosas cargadas y su precio");
            System.out.println("5-Salir del menu");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    sv.Agregar();
                    break;
                case 2:
                    sv.Modificar();
                    break;
                case 3:
                    sv.Borrar();
                    break;
                case 4:
                    sv.Mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo del manu de las cosas");
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 5);

    }

}
