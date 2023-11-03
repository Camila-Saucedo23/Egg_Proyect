/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Objeto.Radio;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class RadioServicio {
    Scanner leer = new Scanner(System.in);
    public Radio crearRadio()  {
    System.out.println("Ingrese el valor del radio");
       
    Radio r1 = new Radio(leer.nextFloat());
    
    return r1 ;
    }
    public double calcularArea(Radio r1)  {
        return  Math.PI  * (r1.getRadio() * r1.getRadio()) ;
    }
    public float calcularPerimetro( Radio r1)  {
        
        float totalp = 2 * (float) Math.PI * r1.getRadio();
        return totalp ;
    }
   
}
