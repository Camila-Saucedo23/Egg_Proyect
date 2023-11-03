/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejpersonamobra;

import objetos.DNI;
import objetos.Persona;

/**
 *
 * @author camis
 */
public class EjPersonaMObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni1 = new DNI();
        dni1.setCaracter("A");
        dni1.setNro(42690165);
        Persona p1 = new Persona();
        p1.setApellido("Saucedo");
        p1.setNombre("Camila");
        p1.setDNI(dni1);
        System.out.println( p1.toString());
    }
    
}
