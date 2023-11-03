/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1relaciones;

import Objetos.Metodos;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ejer1Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Falta Remover de la lista al perro y persona que ya adoptaron
        //Falta mostrar si no se pudo hacer el proceso
        Scanner leer = new Scanner(System.in);
        Metodos m = new Metodos();
        int op;
        m.Llenarlistas();
        do {
            System.out.println("MENU");
            System.out.println("1. Cargar persona");
            System.out.println("2. Adopta un perro");
            System.out.println("3. Mostrar personas con sus mascotas adoptadas");
            System.out.println("4. Mostrar personas solas");
            System.out.println("5. Mostrar perros que hay en adopcion");
            System.out.println("6. Mostrar perros ya adoptados");
            System.out.println("7.Salir del menu");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Cargar nueva persona a la lista de adoptantes");
                    m.Cargarpersona();
                    break;
                case 2:
                    System.out.println("Proceso de adopcion");
                    m.Adopcion();
                    m.Compararlistas();
                    break;
                case 3:
                    System.out.println("Personas que ya adoptaron con sus mascotas: ");
                    m.MostrarPersonasPerrunas();
                    break;
                case 4:
                    System.out.println("Las personas disponibles para ser adoptantes: ");
                    m.Mostrarpersonas();
                    break;
                case 5:
                    System.out.println("Las mascotas en adopcion son las siguientes: ");
                    m.Mostrarperros();
                    break;
                case 6:
                    System.out.println("Las mascotas ya adoptadas: ");
                    m.MostrarPAdoptados();
                    break;
                case 7:
                    System.out.println("Saliendo del menu");
                    System.out.println("Adopte no compre!!!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (op != 7);
    }

}
