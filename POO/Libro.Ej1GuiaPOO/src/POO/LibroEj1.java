/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Service.LibroserviceEj1;

/**
 *
 * @author camis
 */
public class LibroEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroserviceEj1 service = new LibroserviceEj1();
        Entidades.LibroEj1 lb = service.cargarLibro();
      
      service.mostrarInformacion(lb);
    }
    
}
