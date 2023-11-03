/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.Cafetera;

/**
 *
 * @author camis
 */
public class ServicioCafetera {
     Cafetera Caf = new Cafetera();
    Scanner leer = new Scanner(System.in);
     public Cafetera llenarCafetera() {
         System.out.println("Ingrese el nivel max de ka cafetera y su nivel actual de cafe");
         Caf.setMax(leer.nextInt());
         Caf.setActual(leer.nextInt());
         
         return Caf;
    }
   
    public Cafetera servirTaza() {
        /dos if
    }
    public Cafetera vaciarCafetera() {
        
    }
    public Cafetera lagregarCafe() {
        
    }
}
