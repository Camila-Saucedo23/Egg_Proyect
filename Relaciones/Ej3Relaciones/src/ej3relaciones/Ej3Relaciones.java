/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3relaciones;

import Objetos.Baraja;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Ej3Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja m1 = new Baraja();
        m1.CargarBaraja();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        do {
            System.out.println("------------------");
            System.out.println("MENU");
            System.out.println("1 - Barajar");
            System.out.println("2 - Cartas disponibles");
            System.out.println("3 - Dar cartas");
            System.out.println("4 - Cartas eliminadas");
            System.out.println("5 - Mostrar mazo");
            System.out.println("6 - Siguiente carta");
            System.out.println("7 - Salir");
            op = leer.nextInt();
            while (op > 7) {
                System.out.println("Error. ingrese una opcion valida");
                System.out.println("------------------");
                System.out.println("MENU");
                System.out.println("1 - Barajar");
                System.out.println("2 - Cartas disponibles");
                System.out.println("3 - Dar cartas");
                System.out.println("4 - Cartas eliminadas");
                System.out.println("5 - Mostrar mazo");
                System.out.println("6 - Siguiente carta");
                System.out.println("7 - Salir");
                op = leer.nextInt();
            }

            switch (op) {
                case 1:
                    m1.Barajar();
                    break;
                case 2:
                    m1.CartasDisponibles();
                    break;
                case 3:
                    m1.DarCartas();
                    break;
                case 4:
                    m1.CartasMonton();
                    break;
                case 5:
                    m1.MostrarBaraja();
                    break;
                case 6:
                    m1.SigCarta();
                    break;
                case 7:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Error. Opcion invalida");
                    break;
            }
        } while (op != 7);
    }
}
