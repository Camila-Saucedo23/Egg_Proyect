/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author camis
 */
public class Alumno {
    private String nombrecompleto;
    private long DNI;
    private Integer cantvotos;

    public Alumno() {
        
    }

    public Alumno(String nombrecompleto, long DNI, Integer cantvotos) {
        this.nombrecompleto = nombrecompleto;
        this.DNI = DNI;
        this.cantvotos = cantvotos;
    }
    
 
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Integer getCantvotos() {
        return cantvotos;
    }

    public void setCantvotos(Integer cantvotos) {
        this.cantvotos = cantvotos;
    }

    @Override
    public String toString() {
        return "El/la " + nombrecompleto + ", DNI: " + DNI + " tiene " + cantvotos + " votos.";
    }

    

    
    
    }

   