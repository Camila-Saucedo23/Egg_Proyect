/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeextra4relaciones;

import Objetos.Simulador;

/**
 *
 * @author camis
 */
public class EjeExtra4Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador s1 = new Simulador();
        s1.ListaAlumnos();
        System.out.println("Alumnos de la lista......");
        s1.MostrarAlumnos();
        System.out.println("votacion en proceso......");
        s1.votacion();
        System.out.println("votacion realizada con exito......");
        s1.MostrarAlumnos();
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        s1.Facilitadores();
    }

}
