/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2colecciones;

import Service.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author camis
 */
public class Ejercicio2Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AlumnoService ser = new AlumnoService();
       ser.CargarAlumno();
       //ser.notaFinal();
       ser.notafinaliterator();
       
    }
    
}
