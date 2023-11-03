/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5colecciones;

import Servicio.PaisesService;

/**
 *
 * @author camis
 */
public class Ejercicio5Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesService ser = new PaisesService();

        ser.Cargarpais();
        ser.Mostrarconjunto();
        ser.BorarPais();

    }
}
