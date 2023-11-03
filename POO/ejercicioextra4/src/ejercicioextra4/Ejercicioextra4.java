/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import objeto.NIF;
import service.NIFService;

/**
 *
 * @author camis
 */
public class Ejercicioextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ser = new NIFService();
        NIF code = ser.CrearNIF();
        ser.MostrarNIF(code);
    }
    
}
