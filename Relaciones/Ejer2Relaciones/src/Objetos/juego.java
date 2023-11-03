/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class juego {

    Scanner leer = new Scanner(System.in);
    private RevolverAgua r;
    private Jugador[] jugadores;
    


    public juego() {
    }


    public void LlenarJuego(RevolverAgua r ) {
        
        System.out.println("--CARGANDO JUEGO--");
        System.out.println("Cuantos jugadores son");
        int conta = leer.nextInt();
        while (conta > 6) {
            System.out.println("ingrese los jugadores de nuevo (max 6)");
            conta = leer.nextInt();
        }
        int cont = 0;
        while (cont!=conta) {
            System.out.println("Agragar jugador");
            System.out.println("Insertar ID y nombre del jugador");
            Jugador j1 = new Jugador();
            j1.setID(leer.nextInt());
            j1.setNombre(leer.next());
            
            cont++;
            
        }
       this.r.Llenarrevolver();
      
        
       
    }

    public void Ronda() {
    
        for (Jugador jug : jugadores) {
           jug.disparo(r);
           
        }
    }

}
