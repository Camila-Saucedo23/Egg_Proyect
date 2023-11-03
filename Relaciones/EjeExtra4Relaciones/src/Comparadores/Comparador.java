/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import Objetos.Alumno;
import java.util.Comparator;

/**
 *
 * @author camis
 */
public class Comparador {
    public static Comparator<Alumno> facilitadores = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getCantvotos().compareTo(t.getCantvotos());
        }
    };
}
    
     