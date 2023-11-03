/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejanimalmobraherencia;

import Animal.Animal;
import Animal.Caballo;
import Animal.GatoOp2;
import Animal.Perro;
import java.util.ArrayList;

/**
 *
 * @author camis
 */
public class EjAnimalMObraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal a = new Perro("pepe", 10, "caniche", "pienso");
     a.Alimentacion();
      Animal b = new GatoOp2("michi", 5, "gatuna", "pescado");
     b.Alimentacion();
      Animal c = new Caballo("pony", 6, "trotador", "alfalfa");
      c.Alimentacion();
      
    }
    
}
