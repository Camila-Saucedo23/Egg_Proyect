/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Comparadores.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
    Random r = new Random();

    public ArrayList<Alumno> ListaAlumnos() {

        System.out.println("Ingrese la cantidad de alumnos");
        int cant = leer.nextInt();
        String[] nombres = {"Pao", "Lau", "Fran", "Dorys", "Mario", "Fran2"};
        String[] apellidos = {"A", "B", "C", "D", "M", "F2","E","G","H"};

        for (int i = 0; i < cant; i++) {
            Alumno a1 = new Alumno((nombres[(int) (Math.random() * 6)]).concat(apellidos[(int) (Math.random() * 6)]), 0, 0);
            alumnos.add(a1);
        }
        LlenarDNI();

        return alumnos;
    }

    public void LlenarDNI() {

        for (Alumno aux : alumnos) {
            aux.setDNI(10000000 + r.nextInt(80000000));
        }
    }

    public void MostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void votacion() {
        int cont = 0;
        HashSet<String> votados1 = new HashSet();
        for (Alumno al : alumnos) {
            String var;
            Voto v1 = new Voto(al);
            do {
                var = alumnos.get((int) (Math.random() * alumnos.size())).getNombrecompleto();
                while (var.equals(al.getNombrecompleto())) {
                    var = alumnos.get((int) (Math.random() * alumnos.size())).getNombrecompleto();
                }
                if (!(votados1.contains(var))) {
                    for (Alumno alum : alumnos) {
                        if (alum.getNombrecompleto().equals(var)) {
                            alum.setCantvotos(alum.getCantvotos() + 1);
                            cont++;
                            votados1.add(var);
                            System.out.println(al.getNombrecompleto() + " voto a: " + var);
                            break;
                           
                        }
                    }
                }
                //System.out.println("Votados: " + votados1.size());
            } while (votados1.size() < 3);
            System.out.println("--------------------------");
            v1.setVotados(votados1);
            votados1.clear();
        }
        System.out.println("Recuento de votos........");
        System.out.println("Hay " + cont + " de votos");
        
    }
    
    public void Facilitadores(){
      Collections.sort(alumnos, Comparador.facilitadores);
     ArrayList<Alumno> Facilitadores = new ArrayList(); 
        for (int i = 0; i < 5; i++) {
            Facilitadores.add(alumnos.get(i));
        }
        System.out.println("De la lista estos son los 5 facilitadores: ");
        for (Alumno Fa : Facilitadores) {
            System.out.println(Fa);
        }
    }
}
