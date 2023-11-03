/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import objeto.cancion;
import service.ServiceCancion;

/**
 *
 * @author camis
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceCancion ser = new ServiceCancion();
        cancion C1 = new cancion();
        System.out.println(ser.NombreCancion());
    }
    
}
