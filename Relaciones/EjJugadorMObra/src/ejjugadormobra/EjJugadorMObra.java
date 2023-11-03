/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejjugadormobra;

import Objetos.Equipo;
import Objetos.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class EjJugadorMObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Equipo Lince = new Equipo();
        ArrayList eq = new ArrayList();
        
         int op;
        do {
            System.out.println("---MENU---");
            System.out.println("1.Agregar jugador");
            System.out.println("2.Ver equipo");
            System.out.println("3.Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    jugador j1 = new jugador();
                    System.out.println("Ingrese nombre y apellido del jugador");
                    j1.setNombre(leer.next());
                    j1.setApellido(leer.next());
                    System.out.println("Ingrese la posicion en la que juega y su numero de remera");
                    j1.setPosicion(leer.next());
                    j1.setNroRemera(leer.nextInt());
                    eq.add(j1);
                    Lince.setTeam(eq);
                    break;
                    case 2:
                        System.out.println(Lince.toString());
                    break;
                    case 3:
                        System.out.println("Saliendo!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            
        } while (op!=3);
    }
    
}
