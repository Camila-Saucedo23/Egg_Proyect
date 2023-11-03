/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2relacionesop2;

import objetos.juego;

/**
 *
 * @author camis
 */
public class Ejercicio2relacionesop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        juego juega = new juego();
        while (!juega.finjuego()) {
            juega.ronda();
        }
        System.out.println("El juego termina");
    }
    
}
