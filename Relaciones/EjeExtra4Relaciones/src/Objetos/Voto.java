/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;


import java.util.HashSet;

/**
 *
 * @author camis
 */
public class Voto {
    private Alumno votante;
    private  HashSet<String> votados;

    public Voto() {
    }

    public Voto(Alumno votante) {
        this.votante = votante;
    }

    public Voto(Alumno votante,  HashSet<String> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public HashSet<String> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<String> votados) {
        this.votados = votados;
    }


    @Override
    public String toString() {
        return "El/la votante " + votante.getNombrecompleto() + ", voto a: " + votados ;
    }
    
}
