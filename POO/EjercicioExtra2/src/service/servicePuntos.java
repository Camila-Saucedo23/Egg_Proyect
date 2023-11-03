/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import objeto.puntos;

/**
 *
 * @author camis
 */
public class servicePuntos {
    Scanner leer = new Scanner(System.in);
   public puntos CrearPuntos(){
        puntos p1 = new puntos();
        System.out.println("Ingrese el punto nro 1 (x,y)");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese el punto nro2 (x,y)");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        return p1;
   }
   public double CalcularDistancia(puntos p1){
       double distancia = 0;
       distancia = Math.sqrt((Math.pow((p1.getX2()-p1.getX1()), 2))+(Math.pow((p1.getY2()-p1.getY1()), 2)));
       return distancia;
   }
}
