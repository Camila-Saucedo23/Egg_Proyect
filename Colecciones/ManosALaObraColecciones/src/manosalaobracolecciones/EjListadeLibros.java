/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobracolecciones;

import java.util.ArrayList;
import objetos.Libro;
import service.LibroService;

/**
 *
 * @author camis
 */
public class EjListadeLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService ser = new LibroService();
        Libro l1 = ser.LlenarLibro();
        Libro l2 = ser.LlenarLibro();
        Libro l3 = ser.LlenarLibro();
        
        ArrayList<Libro> libreria = new ArrayList();
        libreria.add(l1);
        libreria.add(l2);
        libreria.add(l3);

        for (Libro Biblioteca : libreria) {
            System.out.println(Biblioteca);
        }
    }

}
