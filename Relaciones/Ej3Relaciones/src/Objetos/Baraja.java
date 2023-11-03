/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Baraja {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> mazoBorrado;
   

    public Baraja(ArrayList<Carta> mazo, ArrayList<Carta> mazoBorrado) {
        this.mazo = mazo;
        this.mazoBorrado = mazoBorrado;
    }

    public Baraja() {
    }

    public void CargarBaraja() {
        //OPCION 2 DE ERIK 
//         mazo = new ArrayList<>();
//        mazoBorrado = new ArrayList<>();
//        index = 0;
//        String[] clases = {"trebol", "picas", "diamantes", "corazones"};
//        for (String clase : clases) {
//            for (int num = 1; num <= 12; num++) {
//                if (num != 8 && num != 9) {
//                    mazo.add(new Carta(num, clase));
//                }
//            }
//        }
//    

        mazo = new ArrayList();
        mazoBorrado = new ArrayList<>();
       
        int cont = 1;
        for (int i = 0; i < 40; i++) {
            Carta c = new Carta();
            if (i < 10) {
                c.setNum(cont);
                c.setPalo("Oro");
            } else if (i < 20) {
                c.setNum(cont);
                c.setPalo("Espada");
            } else if (i < 30) {
                c.setNum(cont);
                c.setPalo("Basto");
            } else {
                c.setNum(cont);
                c.setPalo("Copas");
            }
            cont++;
            if (cont == 13) {
                cont = 1;
            }
            if (cont == 8) {
                cont = 10;
            }

            mazo.add(c);
        }
       
    }

    public void Barajar() {
        Collections.shuffle(mazo);
        //index = 0;
        System.out.println("Mazo  desordenado");
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }

    public void SigCarta() {
        if (mazo.isEmpty()) {
            System.out.println("El mazo esta vacio");
        } else {
            Carta Carta1 = mazo.get(0);
            mazoBorrado.add(Carta1);
            //index++;
            mazo.remove(0);
            System.out.println("su carta es: " + Carta1);
        }

    }

    public void CartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es: " + mazo.size());
    }

    public void DarCartas() {
        System.out.println("Cuantas cartas quiere?");
        int nrocartas = leer.nextInt();
        if (nrocartas <= mazo.size()) {
            for (int i = 0; i < nrocartas; i++) {
                SigCarta();
            }
        } else {
            System.out.println("Las cartas no alcanzan :( ");
        }

    }

    public void CartasMonton() {
        if (mazoBorrado.isEmpty()) {
            System.out.println("No hay cartas usadas");
        } else {
            System.out.println("Las cartas ya usadas son: ");
            for (Carta carta : mazoBorrado) {
                System.out.println(carta);
            }
        }

    }

    public void MostrarBaraja() {
        System.out.println("EL MAZO ES : ");
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }

}
