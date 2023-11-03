/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeextra2herencia;

import java.util.ArrayList;

/**
 *
 * @author camis
 */
public class EjeExtra2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<EdificioSC> edificio = new ArrayList();
        //edificios de oficina
        System.out.println("Cargando edificio de oficinas");
        EdificioSC eo = new EdificioDeOficinas();
        eo.cargaredificio();
        System.out.println("Cargando edificio de oficinas");
        EdificioSC eo1 = new EdificioDeOficinas();
        eo1.cargaredificio();
        edificio.add(eo);
        edificio.add(eo1);
        // polideportivos 
        System.out.println("Cargando polideportivo");
        EdificioSC eo2 = new Polideportivo();
        eo2.cargaredificio();
        System.out.println("Cargando polideportivo");
        EdificioSC eo3 = new Polideportivo();
        eo3.cargaredificio();
        edificio.add(eo2);
        edificio.add(eo3);
        for (EdificioSC edi : edificio) {
            edi.CalcularSuperficie();
            edi.CalcularVolumen();

        }

    }

}
