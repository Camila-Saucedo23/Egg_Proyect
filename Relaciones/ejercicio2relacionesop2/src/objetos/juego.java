/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class juego {
    Scanner leer = new Scanner(System.in);
    private jugador[] jugadores;
    private revolver revolver;

    public juego() {
        
        System.out.println("cuantos jugadores son");
        int numjugadores = leer.nextInt();
        jugadores = new jugador[(numjugadores)];
        for (int i = 0; i < numjugadores; i++) {
           System.out.println("Insertar ID y nombre del jugador");
            jugador j = new jugador();
            j.setId(leer.nextInt());
            j.setNombre(leer.next());
            jugadores[i]= new jugador(j.getId(), j.getNombre());
            System.out.println(j);
        }
        revolver = new revolver(); 
       
    }
   
    
public boolean finjuego(){
    for (int i = 0; i < jugadores.length; i++) {
        if (jugadores[i].ismojado()) { 
            return true;
        } 
        
    }
    return false;
}
public void ronda(){
      for (int i = 0; i < jugadores.length; i++) {
        jugadores[i].disparar(revolver);
          if (!jugadores[i].ismojado()) {
              break;
          }
     
        }
    }
}

