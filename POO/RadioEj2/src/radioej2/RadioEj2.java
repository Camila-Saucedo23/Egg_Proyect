/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioej2;

import Objeto.Radio;
import Servicio.RadioServicio;

/**
 *
 * @author camis
 */
public class RadioEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RadioServicio service = new RadioServicio();
       Radio r1 = service.crearRadio() ;
        System.out.println("el perimetro es : " + service.calcularPerimetro(r1));
        System.out.println("el area es: " + service.calcularArea(r1));
        
    }
    
}
