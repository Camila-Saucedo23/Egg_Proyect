/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;

import objeto.Raices;
import service.ServiceRaizop2;




/**
 *
 * @author camis
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiceRaizop2 ser = new ServiceRaizop2(); 
       Raices r1 = ser.crearRaices();
       ser.calcular(r1);
     
      
       
    } 
}
