/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import objeto.Movil;
import service.serviceMovil;

/**
 *
 * @author camis
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       serviceMovil ser = new serviceMovil();
       Movil cel = ser.CargarCelular();
        System.out.println(cel.toString());
       
    }
    
}
