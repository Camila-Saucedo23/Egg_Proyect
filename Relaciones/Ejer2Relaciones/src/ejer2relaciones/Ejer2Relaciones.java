/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2relaciones;

import Objetos.Jugador;
import Objetos.RevolverAgua;
import Objetos.juego;




/**
 *
 * @author camis
 */
public class Ejer2Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RevolverAgua r1 = new RevolverAgua();
        Jugador ju1 = new Jugador();
       juego j1 = new juego();
        j1.LlenarJuego(r1);
        //j1.Ronda();
    }
    
}
