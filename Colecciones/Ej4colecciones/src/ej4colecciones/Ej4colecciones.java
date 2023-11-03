/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4colecciones;

import service.PeliculaService;

/**
 *
 * @author camis
 */
public class Ej4colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ser = new PeliculaService();
        ser.Cargarpeli();
        System.out.println("La lista de pelis es ");
        ser.Mostrarpeli();
        System.out.println("--------");
        System.out.println("Lista de pelis con duracion de mas de una hora");
        ser.pelidemasdeunahora();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada con duracion ascendente");
        ser.duracionasc();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada con duracion ascendente");
        ser.duraciondec();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada por nombre ");
        ser.nombrealf();
        System.out.println("--------");
        System.out.println("Lista de pelis ordenada por el nombe del director");
        ser.directoralf();
    }
    
}
